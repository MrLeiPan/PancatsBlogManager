package com.pancats.view.module.blog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.ContentMenu;
import com.pancats.view.components.LabelFactory;
/**
 * 博客管理 内容菜单
 * 该类定义的是每个功能模块的菜单
 * @author 小疯子
 *
 */
public class BlogMenu implements ContentMenu {
	private String[] menuItem=null;
	private JPanel jPanel=null;
	private Dimension dimension=null;
	public BlogMenu(Dimension dimension) {
		this.dimension=dimension;
	}
	@Override
	public void addMenuItem(String[] menuItem) {
		this.menuItem=menuItem;
	}

	@Override
	public JPanel getMenuPanel() {
		jPanel=new JPanel();
		jPanel.setLayout(null);
		jPanel.setPreferredSize(dimension);
		jPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.WHITE));
		Dimension d=null;
		if(menuItem==null) throw new RuntimeException("请先使用addMenuItem(String[] menuItem) 方法指定菜单项");
		for(int i=0;i<menuItem.length;i++) {
			JLabel pLabel = LabelFactory.createPLabel(menuItem[i]);
			pLabel.setForeground(Color.WHITE);
			pLabel.setFont(new Font(null,Font.BOLD,16));
			d=new Dimension(100,40);
			pLabel.setSize(d);
			pLabel.setLocation(0, 20);
			jPanel.add(pLabel);
		}
		return jPanel;
	}
}
