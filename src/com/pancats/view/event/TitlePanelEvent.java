package com.pancats.view.event;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class TitlePanelEvent extends MouseAdapter {
	private Point pressedPoint=null;
	private JFrame handle=null;
	public TitlePanelEvent(JFrame handle) {
		this.handle=handle;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		pressedPoint = e.getPoint();//记录鼠标按下后的坐标
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Point point = e.getPoint();
		Point locationPoint = handle.getLocation();
		int x = locationPoint.x + point.x-pressedPoint.x;
		int y = locationPoint.y + point.y-pressedPoint.y;
		handle.setLocation(x, y);
	}
	
}
