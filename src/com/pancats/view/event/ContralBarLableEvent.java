package com.pancats.view.event;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 控制区域事件监听
 * @author 小疯子
 *
 */
public class ContralBarLableEvent extends MouseAdapter {
	private JLabel om=null;//监听对象
	private JFrame jframe=null;//控制对象
	private final Color BRED=Color.RED;
	private final Color BGRAY=new Color(220, 220, 220);
	public ContralBarLableEvent(JLabel om,JFrame jframe) {
		this.om=om;
		this.jframe=jframe;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if("close".equals(om.getName())) {
			System.exit(0);
		}else if("minimum".equals(om.getName())) {
			jframe.setExtendedState(JFrame.ICONIFIED);;
		}else if("max".equals(om.getName())) {
			om.setName("restore");
			om.setIcon(new ImageIcon("images/restore.png"));
			jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		}else if("restore".equals(om.getName())) {
			om.setName("max");
			om.setIcon(new ImageIcon("images/magnify.png"));
			jframe.setExtendedState(JFrame.NORMAL);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		om.setOpaque(true);
		om.setBackground(BGRAY);
		if("close".equals(om.getName()))
			om.setBackground(BRED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		om.setBackground(new Color(0, 141,239));
	}

}
