package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pancats.dao.IVisitor;
import com.pancats.domain.Visitor;

public class IVisitorDaoImpl implements IVisitor{
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	
	public IVisitorDaoImpl(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public Visitor findById(int id) throws SQLException {
		String sql="select * from visitor where td=?";
		Visitor visitor=null;
		ps=conn.prepareStatement(sql);
		res=ps.executeQuery();
		if(res.next()) {
			visitor=new Visitor();
			visitor.setTd(res.getString("td"));
			visitor.setIp(res.getString("ip"));
			visitor.setVisitordate(res.getDate("visitordate"));
			visitor.setPv(res.getInt("pv"));
			visitor.setStatus(res.getInt("status"));
		}
		res.close();
		ps.close();
		return visitor;
	}

	@Override
	public List<Visitor> findAll() throws SQLException{
		String sql="select * from visitor";
		List<Visitor> list = new ArrayList<>();
		st=conn.createStatement();
		res = st.executeQuery(sql);
		while(res.next()) {
			Visitor visitor=new Visitor();
			visitor.setTd(res.getString("td"));
			visitor.setIp(res.getString("ip"));
			visitor.setVisitordate(res.getDate("visitordate"));
			visitor.setPv(res.getInt("pv"));
			visitor.setStatus(res.getInt("status"));
			list.add(visitor);
		}
		res.close();
		st.close();
		return list;
	}

}
