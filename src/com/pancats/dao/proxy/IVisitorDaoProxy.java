package com.pancats.dao.proxy;

import java.sql.SQLException;
import java.util.List;
import com.pancats.dao.IVisitor;
import com.pancats.dao.impl.IVisitorDaoImpl;
import com.pancats.domain.Visitor;
import com.pancats.util.JDBCDataBase;

public class IVisitorDaoProxy implements IVisitor{
	private IVisitor iv=null;
	private JDBCDataBase jdb=null;

	public IVisitorDaoProxy() {
		jdb = new JDBCDataBase();
		iv = new IVisitorDaoImpl(jdb.getConn());
	}
	@Override
	public Visitor findById(int id) {
		Visitor visitor=null;
		try {
			visitor = iv.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jdb.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return visitor;
	}

	@Override
	public List<Visitor> findAll() {
		List<Visitor> list=null;
		try {
			list = iv.findAll();
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
