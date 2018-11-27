package com.pancats.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.ScrollBarUI;

import com.pancats.view.components.ScrollBarUIBar;


public class ScrollBarTest {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setLocationRelativeTo(null);
		jf.setSize(new Dimension(500, 300));
		//pl.setBackground(Color.RED);
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setPreferredSize(new Dimension(500, 300));
		
		JLabel j1 = new JLabel("A");
		j1.setBounds(0, 0, 100, 40);
		JLabel j2 = new JLabel("B");
		j2.setBounds(0, 80, 100, 40);
		JLabel j3= new JLabel("C");
		j3.setBounds(0, 220, 100, 40);
		
		jp.setBackground(Color.BLUE);
		JScrollPane sb = new JScrollPane(jp);
		sb.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		sb.getVerticalScrollBar().setUI(new ScrollBarUIBar());
		sb.setBounds(0, 0, 400, 150);
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		jp.add(j2);
		jp.add(j3);
		jf.add(sb);
		
		jf.setVisible(true);
	}
}
