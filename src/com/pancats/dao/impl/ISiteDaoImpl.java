package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pancats.dao.ISite;
import com.pancats.domain.Site;

public class ISiteDaoImpl implements ISite{
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	public ISiteDaoImpl(Connection conn) {
		this.conn=conn;
	}
	@Override
	public Site findById(int id) throws SQLException {
		String sql="select * from site where sd=?";
		Site site=null;
		ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		res=ps.executeQuery();
		if(res.next()) {
			site = new Site();
			site.setSd(res.getInt("sd"));
			site.setKey(res.getString("key"));
			site.setValue(res.getString("value"));
		}
		res.close();
		ps.close();
		return site;
	}

	@Override
	public List<Site> findAll() throws SQLException {
		String sql="select * from site";
		List<Site> list = new ArrayList<>();
		st=conn.createStatement();
		res=st.executeQuery(sql);
		while(res.next()) {
			Site site = new Site();
			site.setSd(res.getInt("sd"));
			site.setKey(res.getString("key"));
			site.setValue(res.getString("value"));
			list.add(site);
		}
		res.close();
		st.close();
		return list;
	}

}
