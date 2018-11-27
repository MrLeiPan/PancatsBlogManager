package com.pancats.view.component.utlis;

import javax.swing.JFrame;

public class FrameContralTools implements FrameTools{

	private JFrame jframe=null;//声明当前窗体的句柄
	
	public FrameContralTools(JFrame jframe) {
		this.jframe=jframe;//得到当前窗体的句柄
	}
	
	@Override
	public void frameClose() {
		jframe.dispose();
	}

	@Override
	public void frameMinimality() {
		jframe.setExtendedState(JFrame.ICONIFIED);
	}

	@Override
	public void frameMaximization() {
		jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	@Override
	public void frameRestore() {
		jframe.setExtendedState(JFrame.NORMAL);
	}

}
