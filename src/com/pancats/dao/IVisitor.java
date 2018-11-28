package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Visitor;

public interface IVisitor {
	/**
	 * 通过编号查询单条记录
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Visitor findById(int id) throws SQLException;
	/**
	 * 查询所有记录
	 * @return
	 */
	List<Visitor> findAll() throws SQLException;
}
