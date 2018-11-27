package com.pancats.view.event;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.pancats.view.ContentPanel;

public class BlogListener implements ActionListener{

	private CardLayout card=null;
	private ContentPanel contentPanel=null;
	public BlogListener(CardLayout cardLayout, ContentPanel contentPanel) {
		this.card=cardLayout;
		this.contentPanel=contentPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		card.show(contentPanel, "1");		
	}

}
