package com.pancats.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import com.pancats.view.components.PLabel;

public class JLabelTest {
	
	public void test() {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setLocationRelativeTo(null);
		jf.setSize(new Dimension(500, 300));
		PLabel pl = new PLabel("ึ๗าณ  ");
		//pl.setBackground(Color.RED);
		pl.setForeground(Color.WHITE);
		pl.setFont(new Font(null,Font.BOLD,16));
		pl.setLocation(50, 30);
		pl.setSize(new Dimension(100, 35));
		jf.add(pl);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		JLabelTest j = new JLabelTest();
		j.test();
	}
}
