package com.pancats.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.pancats.view.event.LoginListener;
import com.pancats.view.event.LoginFocusListener;
/**
 * JFrame中的层次分布及相对关系是:
 * 最底层是：JRootPane；
 * 第二层是：JlayerPane；
 * 最上层就是ContentPane,也正是我们常说的内容面板。
 * @author Administrator
 *
 */
public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private Icon logo =null;
	private ImageIcon backimage=null;
	private JLabel backLabel=null,logoLabel=null;
	private JTextField tname=null;
	private JPasswordField tpass=null;
	private JButton submit=null;
	private Border border=null;
	public Login(String title) {
		super(title);
		setSize(800,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		initFrame();
		
	}
	/**
	 * 窗体初始化
	 */
	private void initFrame() {
		setJFranmeBack(new File("../blogManager/images/bg.jpg"));
		tname = new JTextField();
		tpass = new JPasswordField();
		tpass.setEchoChar((char)0);
		add(getText(tname,"用户名",300,200));
		add(getText(tpass,"密    码",300,245));
		add(addLogo(290, 80));
		add(submit(300,300));
	}
	
	/**
	 * 设置窗体背景
	 * @param imagepath 
	 */
	private void setJFranmeBack(File imagepath) {
		backimage = new ImageIcon(imagepath.getAbsolutePath());
		backLabel= new JLabel(backimage);
		this.getLayeredPane().add(backLabel,new Integer(Integer.MIN_VALUE));
		backLabel.setBounds(0, 0, backimage.getIconWidth(), backimage.getIconHeight());
		Container pane = this.getContentPane();//获取窗体最上层的ContentPane
		((JPanel)pane).setOpaque(false);//让该层透明
	}
	/**
	 * Logo
	 */
	private JLabel addLogo(int x,int y) {
		/*logo = new ImageIcon(logopath.getAbsolutePath());
		logoLabel = new JLabel(logo);
		logoLabel.setSize(350,30);
		logoLabel.setLocation(200, 400);
		this.add(logoLabel);*/
		logoLabel = new JLabel("Pancats");
		logoLabel.setFont(new Font(null,Font.BOLD+Font.ITALIC,64));
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setSize(600, 64);
		logoLabel.setLocation(x, y);
		return logoLabel;
	} 
	
	private JLabel getText(JTextField text,String content,int x,int y) {
		JLabel baselabel = new JLabel();
		Color color = new Color(5, 140, 196);
		baselabel.setOpaque(true);
		baselabel.setSize(220,40);
		baselabel.setBorder(getLineBorder());
		baselabel.setBackground(color);
		Border border = BorderFactory.createEmptyBorder(0,0,0,0);
		if("密    码".equals(content)) 
			((JPasswordField)text).setEchoChar('*');
		text.addFocusListener(new LoginFocusListener(text));
		text.setBackground(color);
		text.setSize(196,30);
		text.setLocation(10, 5);
		text.setBorder(border);
		text.setForeground(Color.WHITE);
		text.setFont(new Font(null,Font.PLAIN,16));
		text.setText(content);
		baselabel.add(text);
		baselabel.setLocation(x, y);
		return baselabel;
	}
	
	/**
	 * 边框
	 * @return
	 */
	private Border getLineBorder() {
		border = BorderFactory.createLineBorder(new Color(3, 122, 161), 2);
		return border;
	}
	
	private JButton submit(int x,int y) {
		submit = new JButton("登     陆");
		submit.setSize(new Dimension(220,40)); 
		submit.setLocation(x, y);
		submit.setBackground(new Color(5,140,196));
		submit.setFont(new Font(null,Font.BOLD,16));
		submit.setForeground(Color.WHITE);
		submit.setBorder(BorderFactory.createLineBorder(new Color(5,152,213)));
		submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		submit.addActionListener(new LoginListener(this));
		submit.setFocusPainted(false);// 是否绘制焦点
		return submit;
	}
	
	public String getUserPassword() {
		return this.tpass.getText();
	}

	public String getUserName() {
		return this.tname.getText();
	}

	
	public static void main(String[] args) {
		Login l = new Login("博客登陆界面");
		l.setVisible(true);
	}
}
