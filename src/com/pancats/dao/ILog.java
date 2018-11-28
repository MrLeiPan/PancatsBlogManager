package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;

import com.pancats.domain.Log;


public interface ILog {
	/**
	 * ͨ����Ų�ѯ������¼
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Log findById(int id) throws SQLException;
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<Log> findAll() throws SQLException;
}
