package com.pancats.view.module.message;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JPanel;

import org.junit.Test;

import com.pancats.dao.IMessage;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * 留言管理主内容面板
 * @author 小疯子
 *
 */
public class MessageContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu leaveMenu=null;
	private MessageOperate leaveOperate=null;
	public MessageContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//初始化菜单栏
		initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"留言管理"};
		leaveMenu= new MessageMenu(new Dimension(0, 60));
		leaveMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, leaveMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	@Test
	public void initOperate() {
		Object[] columnNames = {"编号","ip地址","邮箱","留言日期","留言内容","状态"};
		leaveOperate = new MessageOperate(new Dimension(0, 0));
		leaveOperate.setTitle("留言管理");
		leaveOperate.setColumnNames(columnNames);
		IMessage ldao = DaoFactory.createMessage();
		try {
			leaveOperate.initData(ldao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		add(BorderLayout.CENTER, leaveOperate.getOperate());
	}
		
}
