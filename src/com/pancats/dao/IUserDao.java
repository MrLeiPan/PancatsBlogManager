package com.pancats.dao;

import java.sql.SQLException;
import java.util.List;

import com.pancats.domain.User;

/**
 * 
 * @author 小疯子
 *
 */
public interface IUserDao {
	/**
	 * 查询所用用户
	 * @return
	 * User对象的List集合
	 * @throws SQLException 
	 */
	List<User> findAll() throws SQLException;
	/**
	 * 根据用户名和密码查询用户
	 * @return
	 * 返回一个User对象
	 */
	User findByNameByPassword(String name,String password) throws SQLException;
	/**
	 * 根据用户名查询用户
	 * @param name
	 * 用户名
	 * @return
	 * 返回一个User对象
	 */
	User findByName(String name) throws SQLException;
	/**
	 * 根据用户ud查询用户
	 * @param ud
	 * 用户ud(主键)
	 * @return
	 * 返回一个User对象
	 */
	User findById(int ud) throws SQLException;
	/**
	 * 根据指定的用户更新密码
	 * @param user
	 * @param newPassword
	 * @return
	 * true：修改成功反之失败
	 */
	Boolean doNameChangePassword(String name,String newPassword) throws SQLException;
	/**
	 * 根据用户名删除用户
	 * @param name
	 * @return
	 * true：删除成功反之失败
	 */
	Boolean doDeleteUser(String name) throws SQLException;
	/**
	 * 插入新的用户
	 * @param user
	 * @return
	 * true：插入成功反之失败
	 */
	Boolean doInsertUser(User user) throws SQLException;
}
