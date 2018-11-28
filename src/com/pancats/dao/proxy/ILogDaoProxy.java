package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;

import com.pancats.dao.ILog;
import com.pancats.dao.impl.ILogDaoImpl;
import com.pancats.domain.Log;
import com.pancats.util.JDBCDataBase;

public class ILogDaoProxy implements ILog{
	private ILog ilog=null;
	private JDBCDataBase jdb=null;
	public ILogDaoProxy() {
		jdb=new JDBCDataBase();
		ilog=new ILogDaoImpl(jdb.getConn());
	}
	@Override
	public Log findById(int id) {
		Log log=null;
		try {
			log = ilog.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return log;
	}

	@Override
	public List<Log> findAll() {
		List<Log> list=null;
		try {
			list = ilog.findAll();
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
