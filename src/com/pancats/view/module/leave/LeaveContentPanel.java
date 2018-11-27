package com.pancats.view.module.leave;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * ���Թ������������
 * @author С����
 *
 */
public class LeaveContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private ContentMenu leaveMenu=null;
	private LeaveOperate leaveOperate=null;
	public LeaveContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initMenu();//��ʼ���˵���
		//initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ���˵���
	 */
	private void initMenu() {
		String [] menuItem= {"���Թ���"};
		leaveMenu= new LeaveMenu(new Dimension(0, 60));
		leaveMenu.addMenuItem(menuItem);
		add(BorderLayout.NORTH, leaveMenu.getMenuPanel());
	}
	
	/**
	 * ��ʼ������̨���
	 */
	private void initOperate() {
		leaveOperate = new LeaveOperate(new Dimension(0, 0));
		add(BorderLayout.CENTER, leaveOperate.getOperate());
	}
		
}
