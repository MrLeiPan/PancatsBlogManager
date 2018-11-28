package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;

import com.pancats.dao.IWebsite;
import com.pancats.dao.impl.IWebsiteDaoImpl;
import com.pancats.domain.Website;
import com.pancats.util.JDBCDataBase;

public class IWebsiteDaoProxy implements IWebsite{
	private IWebsite iw=null;
	private JDBCDataBase jdb=null;
	public IWebsiteDaoProxy() {
		jdb=new JDBCDataBase();
		iw = new IWebsiteDaoImpl(jdb.getConn());
	}
	@Override
	public Website findById(int id) {
		Website website=null;
		try {
			website=iw.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return website;
	}

	@Override
	public List<Website> findAll() {
		List<Website> list=null;
		try {
			list = iw.findAll();
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
