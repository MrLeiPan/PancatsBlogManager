package com.pancats.view.component.utlis;

import javax.swing.JButton;

/**
 * 功能菜单组
 * @author 小疯子
 *
 */
public interface MenuItems {
	
	
	/**
	 * 菜单
	 * @return
	 */
	JButton menu();
	
	/**
	 * 站点信息
	 */
	JButton websiteInfoItem();
	
	/**
	 * 博客管理
	 */
	JButton blogItem();
	
	/**
	 * 用户管理
	 */
	JButton usersItem();
	/**
	 * 日志管理
	 */
	JButton logItem();
	/**
	 * 留言管理
	 * @return
	 */
	JButton messageItem();
	
	/**
	 *网站管理
	 */
	JButton webItem();
	/**
	 * 系统主页
	 * @return
	 */
	JButton systemHomeItem();
}
