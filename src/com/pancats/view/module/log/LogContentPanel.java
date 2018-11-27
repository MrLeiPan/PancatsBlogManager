package com.pancats.view.module.log;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JPanel;

import org.junit.Test;

import com.pancats.dao.ILog;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * ��־�������������
 * @author С����
 *
 */
public class LogContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu logMenu=null;
	private LogOperate logOperate=null;
	public LogContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//��ʼ���˵���
		initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"��־����"};
		logMenu= new LogMenu(new Dimension(0, 60));
		logMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, logMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	@Test
	public void initOperate() {
		Object[] columnNames = {"���","�¼�","��������","������","��־����"};
		logOperate = new LogOperate(new Dimension(0, 0));
		logOperate.setTitle("��־����");
		logOperate.setColumnNames(columnNames);
		ILog ldao = DaoFactory.createLog();
		try {
			logOperate.initData(ldao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		add(BorderLayout.CENTER, logOperate.getOperate());
	}
		
}
