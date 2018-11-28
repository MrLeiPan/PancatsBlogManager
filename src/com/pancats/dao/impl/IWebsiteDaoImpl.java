package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pancats.dao.IWebsite;
import com.pancats.domain.Website;

public class IWebsiteDaoImpl implements IWebsite{
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	public IWebsiteDaoImpl(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public Website findById(int id) throws SQLException {
		String sql="select * from website where wd=?";
		Website website=null;
		ps=conn.prepareStatement(sql);
		res=ps.executeQuery();
		if(res.next()) {
			website = new Website();
			website.setWd(res.getInt("wd"));
			website.setKey(res.getString("key"));
			website.setValue(res.getString("value"));
		}
		res.close();
		ps.close();
		return website;
	}

	@Override
	public List<Website> findAll() throws SQLException{
		String sql="select * from website";
		List<Website> list = new ArrayList<>();
		st=conn.createStatement();
		res=st.executeQuery(sql);
		while(res.next()) {
			Website website = new Website();
			website.setWd(res.getInt("wd"));
			website.setKey(res.getString("key"));
			website.setValue(res.getString("value"));
			list.add(website);
		}
		res.close();
		st.close();
		return list;
	}

}
