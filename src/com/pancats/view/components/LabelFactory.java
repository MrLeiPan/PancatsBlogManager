package com.pancats.view.components;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class LabelFactory {
	/**
	 * б�߱�ǩ
	 * @param text
	 * @return
	 */
	public static JLabel createPLabel(String text) {
		return new PLabel(text);
	}
	/**
	 * ����������Ʊ�ǩ��
	 * @param handle
	 * @param ds
	 * @return
	 */
	public static JLabel createContralBarLable(JFrame handle,Dimension ds) {
		return new ContralBarLabel(handle, ds);
	}
	/**
	 * ��������logo�ı����� 
	 * @param logo
	 * @param title
	 * @return
	 */
	public static JLabel createFrameTitleBar(Icon logo,String title) {
		return new FrameTitleBar(logo, title);
	}
	/**
	 * ������logo�ı�����
	 * @param title
	 * @return
	 */
	public static JLabel createFrameTitleBar(String title) {
		return new FrameTitleBar(title);
	}
	
	public static StatusBar createStatusBar() {
		return new StatusBar();
	}
	
	public static MenuLabel createMenuLabel(Dimension ds) {
		return new MenuLabel(ds);
	}
	
	public static ContentLabel createContentLabel(int rows,int cols) {
		return new ContentLabel(rows, cols);
	}
	
	public static ContentLabel createContentLabel() {
		return new ContentLabel();
	}
}
