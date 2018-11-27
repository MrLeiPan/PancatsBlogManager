package com.pancats.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pancats.view.components.LabelFactory;
import com.pancats.view.components.StatusBar;
/**
 * 窗体状态区
 * @author 小疯子
 *
 */
public class StatusPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	public StatusPanel() {
		setPreferredSize(new Dimension(0, 35));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		initStatusPanel();
	}
	
	/**
	 * 初始化
	 */
	private void initStatusPanel() {
		StatusBar statusBar = LabelFactory.createStatusBar();
		statusBar.setVsersion("v1.0.0");
		statusBar.initStatusBar();
		add(statusBar);
	}
}
