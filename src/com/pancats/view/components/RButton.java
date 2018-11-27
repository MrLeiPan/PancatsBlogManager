package com.pancats.view.components;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

public class RButton extends JButton {
	private static final long serialVersionUID = 1L;
	private Color foreColor = Color.WHITE, 
				  foreColored = Color.WHITE, 
				  backColor1 = Color.BLUE, 
				  backColor2 = Color.GREEN,
				  borderColor1 = backColor1,
				  borderColor2 = backColor2;
	private float radian = 10, x1=0, y1=0, x2=0, y2=0;
	private boolean hover;

	public RButton(String name) {
		super(name);
		setSize(new Dimension(150, 30));
		setFont(new Font("system", Font.PLAIN, 14));
		setForeground(foreColor);// 前景色
		setBorderPainted(false);// 是否绘制边框
		setFocusPainted(false);// 是否绘制焦点
		setContentAreaFilled(false);// 是否绘制内容区
		// 用鼠标监听器 模拟Hover
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setForeground(foreColor);
				hover = true;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setForeground(foreColored);
				hover = false;
				repaint();
			}
		});
	}
	/**
	 * 
	 * @param x1
	 * @param y1
	 * @param backColor1 颜色1
	 * @param x2
	 * @param y2
	 * @param backColor2 颜色2
	 * 
	 * 默认值:
	 * 	x1=0
	 *  y1=0
	 *  backColor1 = Color.BLUE
	 *  x2=0
	 *  y2=0
	 *  backColor1 = Color.BLUE
	 *  backColor2 = Color.GREEN
	 */
	public void  setGradualPaint(float x1,float y1,Color backColor1,float x2,float y2,Color backColor2) {
		this.x1=x1;
		this.y1=y1;
		this.backColor1=backColor1;
		this.x2=x2;
		this.y2=y2;
		this.backColor2=backColor2;
	}
	
	
	/**
	 * 
	 * @param borderColor1
	 * @param borderColor2
	 */
	public void  setBorderStyle(Color borderColor1,Color borderColor2) {
		this.borderColor1 = borderColor1;
		this.borderColor2 = borderColor2;
	}
	/**
	 * 获取bordercolor颜色
	 * @return
	 */
	public Color[] getBorderColors() {
		Color[] colors = new Color[2];
		colors[0]=borderColor1;
		colors[1]=borderColor2;
		return colors;
	}
	
	/**
	 * 设置组件边框的弧度
	 * @param radian
	 * radiao 默认值:10
	 */
	public void setRadian(float radian) {
		this.radian = radian;
	}
	
	// 覆盖父类的paintComponent 重绘按钮的样式
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		int h = getHeight();// 获取当前组件的高度
		int w = getWidth();// 获取当前组件的宽度
		float tran = 1F;
		if (!hover)
			tran = 0.6F;
		// 设置渲染算法
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint p1;// 绘制渐变色1
		GradientPaint p2;// 绘制渐变色2
		if (getModel().isPressed()) {
			p1 = new GradientPaint(0, 0, new Color(0, 0, 0), 0, h - 1, new Color(150, 100, 100));
			p2 = new GradientPaint(0, 1, new Color(0, 0, 50), 0, h - 3, new Color(255, 255, 255, 100));
		} else {
			p1 = new GradientPaint(0, 0, borderColor1, 0, h - 1, borderColor2);
			p2 = new GradientPaint(0,1,borderColor1, 0, y2-3, borderColor2);
		}
		// 组合
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, tran));
		RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0, 0, w - 1, h - 1, radian, radian);
		Shape clip = g2.getClip();
		g2.clip(r2d);
		GradientPaint gp = new GradientPaint(x1, y1, backColor1, x2, y2, backColor2, true);
		g2.setPaint(gp);
		g2.fillRect(0, 0, w, h);
		g2.setClip(clip);
		g2.setPaint(p1);
		g2.drawRoundRect(0, 0, w - 1, h - 1, (int) radian, (int) radian);
		g2.setPaint(p2);
		g2.drawRoundRect(1, 1, w - 3, h - 3, (int) radian, (int) radian);
		g2.dispose();
		super.paintComponent(g);
	}
}
