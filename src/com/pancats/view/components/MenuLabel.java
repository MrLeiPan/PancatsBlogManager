package com.pancats.view.components;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/**
 * 
 * @author С����
 *
 */
public class MenuLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayout=null;
	private JLabel icontext=null;//ͼ�겿��
	private JLabel labeldata=null;//���ݲ���
	public MenuLabel(Dimension ds) {
		setPreferredSize(ds);
		borderLayout=new BorderLayout();
		setLayout(borderLayout);
	}
	
	/**
	 * ��ʼ���˵�
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
