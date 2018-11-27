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
		initMenu();//初始化菜单栏
		initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"用户"};
		userMenu= new UserMenu(new Dimension(0, 60));
		userMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, userMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		IUserDao udao = DaoFactory.createUserDao();
		Object[] columnNames= {"用户id","用户名","密码","邮箱"};
		userOperate = new UserOperate(new Dimension(0,0));
		userOperate.setTitle("用户管理");
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
