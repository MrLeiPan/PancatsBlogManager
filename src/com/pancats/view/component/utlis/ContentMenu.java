package com.pancats.view.component.utlis;

import javax.swing.JPanel;
/**
 * ���ݲ˵��ӿ�
 * @author С����
 *
 */
public interface ContentMenu {
	
	/**
	 * ��Ӳ˵���
	 * @param menuItem
	 */
	void addMenuItem(String[] menuItem);
	
	/**
	 * ��ȡ���ݲ˵����
	 * @return
	 */
	JPanel getMenuPanel();
}
