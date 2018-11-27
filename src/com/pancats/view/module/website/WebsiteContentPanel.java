package com.pancats.view.module.website;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JPanel;

import com.pancats.dao.IWebsite;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.component.utlis.ContentMenu;
import com.pancats.view.component.utlis.ContentOperate;

/**
 * Website主内容面板
 * @author 小疯子
 *
 */
public class WebsiteContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu websiteMenu=null;
	private WebsiteOperate websiteOperate=null;
	public WebsiteContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//初始化菜单栏
		initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"网站管理"};
		websiteMenu= new WebsiteMenu(new Dimension(0, 60));
		websiteMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, websiteMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		Object[] columnNames = {"编号","名称","属性"};
		websiteOperate = new WebsiteOperate(new Dimension(0, 0));
		websiteOperate.setTitle("网站管理");
		websiteOperate.setColumnNames(columnNames);
		IWebsite wdao = DaoFactory.createWebsite();
		try {
			websiteOperate.initData(wdao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		add(BorderLayout.CENTER, websiteOperate.getOperate());
	}
		
}
