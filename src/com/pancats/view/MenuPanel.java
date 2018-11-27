package com.pancats.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.MenuItems;
import com.pancats.view.component.utlis.MenuItemsImpl;
import com.pancats.view.components.RButton;
import com.pancats.view.event.BlogListener;
import com.pancats.view.event.MenuChageListener;
import com.pancats.view.event.WebsiteListener;

public class MenuPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private MenuItems mitem=null;//��ȡ�˵�����
	private final Font FONT =new Font("����ϸ��",Font.PLAIN,18);
	private ContentPanel contentPanel=null;
	private List<JButton> blist=null;
	public MenuPanel(Dimension d,ContentPanel contentPanel){
		mitem=new MenuItemsImpl();
		blist=new ArrayList<JButton>();
		setBackground(new Color(36,142,194));
		setLayout(null);
		this.contentPanel=contentPanel;
		initPanel();
		setPreferredSize(d);
	}
	private void initPanel() {
		systemHomeItem();
		websiteInfoItem();
		menu();
		blogItem();
		usersItem();
		logItem();
		messageItem();
		webItem();
		registerListener();
	}
	/**
	 * ϵͳ����
	 */
	private void menu() {
		mitem = new MenuItemsImpl();
		JButton menu = mitem.menu();
		blist.add(menu);
		menu.setBounds(30, 30, 235, 45);
		menu.setFont(FONT);
		add(menu);
	}
	
	/**
	 * ϵͳ��ҳ
	 */
	
	private void systemHomeItem() {
		JButton systemHome = mitem.systemHomeItem();
		blist.add(systemHome);
		systemHome.setBounds(0, 100, 300, 45);
		((RButton)systemHome).setBorderStyle(Color.BLACK, Color.WHITE);
		systemHome.setFont(FONT);
		add(systemHome);
	}
	
	/**
	 * վ����Ϣ
	 */
	private void websiteInfoItem() {
		JButton websiteInfoItem = mitem.websiteInfoItem();
		blist.add(websiteInfoItem);
		websiteInfoItem.setBounds(0, 460, 300, 45);
		websiteInfoItem.setFont(FONT);
		add(websiteInfoItem);
	}
	/**
	 * ���͹���
	 */
	private void blogItem() {
		JButton blogItem = mitem.blogItem();
		blist.add(blogItem);
		blogItem.setBounds(0, 160, 300, 45);
		blogItem.setFont(FONT);
		add(blogItem);
	}
	
	/**
	 * �û�����
	 */
	private void usersItem() {
		JButton usersItem = mitem.usersItem();
		blist.add(usersItem);
		usersItem.setBounds(0, 220, 300, 45);
		usersItem.setFont(FONT);
		add(usersItem);
	}
	
	/**
	 * ��־����
	 */
	private void logItem() {
		JButton logItem = mitem.logItem();
		blist.add(logItem);
		logItem.setBounds(0, 280, 300, 45);
		logItem.setFont(FONT);
		add(logItem);
	}
	
	private void messageItem() {
		JButton messageItem = mitem.messageItem();
		blist.add(messageItem);
		messageItem.setBounds(0, 340, 300, 45);
		messageItem.setFont(FONT);
		add(messageItem);
	}
	
	/**
	 *��վ����
	 */
	private void webItem() {
		JButton webItem = mitem.webItem();
		blist.add(webItem);
		webItem.setBounds(0, 400, 300, 45);
		webItem.setFont(FONT);
		add(webItem);
	}
	/**
	 * �˵�ע�������
	 */
	private void registerListener() {
		for(JButton bt:blist) {
			bt.addActionListener(new MenuChageListener(contentPanel.getCard(), contentPanel, blist));
		}
	}
	
}
