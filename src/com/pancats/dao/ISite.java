package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Site;
public interface ISite {
	/**
	 * ͨ����Ų�ѯ������¼
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Site findById(int id) throws SQLException;
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<Site> findAll() throws SQLException;
}
