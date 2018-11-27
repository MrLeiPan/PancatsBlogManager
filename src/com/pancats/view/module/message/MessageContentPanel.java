package com.pancats.view.module.message;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JPanel;

import org.junit.Test;

import com.pancats.dao.IMessage;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * ���Թ������������
 * @author С����
 *
 */
public class MessageContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu leaveMenu=null;
	private MessageOperate leaveOperate=null;
	public MessageContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//��ʼ���˵���
		initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"���Թ���"};
		leaveMenu= new MessageMenu(new Dimension(0, 60));
		leaveMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, leaveMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	@Test
	public void initOperate() {
		Object[] columnNames = {"���","ip��ַ","����","��������","��������","״̬"};
		leaveOperate = new MessageOperate(new Dimension(0, 0));
		leaveOperate.setTitle("���Թ���");
		leaveOperate.setColumnNames(columnNames);
		IMessage ldao = DaoFactory.createMessage();
		try {
			leaveOperate.initData(ldao.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		add(BorderLayout.CENTER, leaveOperate.getOperate());
	}
		
}
