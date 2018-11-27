package com.pancats.view.module.blog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.ContentMenu;
import com.pancats.view.component.utlis.ContentOperate;

/**
 * 博客管理主内容面板
 * @author 小疯子
 *
 */
public class BlogContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu blogMenu=null;
	private BlogOperate blogOperate=null;
	public BlogContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//初始化菜单栏
		//initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"博客管理"};
		blogMenu= new BlogMenu(new Dimension(0, 60));
		blogMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, blogMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		blogOperate = new BlogOperate(new Dimension(0, 0));
		add(BorderLayout.CENTER, blogOperate.getOperate());
	}
		
}
