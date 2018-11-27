package com.pancats.view.module.blog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JPanel;

import com.pancats.dao.IBlog;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.domain.Blog;
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
		initOperate();//��ʼ������̨���
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
		Object[] columnNames = {"���","���±���","����","��������","�޸�����","�����","״̬"};
		blogOperate = new BlogOperate(new Dimension(0, 0));
		blogOperate.setTitle("���͹���");
		blogOperate.setColumnNames(columnNames);
		IBlog bdao = DaoFactory.createBlogDao();
		try {
			blogOperate.initData(bdao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		add(BorderLayout.CENTER, blogOperate.getOperate());
	}
		
}
