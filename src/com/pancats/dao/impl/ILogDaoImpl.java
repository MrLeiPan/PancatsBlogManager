package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pancats.dao.ILog;
import com.pancats.domain.Log;

public class ILogDaoImpl implements ILog{
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	public ILogDaoImpl(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public Log findById(int id) throws SQLException {
		String sql="select * from log ld=? ";
		Log log=null;
		ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		res=ps.executeQuery();
		if(res.next()) {
			log = new Log();
			log.setLd(res.getInt("ld"));
			log.setTitle(res.getString("title"));
			log.setHappendate(res.getDate("happendate"));
			log.setTrigger(res.getString("trigger"));
			log.setType(res.getString("type"));
		}
		res.close();
		ps.close();
		return log;
	}

	@Override
	public List<Log> findAll() throws SQLException {
		String sql="select * from log";
		List<Log> list = new ArrayList<>();
		st=conn.createStatement();
		res=st.executeQuery(sql);
		while(res.next()) {
			Log log = new Log();
			log.setLd(res.getInt("ld"));
			log.setTitle(res.getString("title"));
			log.setHappendate(res.getDate("happendate"));
			log.setTrigger(res.getString("trigger"));
			log.setType(res.getString("type"));
			list.add(log);
		}
		res.close();
		st.close();
		return list;
	}

}
