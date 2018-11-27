package com.pancats.view.module.log;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * 日志管理主内容面板
 * @author 小疯子
 *
 */
public class LogContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu logMenu=null;
	private LogOperate logOperate=null;
	public LogContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//初始化菜单栏
		//initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"日志管理"};
		logMenu= new LogMenu(new Dimension(0, 60));
		logMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, logMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		logOperate = new LogOperate(new Dimension(0, 0));
		add(BorderLayout.CENTER, logOperate.getOperate());
	}
		
}
