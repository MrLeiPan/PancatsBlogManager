package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Blog;
public interface IBlog {
	/**
	 * ͨ����Ų�ѯ������¼
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Blog findById(int id) throws SQLException;
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<Blog> findAll() throws SQLException;
}
