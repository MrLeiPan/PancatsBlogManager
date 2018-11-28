package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pancats.dao.IBlog;
import com.pancats.domain.Blog;

public class IBlogDaoImpl implements IBlog{
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	
	public IBlogDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public Blog findById(int id) throws SQLException {
		String sql="select * from blog where bd=?";
		Blog blog=null;
		ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		res=ps.executeQuery();
		if(res.next()) {
			blog=new Blog();
			blog.setBd(res.getInt("bd"));
			blog.setTitle(res.getString("title"));
			blog.setAuthor(res.getString("author"));
			blog.setModifydate(res.getDate("modifydate"));
			blog.setPublishdate(res.getDate("publishdate"));
			blog.setPv(res.getInt("pv"));
			blog.setStatus(res.getInt("status"));
		}
		res.close();
		ps.close();
		return blog;
	}

	@Override
	public List<Blog> findAll() throws SQLException {
		String sql="select * from blog";
		List<Blog> list = new ArrayList<>();
		st = conn.createStatement();
		res = st.executeQuery(sql);
		while(res.next()) {
			Blog blog=new Blog();
			blog.setBd(res.getInt("bd"));
			blog.setTitle(res.getString("title"));
			blog.setAuthor(res.getString("author"));
			blog.setModifydate(res.getDate("modifydate"));
			blog.setPublishdate(res.getDate("publishdate"));
			blog.setPv(res.getInt("pv"));
			blog.setStatus(res.getInt("status"));
			list.add(blog);
		}
		res.close();
		st.close();
		return list;
	}

}
