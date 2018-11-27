package com.pancats.view.components;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	private final Color BC=new Color(104,104,104);
	private final Color BGC=new Color(250,177,20);
	public PLabel(String text) {
		super(text);
		setHorizontalAlignment(SwingConstants.CENTER);
	}
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d =  (Graphics2D)g.create();
		int h = getHeight();
		int w = getWidth();
		int[] x= {0,0,w-15,w};
		int[] y= {h,0,0,h};
		int[] x2= {w-15,w};
		int[] y2= {0,h};
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(BGC);
		g2d.fillPolygon(x, y, x.length);
		g2d.setColor(BC);
		g2d.drawPolygon(x2, y2, 2);
		super.paintComponent(g2d);
	}
}
