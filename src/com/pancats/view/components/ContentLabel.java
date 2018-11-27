package com.pancats.view.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ContentLabel extends JLabel{
	private static final long serialVersionUID = 1L;
	private GridLayout grid = null;
	private FlowLayout flow=null;
	public ContentLabel(int rows,int cols) {
		grid = new GridLayout(rows, cols);
		grid.setHgap(10);
		grid.setVgap(10);
		setLayout(grid);
		setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
	}
	
	public ContentLabel() {
		flow = new FlowLayout();
		flow.setHgap(10);
		flow.setVgap(10);
		flow.setAlignment(SwingConstants.LEADING);
		setLayout(flow);
	}
	
	public void addMenuItem(MenuLabel[] menus) {
		for(int i=0;i<menus.length;i++) {
			add(menus[i]);
		}
	}
}
