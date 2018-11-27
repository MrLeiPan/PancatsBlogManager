package com.pancats.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.pancats.dao.IUserDao;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.domain.User;

public class UserDaoTest {
	IUserDao dao = DaoFactory.createUserDao();
	
	
	@Test
	public void findAll() {
		try {
			List<User> ulist = dao.findAll();
			for (User user : ulist) {
				System.out.println(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void findById() {
		try {
			 User u = dao.findById(2);
			 if(u==null) {
				 System.out.println("û�в�ѯ�����û�");
			 }else {
				 System.out.println(u);
			 }

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void doInsert() {
		User u=new User();
		u.setUd(2);
		u.setName("zhangsan");
		u.setPassword("a123456");
		u.setMail("lp5576@163.com");
		try {
			 boolean b= dao.doInsertUser(u);
			 if(b) {
				 System.out.println("��ӳɹ�");
			 }else {
				 System.out.println("���ʧ��");
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void doDelete() {
		try {
			 boolean b= dao.doDeleteUser("zhangsan");
			 if(b) {
				 System.out.println("ɾ���ɹ�");
			 }else {
				 System.out.println("ɾ��ʧ��");
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void doUpdate() {
		try {
			 boolean b = dao.doNameChangePassword("zhangsan", "aa123456");
			 if(b) {
				 System.out.println("���³ɹ�");
			 }else {
				 System.out.println("����ʧ��");
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
