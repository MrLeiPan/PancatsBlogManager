package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;

import com.pancats.dao.IUserDao;
import com.pancats.dao.impl.IUserDaoImpl;
import com.pancats.domain.User;
import com.pancats.util.JDBCDataBase;

public class IUserDaoProxy implements IUserDao{
	private IUserDao dao=null;
	private JDBCDataBase database=null;
	public IUserDaoProxy() {
		database=new JDBCDataBase();
		dao=new IUserDaoImpl(database.getConn());
	}
	@Override
	public List<User> findAll() throws SQLException {
		List<User> ulist=null;
		ulist = dao.findAll();
		database.close();
		return ulist;
	}

	@Override
	public User findByNameByPassword(String name, String password) throws SQLException {
		User u=null;
		u=dao.findByNameByPassword(name, password);
		database.close();
		return u;
	}

	@Override
	public User findByName(String name) throws SQLException {
		User u=null;
		u=dao.findByName(name);
		database.close();
		return u;
	}

	@Override
	public User findById(int ud) throws SQLException {
		User u=null;
		u=dao.findById(ud);
		database.close();
		return u;
	}

	@Override
	public Boolean doNameChangePassword(String name, String newPassword) throws SQLException {
		boolean flag=false;
		if(dao.findByName(name)!=null)
			flag=dao.doNameChangePassword(name,newPassword);
		database.close();
		return flag;
	}

	@Override
	public Boolean doDeleteUser(String name) throws SQLException {
		boolean flag=false;
		if(dao.findByName(name)!=null)
			flag=dao.doDeleteUser(name);
		database.close();
		return flag;
	}

	@Override
	public Boolean doInsertUser(User user) throws SQLException {
		boolean flag=false;
		if(dao.findById(user.getUd())==null)
			flag=dao.doInsertUser(user);
		database.close();
		return flag;
	}

}
