package com.pancats.view.module.leave;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * 留言管理主内容面板
 * @author 小疯子
 *
 */
public class LeaveContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu leaveMenu=null;
	private LeaveOperate leaveOperate=null;
	public LeaveContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//初始化菜单栏
		//initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"留言管理"};
		leaveMenu= new LeaveMenu(new Dimension(0, 60));
		leaveMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, leaveMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		leaveOperate = new LeaveOperate(new Dimension(0, 0));
		add(BorderLayout.CENTER, leaveOperate.getOperate());
	}
		
}
