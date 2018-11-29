package com.pancats.view.main;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
public class ContentPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private CardLayout card=null;
	private JPanel[] panels=null;
	public ContentPanel() {
		card = new CardLayout();
		setLayout(card);
		setBackground(new Color(246, 246, 246));
		setBorder(BorderFactory.createMatteBorder(0, 30, 0, 0, new Color(246, 246, 246)));
	}
	
	/**
	 * 传入所有的子面板
	 * @param panels
	 */
	public ContentPanel(JPanel[] panels) {
		this();
		this.panels=panels;
		fabrication();//装配内容面板
		
	}
	
	/**
	 * 把所有的子面板添加到主面板中
	 */
	public void fabrication() {
		for(int i=0;i<panels.length;i++) {
			this.add(panels[i],Integer.toString(i));
		}
	}
	
	
	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public JPanel[] getPanels() {
		return panels;
	}

	public void setPanels(JPanel[] panels) {
		this.panels = panels;
	}
	
}
