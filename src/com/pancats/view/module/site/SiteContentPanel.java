package com.pancats.view.module.site;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JPanel;

import com.pancats.dao.ISite;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.component.utlis.ContentMenu;
import com.pancats.view.component.utlis.ContentOperate;

/**
 * 站点信息主内容面板
 * @author 小疯子
 *
 */
public class SiteContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu siteMenu=null;
	private SiteOperate siteOperate=null;
	public SiteContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//初始化菜单栏
		initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化菜单栏
	 */
	private void initMenu() {
		String [] menuItem= {"站点信息"};
		siteMenu= new SiteMenu(new Dimension(0, 60));
		siteMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, siteMenu.getMenuPanel());
	}
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		Object[] columnNames = {"编号","名称","属性"};
		siteOperate = new SiteOperate(new Dimension(0, 0));
		siteOperate.setTitle("站点信息");
		siteOperate.setColumnNames(columnNames);
		ISite sdao = DaoFactory.createSite();
		try {
			siteOperate.initData(sdao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		add(BorderLayout.CENTER, siteOperate.getOperate());
	}
		
}
