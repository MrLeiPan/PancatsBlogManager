package com.pancats.view.event;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.pancats.view.components.RButton;


public class MenuMouseListener extends MouseAdapter{
	@Override
	public void mouseExited(MouseEvent e) {
		Color decolor = new Color(36,142,194);
		if(!isPress(e)) {
			((RButton)e.getSource()).setBorderStyle(decolor,decolor);
		}
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(!isPress(e)) {
			((RButton)e.getSource()).setBorderStyle(Color.WHITE,Color.WHITE);
		}
	}
	
	private boolean isPress(MouseEvent e) {
		Color curbc1=new Color(0,0,0);
		Color curbc2=new Color(255,255,255);
		Color[] borderColors = ((RButton)e.getSource()).getBorderColors();
		Color bc1=borderColors[0];
		Color bc2=borderColors[1];
		/**
		 * 如果为true 说明被按下
		 */
		if((bc1.getRGB()==curbc1.getRGB()) && (bc2.getRGB()==curbc2.getRGB())) {
			return true;
		}
		
		return false;
	}
}
