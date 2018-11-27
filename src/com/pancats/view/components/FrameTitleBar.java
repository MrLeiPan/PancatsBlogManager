package com.pancats.view.components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * ���������
 * @author С����
 *
 */
public class FrameTitleBar extends JLabel {
	private static final long serialVersionUID = 1L;
	private final Font FONT1=new Font("΢���ź�", Font.BOLD,20);
	private final Color FCOLOR1=Color.WHITE;
	public FrameTitleBar(Icon logo,String title) {
		super(title, logo, SwingConstants.LEFT);
		initTitleBar();
	}
	
	public FrameTitleBar(String title) {
		super(title);
		initTitleBar();
	}

	private void initTitleBar() {
		setFont(FONT1);
		setForeground(FCOLOR1);
	}
}
