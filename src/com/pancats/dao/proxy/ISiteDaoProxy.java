package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;

import com.pancats.dao.ISite;
import com.pancats.dao.impl.ISiteDaoImpl;
import com.pancats.domain.Site;
import com.pancats.util.JDBCDataBase;

public class ISiteDaoProxy implements ISite{
	private ISite isite=null;
	private JDBCDataBase jdb=null;
	public ISiteDaoProxy() {
		jdb=new JDBCDataBase();
		isite = new ISiteDaoImpl(jdb.getConn());
	}
	@Override
	public Site findById(int id) {
		Site site =null;
		try {
			site = isite.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return site;
	}

	@Override
	public List<Site> findAll() {
		List<Site> list=null;
		try {
			list = isite.findAll();
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
