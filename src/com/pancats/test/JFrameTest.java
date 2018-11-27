package com.pancats.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.pancats.view.components.ButtonFactory;
import com.pancats.view.components.RTextField;
import com.pancats.view.components.TextFieldFactory;

public class JFrameTest extends JFrame{
	
	public JFrameTest() {
		setSize(new Dimension(1000, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		JButton jb = ButtonFactory.createRButton("°´Å¥");
		JTextField rt = TextFieldFactory.createRTextField();
		rt.setLocation(50, 50);
		//rt.setBackground(Color.BLUE);
		//rt.setForeground(Color.WHITE);
		jb.setBounds(300, 10, 150, 30);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "a", "b",JOptionPane.NO_OPTION);
			}
		});
		jp1.add(rt);
		jp1.add(jb);
		jp1.setBackground(Color.WHITE);
		JPanel jp2 = new JPanel();
		jp2.setPreferredSize(new Dimension(0, 150));
		jp2.setBackground(Color.YELLOW);
		jp1.setPreferredSize(new Dimension(0, 150));
		getContentPane().add(BorderLayout.SOUTH, jp1);
		getContentPane().add(BorderLayout.NORTH, jp2);
	}
	
	public static void main(String[] args) {
		JFrameTest jt = new JFrameTest();
		jt.setVisible(true);
	}
}
