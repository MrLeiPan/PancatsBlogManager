package com.pancats.view.module.sytemHome;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.pancats.view.component.utlis.ModulePanel;

public class SystemHomeContainer extends JPanel{
	private static final long serialVersionUID = 1L;
	private ModulePanel webInfoPanel,visitorIpPanel,newLeavePanel,
						blogPublishPanel,funcitonEntrancePanel;
	private GridLayout grid=null;
	public SystemHomeContainer() {
		grid=new GridLayout(3, 1, 0, 10);
		setLayout(grid);
		setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 25));
		initSystemHome();
	}
	
	private void initSystemHome() {
		JPanel group = new JPanel();
		GridLayout groupGrid=new GridLayout(1, 3, 10, 0);
		group.setLayout(groupGrid);
		webInfoPanel=new WebInfoPanel();
		visitorIpPanel = new VisitorIpPanel();
		newLeavePanel=new NewLeavePanel();
		group.add(webInfoPanel.getPanel());
		group.add(visitorIpPanel.getPanel());
		group.add(newLeavePanel.getPanel());
		blogPublishPanel=new BlogPublishPanel();
		funcitonEntrancePanel=new FunctionEntrancePanel();
		add(group);
		add(blogPublishPanel.getPanel());
		add(funcitonEntrancePanel.getPanel());
	}
	
}

