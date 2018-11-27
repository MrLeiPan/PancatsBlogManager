package com.pancats.view.event;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import com.pancats.view.ContentPanel;
import com.pancats.view.components.BasicPopupMenu;
import com.pancats.view.components.RButton;
import com.pancats.view.components.SystemMenu;

public class MenuChageListener implements ActionListener{
	private CardLayout card=null;
	private ContentPanel contentPanel=null;
	private List<JButton> blist=null;
	private SystemMenu systemMenu=null;
	public MenuChageListener(CardLayout cardLayout, ContentPanel contentPanel,List<JButton> blist) {
		this.card=cardLayout;
		this.contentPanel=contentPanel;
		this.blist=blist;
	}
	
	private void resetStyle() {
		for(JButton bt:blist) {
			if(!"系统设置".equals(bt.getActionCommand())) {
				((RButton)bt).setBorderStyle(new Color(36,142,194), new Color(36,142,194));
				((RButton)bt).repaint();
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cName = e.getActionCommand();
		switch (cName) {
		case "系统主页":
			resetStyle();
			card.show(contentPanel, "0");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "博客管理":
			resetStyle();
			card.show(contentPanel, "1");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "用户管理":
			resetStyle();
			card.show(contentPanel, "2");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "日志管理":
			resetStyle();
			card.show(contentPanel, "3");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "留言管理":
			resetStyle();
			card.show(contentPanel, "4");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "网站管理":
			resetStyle();
			card.show(contentPanel, "5");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "站点信息":
			resetStyle();
			card.show(contentPanel, "6");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "系统设置":
			systemMenu = new SystemMenu();
			RButton btn = (RButton)e.getSource();
			systemMenu.show(btn.getParent(),btn.getX(), btn.getY()+btn.getHeight());
			//((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		default:
			break;
		}
		
	}
}
