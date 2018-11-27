package com.pancats.view.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class ScrollBarUIBar extends BasicScrollBarUI {
	private Color thumbColor = new Color(180,180,180);
	private Color trackColor= new Color(133,133,133);
	
	/**
	 * 绘制手把
	 */
	
	@Override
	protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
		Graphics2D g2 = (Graphics2D)g;
		g.translate(thumbBounds.x, thumbBounds.y);
		g.setColor(thumbColor);
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.addRenderingHints(rh);
		//g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9F));
		g2.fillRoundRect(3, 0, 10, thumbBounds.height-5, 10, 10);
	}

	/**
	 * 绘制轨道
	 */
	@Override
	protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
		Graphics2D g2 = (Graphics2D)g;
		GradientPaint gp=null;
		if(this.scrollbar.getOrientation()==JScrollBar.VERTICAL) {
			gp=new GradientPaint(0, 0, trackColor, trackBounds.width, 0, trackColor);
		}
		if(this.scrollbar.getOrientation()==JScrollBar.HORIZONTAL) {
			gp=new GradientPaint(0, 0, trackColor, trackBounds.height, 0, trackColor);
		}
		g2.setPaint(gp);
		g2.setColor(trackColor);
		g2.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
		g2.setColor(trackColor);
		g2.drawRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
		if(trackHighlight==BasicScrollBarUI.DECREASE_HIGHLIGHT) {
			this.paintDecreaseHighlight(g);
		}
		if(trackHighlight==BasicScrollBarUI.INCREASE_HIGHLIGHT) {
			this.paintDecreaseHighlight(g);
		}
		
		//super.paintTrack(g, c, trackBounds);
	}
	

	@Override
	protected JButton createIncreaseButton(int orientation) {
		return  setButton();
	}
	

	@Override
	protected JButton createDecreaseButton(int orientation) {
		return  setButton();
	}
	
	
	private JButton setButton() {
		JButton button = new JButton();
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setBorder(null);
		return button;
	}
}
