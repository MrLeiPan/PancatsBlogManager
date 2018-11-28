package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;

import com.pancats.dao.IMessage;
import com.pancats.dao.impl.IMessageDaoImpl;
import com.pancats.domain.Blog;
import com.pancats.domain.Message;
import com.pancats.util.JDBCDataBase;

public class IMessageDaoProxy implements IMessage{
	private IMessage ileave=null;
	private JDBCDataBase jdb=null;
	public IMessageDaoProxy() {
		jdb = new JDBCDataBase();
		ileave=new IMessageDaoImpl(jdb.getConn());
	}
	@Override
	public Message findById(int id) {
		Message leave = null;
		try {
			leave = ileave.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return leave;
	}

	@Override
	public List<Message> findAll() {
		List<Message> list =null;
		try {
			list=ileave.findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
