package com.pancats.view.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class SystemMenu extends JPopupMenu{
	private static final long serialVersionUID = 1L;
	private JMenuItem aboutMe=null;
	private JMenuItem sytemSet=null;
	private JMenuItem triggerUser=null;
	private JMenuItem exit=null;
	private GridLayout grid=null;
	private Font font = new Font("΢���ź�",Font.PLAIN,18);
	public SystemMenu() {
		grid=new GridLayout(15, 1);
		setLayout(grid);
		setBackground(new Color(0,0,0,100));
		setPopupSize(new Dimension(300, 600));
		initItem();
	}

	
	private void initItem() {
		aboutMe=new JMenuItem("������");
		aboutMe.setFont(font);
		aboutMe.setForeground(Color.WHITE);
		aboutMe.setBackground(null);
		sytemSet=new JMenuItem("����");
		sytemSet.setForeground(Color.WHITE);
		sytemSet.setBackground(null);
		triggerUser=new JMenuItem("�л��û�");
		triggerUser.setForeground(Color.WHITE);
		triggerUser.setBackground(null);
		exit=new JMenuItem("�˳����");
		exit.setForeground(Color.WHITE);
		exit.setBackground(null);
		add(aboutMe);
		add(sytemSet);
		add(triggerUser);
		add(exit);
	}
}
