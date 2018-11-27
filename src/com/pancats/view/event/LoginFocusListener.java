package com.pancats.view.event;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;

public class LoginFocusListener extends FocusAdapter {
	private JTextField tf=null;
	
	public LoginFocusListener(JTextField tf) {
		this.tf=tf;
	}
	
	@Override
	public void focusLost(FocusEvent e) {
		if(tf instanceof JTextField) {
			if("".equals(tf.getText())) {
				tf.setText("�û���");
			}
		}
		if("".equals(tf.getText())) {
			tf.setText("��    ��");
		}
	}
	@Override
	public void focusGained(FocusEvent e) {
		tf.setText("");
	}
	
}
