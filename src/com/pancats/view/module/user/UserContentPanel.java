package com.pancats.view.module.user;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JPanel;

import com.pancats.dao.IUserDao;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.component.utlis.ContentMenu;

public class UserContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu userMenu=null;
	private UserOperate userOperate=null;
	
	public UserContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//��ʼ���˵���
		initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"�û�"};
		userMenu= new UserMenu(new Dimension(0, 60));
		userMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, userMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	private void initOperate() {
		IUserDao udao = DaoFactory.createUserDao();
		Object[] columnNames= {"�û�id","�û���","����","����"};
		userOperate = new UserOperate(new Dimension(0,0));
		userOperate.setTitle("�û�����");
		userOperate.setColumnNames(columnNames);
		try {
			userOperate.initData(udao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		userOperate.registerListener();
		add(BorderLayout.CENTER, userOperate.getOperate());
	}
}
