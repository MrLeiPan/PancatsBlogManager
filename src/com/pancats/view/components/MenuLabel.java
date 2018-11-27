package com.pancats.view.components;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/**
 * 
 * @author 小疯子
 *
 */
public class MenuLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayout=null;
	private JLabel icontext=null;//图标部分
	private JLabel labeldata=null;//数据部分
	public MenuLabel(Dimension ds) {
		setPreferredSize(ds);
		borderLayout=new BorderLayout();
		setLayout(borderLayout);
	}
	
	/**
	 * 初始化菜单
	 * @param icon
	 * @param text
	 * @param data
	 * @return 
	 */
	public void initMenuLabel(Icon icon,String text,String data) {
		icontext = new JLabel(text, icon,SwingConstants.CENTER);
		icontext.setHorizontalTextPosition(SwingConstants.CENTER);
		icontext.setVerticalTextPosition(SwingConstants.BOTTOM);
		labeldata=new JLabel(data,SwingConstants.CENTER);
		add(BorderLayout.NORTH,icontext);
		add(labeldata);
	}
	
	public void initMenuLabel(Icon icon,String text) {
		icontext = new JLabel(text, icon,SwingConstants.CENTER);
		icontext.setHorizontalTextPosition(SwingConstants.CENTER);
		icontext.setVerticalTextPosition(SwingConstants.BOTTOM);
		add(icontext);
	}
	
}
