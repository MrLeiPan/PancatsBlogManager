package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Website;
public interface IWebsite {
	/**
	 * 通过编号查询单条记录
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Website findById(int id) throws SQLException;
	/**
	 * 查询所有记录
	 * @return
	 */
	List<Website> findAll() throws SQLException;
}
