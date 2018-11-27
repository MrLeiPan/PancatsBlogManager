package com.pancats.view.component.utlis;

import javax.swing.JPanel;
/**
 * 内容菜单接口
 * @author 小疯子
 *
 */
public interface ContentMenu {
	
	/**
	 * 添加菜单项
	 * @param menuItem
	 */
	void addMenuItem(String[] menuItem);
	
	/**
	 * 获取内容菜单面板
	 * @return
	 */
	JPanel getMenuPanel();
}
