package com.pancats.view.components;


import java.awt.Dimension;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class BasicPopupMenu extends JPopupMenu {
	private static final long serialVersionUID = 1L;
	private JMenuItem delete=null;//É¾³ý
	private JMenuItem copy=null;
	public BasicPopupMenu() {
		initItem();
		setPopupSize(new Dimension(150, 70));
		
	}
	
	private void initItem() {
		copy = new JMenuItem("¸´ÖÆ");
		delete = new JMenuItem("É¾³ý ");
		this.add(delete);
		this.add(copy);
	}
	
	public JMenuItem getDeleItem() {
		return delete;
	}
	
}
