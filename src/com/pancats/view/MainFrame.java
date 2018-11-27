package com.pancats.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.pancats.view.module.blog.BlogContentPanel;
import com.pancats.view.module.leave.LeaveContentPanel;
import com.pancats.view.module.log.LogContentPanel;
import com.pancats.view.module.site.SiteContentPanel;
import com.pancats.view.module.sytemHome.SystemHomeContentPanel;
import com.pancats.view.module.user.UserContentPanel;
import com.pancats.view.module.website.WebsiteContentPanel;
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private MenuPanel menuPanel=null;//�˵����
	private ContentPanel contentPanel=null;//�������
	private TitlePanel titleArea=null;//����������
	private StatusPanel statusArea=null;//״̬������
	public MainFrame() {
		super("Pancats��̨����ϵͳ");
		setSize(new Dimension(1500, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
		initFrame();
	}
	
	private void initFrame() {
		titleArea =new TitlePanel(this,new Dimension(0, 50));
		getContentPane().add(BorderLayout.NORTH,titleArea);
		
		statusArea = new StatusPanel();
		getContentPane().add(BorderLayout.SOUTH,statusArea);
		
		contentPanel=new ContentPanel(setJPanels());//�������������
		//���Ӳ˵���壬���ڲ˵���������������й�ϵ��������Ҫ�������������󴫵ݸ��˵����
		menuPanel = new MenuPanel(new Dimension(300, 0),contentPanel);
		getContentPane().add(BorderLayout.WEST,menuPanel);
		getContentPane().add(contentPanel);
	}
	
	/**
	 * ��ʼ�����������
	 * ��������±�Ҫ��MenuChangeListener��card.show(xx,���)��ͬ
	 * @return
	 */
	private JPanel[] setJPanels() {
		JPanel[] panels = new JPanel[7];
		panels[0]=new SystemHomeContentPanel();
		panels[1]=new BlogContentPanel();
		panels[2]=new UserContentPanel();
		panels[3]=new LogContentPanel();
		panels[4]=new LeaveContentPanel();
		panels[5]=new WebsiteContentPanel();
		panels[6]=new SiteContentPanel();
		return panels;
	}
	
	public static void main(String[] args) {
		MainFrame m = new MainFrame();
		m.setVisible(true);
	}
}