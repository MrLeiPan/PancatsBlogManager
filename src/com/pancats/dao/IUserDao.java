package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;

import com.pancats.domain.User;

/**
 * 
 * @author С����
 *
 */
public interface IUserDao {
	/**
	 * ��ѯ�����û�
	 * @return
	 * User�����List����
	 * @throws SQLException 
	 */
	List<User> findAll() throws SQLException;
	/**
	 * �����û����������ѯ�û�
	 * @return
	 * ����һ��User����
	 */
	User findByNameByPassword(String name,String password) throws SQLException;
	/**
	 * �����û�����ѯ�û�
	 * @param name
	 * �û���
	 * @return
	 * ����һ��User����
	 */
	User findByName(String name) throws SQLException;
	/**
	 * �����û�ud��ѯ�û�
	 * @param ud
	 * �û�ud(����)
	 * @return
	 * ����һ��User����
	 */
	User findById(int ud) throws SQLException;
	/**
	 * ����ָ�����û���������
	 * @param user
	 * @param newPassword
	 * @return
	 * true���޸ĳɹ���֮ʧ��
	 */
	Boolean doNameChangePassword(String name,String newPassword) throws SQLException;
	/**
	 * �����û���ɾ���û�
	 * @param name
	 * @return
	 * true��ɾ���ɹ���֮ʧ��
	 */
	Boolean doDeleteUser(String name) throws SQLException;
	/**
	 * �����µ��û�
	 * @param user
	 * @return
	 * true������ɹ���֮ʧ��
	 */
	Boolean doInsertUser(User user) throws SQLException;
}
