package com.pancats.view.components;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.pancats.view.event.ContralBarLableEvent;
/**
 * 控制条
 * 	close 关闭
 *  Minimum 最小化
 *  Magnify 最大化
 *  Restore 还原
 * @author 小疯子
 *
 */
public class ContralBarLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	private JFrame handle=null;
	private JLabel close =null;
	private JLabel minimum =null;
	private JLabel scaling =null;
	private GridLayout grid=null;
	private Icon[] icons = {
		new ImageIcon("images/magnify.png"),
		new ImageIcon("images/close.png"),
		new ImageIcon("images/restore.png"),
		new ImageIcon("images/min.png")
	};
	public ContralBarLabel(JFrame handle,Dimension ds) {
		this.handle=handle;
		grid = new GridLayout(1, 3);
		setPreferredSize(ds);
		setLayout(grid);
		initContralBar();
	}
	/**
	 * 初始化
	 */
	private void initContralBar() {
		add(this.minimumStyle());
		add(this.scalingStyle());
		add(this.closeStyle());
	
	}
	/**
	 * 关闭按钮的样式控制
	 * @return
	 */
	private JLabel closeStyle() {
		close=new JLabel(icons[1]);
		close.setName("close");
		close.addMouseListener(new ContralBarLableEvent(close,handle));
		return close;
	}
	/**
	 * 最小化按钮的样式控制
	 * @return
	 */
	private JLabel minimumStyle() {
		minimum=new JLabel(icons[3]);
		minimum.setName("minimum");
		minimum.addMouseListener(new ContralBarLableEvent(minimum,handle));
		return minimum;
	}
	/**
	 * 缩放的样式控制
	 * @return
	 */
	private JLabel scalingStyle() {
		scaling=new JLabel(icons[0]);
		scaling.setName("max");
		scaling.addMouseListener(new ContralBarLableEvent(scaling,handle));
		return scaling;
	}

}
