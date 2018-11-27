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
import com.pancats.view.components.TableFactory;

public class BlogPublishPanel implements ModulePanel{

	private JPanel panel=null;
	@Override
	public JPanel getPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(36, 142, 194)));
		JLabel titleBar = LabelFactory.createFrameTitleBar("  ²©¿Í·¢±í");
		titleBar.setOpaque(true);
		titleBar.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,16));
		titleBar.setBackground(new Color(36, 142, 194));
		titleBar.setPreferredSize(new Dimension(0, 30));
		
		MenuLabel[] menus=new MenuLabel[1];
		ContentLabel contentLabel = LabelFactory.createContentLabel();
		MenuLabel writeBlog = LabelFactory.createMenuLabel(new Dimension(150, 100));
		writeBlog.initMenuLabel(new ImageIcon("images/publishBlgo.png"), "Ð´²©¿Í");
		menus[0]=writeBlog;
		contentLabel.addMenuItem(menus);
		panel.add(BorderLayout.NORTH,titleBar);
		panel.add(contentLabel);
		return panel;
	}

}
