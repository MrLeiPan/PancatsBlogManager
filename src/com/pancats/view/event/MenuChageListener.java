package com.pancats.view.event;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import com.pancats.view.ContentPanel;
import com.pancats.view.components.RButton;

public class MenuChageListener implements ActionListener{
	private CardLayout card=null;
	private ContentPanel contentPanel=null;
	private List<JButton> blist=null;
	public MenuChageListener(CardLayout cardLayout, ContentPanel contentPanel,List<JButton> blist) {
		this.card=cardLayout;
		this.contentPanel=contentPanel;
		this.blist=blist;
	}
	
	private void resetStyle() {
		for(JButton bt:blist) {
			((RButton)bt).setBorderStyle(new Color(36,142,194), new Color(36,142,194));
			((RButton)bt).repaint();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		resetStyle();
		String cName = e.getActionCommand();
		switch (cName) {
		case "ϵͳ��ҳ":
			card.show(contentPanel, "0");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "���͹���":
			card.show(contentPanel, "1");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "�û�����":
			card.show(contentPanel, "2");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "��־����":
			card.show(contentPanel, "3");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "���Թ���":
			card.show(contentPanel, "4");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "��վ����":
			card.show(contentPanel, "5");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		case "վ����Ϣ":
			card.show(contentPanel, "6");
			((RButton)e.getSource()).setBorderStyle(Color.BLACK, Color.WHITE);
			break;
		default:
			break;
		}
		
	}
}
