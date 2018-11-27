package com.pancats.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.pancats.dao.IUserDao;
import com.pancats.domain.User;

public class IUserDaoImpl implements IUserDao {
	private Connection conn=null;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private Statement st=null;
	public IUserDaoImpl(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public List<User> findAll() throws SQLException {
		List<User> ulist=new ArrayList<>();
		User u=null;
		String sql="select * from user";
		st = conn.createStatement();
		res=st.executeQuery(sql);
		while(res.next()) {
			u=new User();
			u.setUd(res.getInt("ud"));
			u.setName(res.getString("name"));
			u.setPassword(res.getString("password"));
			u.setMail(res.getString("mail"));
			ulist.add(u);
		}
		res.close();
		st.close();
		return ulist;
	}

	@Override
	public User findByNameByPassword(String name,String password) throws SQLException {
		User u=null;
		String sql="select * from user where name=? and password=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		res = ps.executeQuery();
		u = createUser(res,u);
		res.close();
		ps.close();
		return u;
	}

	@Override
	public User findByName(String name) throws SQLException {
		User u=null;
		String sql="select * from user where name=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		res=ps.executeQuery();
		u = createUser(res,u);
		res.close();
		ps.close();
		return u;
	}

	@Override
	public User findById(int ud) throws SQLException {
		User u=null;
		String sql="select * from user where ud=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1, ud);
		res=ps.executeQuery();
		u = createUser(res,u);
		res.close();
		ps.close();
		return u;
	}

	@Override
	public Boolean doNameChangePassword(String name, String newPassword) throws SQLException {
		String sql="update user set password=? where name=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,newPassword);
		ps.setString(2,name);
		int ures = ps.executeUpdate();
		ps.close();
		if(ures>0) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean doDeleteUser(String name) throws SQLException {
		String sql="delete from user where name=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		int ures = ps.executeUpdate();
		ps.close();
		if(ures>0) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean doInsertUser(User user) throws SQLException {
		String sql="insert into user values(?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setInt(1, user.getUd());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getMail());
		int ures = ps.executeUpdate();
		ps.close();
		if(ures>0) {
			return true;
		}
		return false;
	}

	private User createUser(ResultSet res,User u) throws SQLException {
		if(res.next()) {
			u=new User();
			u.setUd(res.getInt("ud"));
			u.setName(res.getString("name"));
			u.setPassword(res.getString("password"));
			u.setMail(res.getString("mail"));
		}
		return u;
	}
}
