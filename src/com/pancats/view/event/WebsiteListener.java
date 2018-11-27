package com.pancats.view.event;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.pancats.view.ContentPanel;

public class WebsiteListener implements ActionListener {

	private CardLayout card=null;
	private ContentPanel contentPanel=null;
	public WebsiteListener(CardLayout cardLayout, ContentPanel contentPanel) {
		this.card=cardLayout;
		this.contentPanel=contentPanel;
	}
	public WebsiteListener() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		card.show(contentPanel, "0");
	}


}
