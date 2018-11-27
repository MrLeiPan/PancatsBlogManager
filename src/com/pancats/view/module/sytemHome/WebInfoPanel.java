package com.pancats.view.module.sytemHome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.ModulePanel;
import com.pancats.view.components.ContentLabel;
import com.pancats.view.components.LabelFactory;
import com.pancats.view.components.MenuLabel;

/**
 * 网站信息模块
 * @author 小疯子
 *
 */
public class WebInfoPanel implements ModulePanel {
	private JPanel panel=null;

	@Override
	public JPanel getPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(36, 142, 194)));
		JLabel titleBar = LabelFactory.createFrameTitleBar("  网站消息");
		titleBar.setOpaque(true);
		titleBar.setFont(new Font("微软雅黑",Font.PLAIN,16));
		titleBar.setBackground(new Color(36, 142, 194));
		titleBar.setForeground(Color.WHITE);
		titleBar.setPreferredSize(new Dimension(0, 30));
		
		MenuLabel[] menus=new MenuLabel[4];
		ContentLabel contentLabel = LabelFactory.createContentLabel(2,2);
		MenuLabel visitortotal = LabelFactory.createMenuLabel(new Dimension(150, 100));
		MenuLabel visitor = LabelFactory.createMenuLabel(new Dimension(150, 100));
		MenuLabel leavetotal = LabelFactory.createMenuLabel(new Dimension(150, 100));
		MenuLabel leave = LabelFactory.createMenuLabel(new Dimension(150, 100));
		visitortotal.initMenuLabel(new ImageIcon("images/visitortotal1.png"), "总访问量", "1000");
		visitor.initMenuLabel(new ImageIcon("images/visitor.png"), "今日问量", "10");
		leavetotal.initMenuLabel(new ImageIcon("images/leavetotal1.png"), "总留言数", "1011");
		leave.initMenuLabel(new ImageIcon("images/leave.png"), "最新留言", "10");
		menus[0]=visitortotal;
		menus[1]=visitor;
		menus[2]=leavetotal;
		menus[3]=leave;
		contentLabel.addMenuItem(menus);
		panel.add(BorderLayout.NORTH,titleBar);
		panel.add(contentLabel);
		return panel;
	}
	
}
