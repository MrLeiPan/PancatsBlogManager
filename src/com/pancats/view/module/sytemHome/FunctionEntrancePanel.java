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

public class FunctionEntrancePanel implements ModulePanel{
	private JPanel panel=null;
	@Override
	public JPanel getPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(36, 142, 194)));
		JLabel titleBar = LabelFactory.createFrameTitleBar("  功能入口");
		titleBar.setOpaque(true);
		titleBar.setFont(new Font("微软雅黑",Font.PLAIN,16));
		titleBar.setBackground(new Color(36, 142, 194));
		titleBar.setPreferredSize(new Dimension(0, 30));
		
		MenuLabel[] menus=new MenuLabel[2];
		ContentLabel contentLabel = LabelFactory.createContentLabel();
		MenuLabel myWebsit = LabelFactory.createMenuLabel(new Dimension(150, 100));
		MenuLabel mynNote = LabelFactory.createMenuLabel(new Dimension(150, 100));
		myWebsit.initMenuLabel(new ImageIcon("images/pancats.png"), "个人博客网站");
		mynNote.initMenuLabel(new ImageIcon("images/note.png"), "个人笔记");
		menus[0]=myWebsit;
		menus[1]=mynNote;
		contentLabel.addMenuItem(menus);
		panel.add(BorderLayout.NORTH,titleBar);
		panel.add(contentLabel);
		return panel;
	}

}
