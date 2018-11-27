package com.pancats.view.components;

import java.awt.GridLayout;

import javax.swing.JLabel;

public class StatusBar extends JLabel  {
	private static final long serialVersionUID = 1L;
	private JLabel version=null,//当前版本号
				   username=null,//用户名
				   identity=null,//身份
				   systemtime=null;//系统时间
	private String sVersion="null",
				   sUsername="null",
				   sIdentity="null",
				   sSystemname="null";
	private GridLayout grid=null;
	public StatusBar() {
		grid = new GridLayout();
		setLayout(grid);
	}
	
	/**
	 * 设置版本号
	 */
	public void setVsersion(String sVersion) {
		this.sVersion=sVersion;
	}
	/**
	 * 设置用户名
	 */
	public void setUsername(String sUsername) {
		this.sUsername=sUsername;
	}
	
	/**
	 * 设置身份
	 */
	public void setIdentity(String sIdentity) {
		this.sIdentity=sIdentity;
	}
	/**
	 * 设置系统时间
	 */
	public void setSystemtime(String sSystemname) {
		this.sSystemname=sSystemname;
	}
	
	
	public void initStatusBar() {
		JLabel first=new JLabel();
		JLabel last=new JLabel();
		version = new JLabel("当前版本: "+sVersion);
		username = new JLabel("当前用户: "+sUsername);
		identity = new JLabel("身份: "+sIdentity);
		systemtime = new JLabel("系统时间: "+sSystemname);
		version.setBounds(20,0,200, 35);
		username.setBounds(0, 0, 200,35);
		identity.setBounds(130, 0, 200, 35);
		systemtime.setBounds(280, 0, 200,35);
		first.add(version);
		last.add(username);
		last.add(identity);
		last.add(systemtime);
		add(first);
		add(last);
	}
}
