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
 * վ����Ϣ���������
 * @author С����
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
		initMenu();//��ʼ���˵���
		initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"վ����Ϣ"};
		siteMenu= new SiteMenu(new Dimension(0, 60));
		siteMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, siteMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	private void initOperate() {
		Object[] columnNames = {"���","����","����"};
		siteOperate = new SiteOperate(new Dimension(0, 0));
		siteOperate.setTitle("վ����Ϣ");
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
