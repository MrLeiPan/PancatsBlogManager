package com.pancats.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.pancats.view.module.blog.BlogContentPanel;
import com.pancats.view.module.log.LogContentPanel;
import com.pancats.view.module.message.MessageContentPanel;
import com.pancats.view.module.site.SiteContentPanel;
import com.pancats.view.module.sytemHome.SystemHomeContentPanel;
import com.pancats.view.module.user.UserContentPanel;
import com.pancats.view.module.website.WebsiteContentPanel;
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private MenuPanel menuPanel=null;//菜单面板
	private ContentPanel contentPanel=null;//内容面板
	private TitlePanel titleArea=null;//标题栏区域
	private StatusPanel statusArea=null;//状态栏区域
	private String username=null;
	public MainFrame(String name) {
		super("Pancats后台管理系统");
		this.username=name;
		setSize(new Dimension(1500, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
		initFrame();
	}
	
	private void initFrame() {
		titleArea =new TitlePanel(this,new Dimension(0, 50));
		getContentPane().add(BorderLayout.NORTH,titleArea);
		
		statusArea = new StatusPanel(username);
		getContentPane().add(BorderLayout.SOUTH,statusArea);
		
		contentPanel=new ContentPanel(setJPanels());//添加主内容面板
		//添加菜单面板，由于菜单面板和主内容面板有关系，所以需要把主内容面板对象传递给菜单面板
		menuPanel = new MenuPanel(new Dimension(300, 0),contentPanel);
		getContentPane().add(BorderLayout.WEST,menuPanel);
		getContentPane().add(contentPanel);
	}
	
	/**
	 * 初始化主内容面板
	 * 内容面板下标要与MenuChangeListener的card.show(xx,序号)相同
	 * @return
	 */
	private JPanel[] setJPanels() {
		JPanel[] panels = new JPanel[7];
		panels[0]=new SystemHomeContentPanel();
		panels[1]=new BlogContentPanel();
		panels[2]=new UserContentPanel();
		panels[3]=new LogContentPanel();
		panels[4]=new MessageContentPanel();
		panels[5]=new WebsiteContentPanel();
		panels[6]=new SiteContentPanel();
		return panels;
	}
	
}
