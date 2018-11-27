package com.pancats.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	private String username=null;
	public StatusPanel(String username) {
		this.username=username;
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		statusBar.setVsersion("v1.0.0");
		statusBar.setSystemtime(sdf.format(new Date()));
		statusBar.setUsername(username);
		statusBar.setIdentity("博主(系统管理员)");
		statusBar.initStatusBar();
		add(statusBar);
	}
}
