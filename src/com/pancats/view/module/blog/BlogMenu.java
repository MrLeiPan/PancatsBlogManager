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
 * ���͹��� ���ݲ˵�
 * ���ඨ�����ÿ������ģ��Ĳ˵�
 * @author С����
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
		if(menuItem==null) throw new RuntimeException("����ʹ��addMenuItem(String[] menuItem) ����ָ���˵���");
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
