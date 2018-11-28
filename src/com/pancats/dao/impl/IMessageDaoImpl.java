package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pancats.dao.IMessage;
import com.pancats.domain.Message;

public class IMessageDaoImpl implements IMessage{
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	public IMessageDaoImpl(Connection conn) {
		this.conn=conn;
	}
	@Override
	public Message findById(int id) throws SQLException {
		String sql ="select * from message where md=?";
		Message leave=null;
		ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		res=ps.executeQuery();
		if(res.next()) {
			leave=new Message();
			leave.setMd(res.getInt("md"));
			leave.setIp(res.getString("ip"));
			leave.setMail(res.getString("mail"));
			leave.setStatus(res.getInt("status"));
			leave.setLeavedate(res.getDate("leavedate"));
			leave.setContent(res.getString("content"));
		}
		res.close();
		ps.close();
		return leave;
	}

	@Override
	public List<Message> findAll() throws SQLException {
		String sql="select * from message";
		List<Message> list =new ArrayList<>();
		st=conn.createStatement();
		res=st.executeQuery(sql);
		while(res.next()) {
			Message leave=new Message();
			leave.setMd(res.getInt("md"));
			leave.setIp(res.getString("ip"));
			leave.setMail(res.getString("mail"));
			leave.setStatus(res.getInt("status"));
			leave.setLeavedate(res.getDate("leavedate"));
			leave.setContent(res.getString("content"));
			list.add(leave);
		}
		res.close();
		st.close();
		return list;
	}

}
