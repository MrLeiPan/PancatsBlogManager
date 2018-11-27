package com.pancats.view.module.sytemHome;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * 系统主页主内容面板
 * @author 小疯子
 *
 */
public class SystemHomeContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private SystemHomeContainer systemHomeContainer=null;
	public SystemHomeContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initOperate();//初始化控制台面板
	}
	
	
	/**
	 * 初始化控制台面板
	 */
	private void initOperate() {
		systemHomeContainer = new SystemHomeContainer();
		add(BorderLayout.CENTER, systemHomeContainer);
	}
		
}
