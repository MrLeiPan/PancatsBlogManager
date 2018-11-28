package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Website;
public interface IWebsite {
	/**
	 * ͨ����Ų�ѯ������¼
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Website findById(int id) throws SQLException;
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<Website> findAll() throws SQLException;
}
