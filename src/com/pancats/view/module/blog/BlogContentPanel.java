package com.pancats.view.module.blog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.ContentMenu;
import com.pancats.view.component.utlis.ContentOperate;

/**
 * ���͹������������
 * @author С����
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
		initMenu();//��ʼ���˵���
		//initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"���͹���"};
		blogMenu= new BlogMenu(new Dimension(0, 60));
		blogMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, blogMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	private void initOperate() {
		blogOperate = new BlogOperate(new Dimension(0, 0));
		add(BorderLayout.CENTER, blogOperate.getOperate());
	}
		
}
