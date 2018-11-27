package com.pancats.view.components;

import java.awt.GridLayout;

import javax.swing.JLabel;

public class StatusBar extends JLabel  {
	private static final long serialVersionUID = 1L;
	private JLabel version=null,//��ǰ�汾��
				   username=null,//�û���
				   identity=null,//���
				   systemtime=null;//ϵͳʱ��
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
	 * ���ð汾��
	 */
	public void setVsersion(String sVersion) {
		this.sVersion=sVersion;
	}
	/**
	 * �����û���
	 */
	public void setUsername(String sUsername) {
		this.sUsername=sUsername;
	}
	
	/**
	 * �������
	 */
	public void setIdentity(String sIdentity) {
		this.sIdentity=sIdentity;
	}
	/**
	 * ����ϵͳʱ��
	 */
	public void setSystemtime(String sSystemname) {
		this.sSystemname=sSystemname;
	}
	
	
	public void initStatusBar() {
		JLabel first=new JLabel();
		JLabel last=new JLabel();
		version = new JLabel("��ǰ�汾: "+sVersion);
		username = new JLabel("��ǰ�û�: "+sUsername);
		identity = new JLabel("���: "+sIdentity);
		systemtime = new JLabel("ϵͳʱ��: "+sSystemname);
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
