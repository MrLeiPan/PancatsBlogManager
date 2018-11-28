package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Visitor;

public interface IVisitor {
	/**
	 * ͨ����Ų�ѯ������¼
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Visitor findById(int id) throws SQLException;
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<Visitor> findAll() throws SQLException;
}
