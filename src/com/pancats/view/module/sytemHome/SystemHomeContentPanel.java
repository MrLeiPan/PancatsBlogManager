package com.pancats.view.module.sytemHome;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import com.pancats.view.component.utlis.ContentMenu;

/**
 * ϵͳ��ҳ���������
 * @author С����
 *
 */
public class SystemHomeContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayot=null;
	private SystemHomeContainer systemHomeContainer=null;
	public SystemHomeContentPanel() {
		borderLayot=new BorderLayout();
		setLayout(borderLayot);
		initOperate();//��ʼ������̨���
	}
	
	
	/**
	 * ��ʼ������̨���
	 */
	private void initOperate() {
		systemHomeContainer = new SystemHomeContainer();
		add(BorderLayout.CENTER, systemHomeContainer);
	}
		
}
