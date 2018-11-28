package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;

import com.pancats.dao.IBlog;
import com.pancats.dao.impl.IBlogDaoImpl;
import com.pancats.domain.Blog;
import com.pancats.util.JDBCDataBase;

public class IBlogDaoProxy implements IBlog{
	private IBlog iblog=null;
	private JDBCDataBase jdb=null;
	public IBlogDaoProxy() {
		jdb=new JDBCDataBase();
		iblog = new IBlogDaoImpl(jdb.getConn());
	}
	
	@Override
	public Blog findById(int id) {
		Blog blog = null;
		try {
			blog = iblog.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return blog;
	}

	@Override
	public List<Blog> findAll() {
		List<Blog> list =null;
		try {
			list = iblog.findAll();
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
