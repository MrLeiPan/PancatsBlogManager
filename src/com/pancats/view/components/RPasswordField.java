package com.pancats.view.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;

import javax.swing.BorderFactory;
import javax.swing.JPasswordField;

public class RPasswordField extends JPasswordField{
	private static final long serialVersionUID = 1L;
	private float weight=0;
	private Integer radian=0;
	private Color borderColor=Color.BLACK;
	public RPasswordField() {
		setMargin(new Insets(0, 5, 0, 0));
		setSize(150,35);
		setBorder(BorderFactory.createEmptyBorder(1, 5, 1, 1));
	}
	
	//设置边框的粗细
		public void setBorderWeight(float weight) {
			this.weight=weight;
		}
		
		public void setRadian(int radian) {
			this.radian=radian;
		}
		
		public void setBorderColor(Color borderColor) {
			this.borderColor = borderColor;
		}
		
		@Override
		protected void paintBorder(Graphics g) {
			int h = getHeight();// 从JComponent类获取高宽 
			int w = getWidth(); 
			Graphics2D g2d = (Graphics2D)g.create(); 
			g2d.setColor(borderColor);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
			g2d.setStroke(new BasicStroke(weight, BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND, 0 ));
			Shape shape = g2d.getClip(); 
			g2d.setClip(shape); 
			g2d.drawRoundRect(0, 0, w - 1, h - 1, radian,radian);
			g2d.dispose(); 
			super.paintBorder(g);
		}
}
