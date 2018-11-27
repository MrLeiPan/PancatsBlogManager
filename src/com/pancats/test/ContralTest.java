package com.pancats.test;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.pancats.view.components.ContralBarLabel;

public class ContralTest {
	public static void main(String[] args) {
		JFrame jf = new JFrame("øÿ÷∆«¯”Ú≤‚ ‘");
		jf.setSize(500, 150);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		ContralBarLabel cbl = new ContralBarLabel(jf, new Dimension(150, 30));
		cbl.setOpaque(true);
		cbl.setBackground(Color.WHITE);
		jf.add(cbl);
		jf.setVisible(true);
	}
}
