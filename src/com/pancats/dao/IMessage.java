package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;
import com.pancats.domain.Message;

public interface IMessage {
	/**
	 * ͨ����Ų�ѯ������¼
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	Message findById(int id) throws SQLException;
	/**
	 * ��ѯ���м�¼
	 * @return
	 */
	List<Message> findAll() throws SQLException;
}
