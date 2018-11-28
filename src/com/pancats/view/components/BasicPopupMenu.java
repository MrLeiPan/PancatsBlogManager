package com.pancats.view.components;


import java.awt.Dimension;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class BasicPopupMenu extends JPopupMenu {
	private static final long serialVersionUID = 1L;
	private JMenuItem delete=null;//ɾ��
	private JMenuItem copy=null;
	public BasicPopupMenu() {
		initItem();
		setPopupSize(new Dimension(150, 70));
		
	}
	
	private void initItem() {
		copy = new JMenuItem("����");
		delete = new JMenuItem("ɾ�� ");
		this.add(delete);
		this.add(copy);
	}
	
	public JMenuItem getDeleItem() {
		return delete;
	}
	
}
