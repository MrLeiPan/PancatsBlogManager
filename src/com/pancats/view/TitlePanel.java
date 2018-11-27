package com.pancats.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pancats.view.components.LabelFactory;
import com.pancats.view.event.TitlePanelEvent;
/**
 * 窗体标题栏区域
 * @author 小疯子
 *
 */
public class TitlePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel titleBar=null;
	private JLabel contralBar=null;
	private JFrame handle=null;
	private Dimension ds = null;
	private final Color BCOLOR1=new Color(0, 141,239);
	private BorderLayout borderLayout=null;
	private TitlePanelEvent tpe =null;
	public TitlePanel(JFrame handle,Dimension ds) {
		this.handle=handle;
		this.ds=ds;
		tpe=new TitlePanelEvent(handle);
		borderLayout= new BorderLayout();
		setBackground(BCOLOR1);
		setLayout(borderLayout);
		setPreferredSize(ds);
		addMouseMotionListener(tpe);
		addMouseListener(tpe);
		initTitlePanel();
	}
	
	
	private void initTitlePanel() {
		titleBar = LabelFactory.createFrameTitleBar("  PancatsBlogManager");
		contralBar = LabelFactory.createContralBarLable(handle,new Dimension(150, 0));
		add(BorderLayout.WEST,titleBar);
		add(BorderLayout.EAST,contralBar);
	}
}
