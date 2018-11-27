package com.pancats.view.module.website;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.ContentMenu;
import com.pancats.view.component.utlis.ContentOperate;

/**
 * Website���������
 * @author С����
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
		initMenu();//��ʼ���˵���
		//initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"��վ����"};
		websiteMenu= new WebsiteMenu(new Dimension(0, 60));
		websiteMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, websiteMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	private void initOperate() {
		websiteOperate = new WebsiteOperate(new Dimension(0, 0));
		add(BorderLayout.CENTER, websiteOperate.getOperate());
	}
		
}
