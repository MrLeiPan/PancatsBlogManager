package com.pancats.view.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import com.pancats.dao.IUserDao;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.domain.User;
import com.pancats.view.components.RButton;
import com.pancats.view.components.RPasswordField;
import com.pancats.view.components.RTextField;

public class Register extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private RTextField username=null;
	private RPasswordField password=null;
	private RPasswordField repass=null;
	private RTextField mail=null;
	private RButton register=null,reset=null;
	private List<String> error = null;
//	private JLabel mUser=null,mPass=null,mR
	public Register() {
		setBackground(new Color(0,0,0,50));
		setLayout(null);
		initRegister();
		initListener();
		setSize(new Dimension(230, 500));
	}
	
	private  void initRegister() {
		username = new RTextField();
		username.setText("填写注册的用户名");
		username.setForeground(Color.GRAY);
		username.setFont(new Font(null,Font.PLAIN,16));
		username.setBounds(10, 50, 200, 40);
		password = new RPasswordField();
		password.setForeground(Color.GRAY);
		password.setEchoChar((char)0);
		password.setText("设置您的密码");
		password.setFont(new Font(null,Font.PLAIN,16));
		password.setBounds(10, 100, 200, 40);
		repass = new RPasswordField();
		repass.setEchoChar((char)0);
		repass.setForeground(Color.GRAY);
		repass.setText("确认您的密码");
		repass.setFont(new Font(null,Font.PLAIN,16));
		repass.setBounds(10, 150, 200, 40);
		mail = new RTextField();
		mail.setText("设置您的邮箱");
		mail.setBounds(10, 200, 200, 40);
		mail.setForeground(Color.GRAY);
		mail.setFont(new Font(null,Font.PLAIN,16));
		register = new RButton("提   交");
		register.setRadian(0);
		register.setBounds(10, 250, 200, 40);
		register.setGradualPaint(0, 0, new Color(5,140,196), 0, 0, new Color(5,140,196));
		register.setBorderStyle(new Color(5,140,196), new Color(5,140,196));
		reset = new RButton("重   置");
		reset.setRadian(0);
		reset.setBounds(10, 300, 200, 40);
		reset.setGradualPaint(0, 0, new Color(5,140,196), 0, 0, new Color(5,140,196));
		reset.setBorderStyle(new Color(5,140,196), new Color(5,140,196));
		add(username);
		add(password);
		add(repass);
		add(mail);
		add(register);
		add(reset);
	}
	
	private void initListener() {
		username.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if("".equals(username.getText())||username.getText()==null) {
					username.setText("填写注册的用户名");
					username.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if("填写注册的用户名".equals(username.getText())) {
					username.setText("");
					username.setForeground(Color.BLACK);
				}
			}
		});
		
		password.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if("".equals(password.getText())||password.getText()==null) {
					password.setEchoChar((char)0);
					password.setText("设置您的密码");
					password.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if("设置您的密码".equals(password.getText())) {
					password.setEchoChar('⚫');
					password.setText("");
					password.setForeground(Color.BLACK);
				}
			}
		});
		
		
		
		repass.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if("".equals(repass.getText())||repass.getText()==null) {
					repass.setEchoChar((char)0);
					repass.setText("确认您的密码");
					repass.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if("确认您的密码".equals(repass.getText())) {
					repass.setEchoChar('⚫');
					repass.setText("");
					repass.setForeground(Color.BLACK);
				}
			}
		});
		
		
		
		mail.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if("".equals(mail.getText())||mail.getText()==null) {
					mail.setText("设置您的邮箱");
					mail.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if("设置您的邮箱".equals(mail.getText())) {
					mail.setText("");
					mail.setForeground(Color.BLACK);
				}
			}
		});
		
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				error = new ArrayList<>();
				if(username.getText()==null ||"".equals(username.getText())) {
					error.add("用户名不能为空");
				}
				if(password.getText()==null ||"".equals(password.getText())) {
					error.add("密码不能为空");
				}
				if(!password.getText().equals(repass.getText())) {
					error.add("密码不一致");
				}
				
				if(error.isEmpty()) {
					IUserDao udao = DaoFactory.createUserDao();
					User user =new User();
					Random random = new Random();
					user.setUd(random.nextInt(1000));
					user.setName(username.getText());
					user.setPassword(password.getText());
					user.setMail(mail.getText());
					Boolean res=false;
					try {
						res = udao.doInsertUser(user);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					if(res) {
						JOptionPane.showMessageDialog(null, "注册成功", "系统提示", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "注册失败", "系统提示", JOptionPane.OK_OPTION);
					}
				}else {
					JOptionPane.showMessageDialog(null, error.get(error.size()-1), "系统提示", JOptionPane.OK_OPTION);
				}
			}
		});
		
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				username.setText("填写注册的用户名");
				username.setForeground(Color.GRAY);
				password.setEchoChar((char)0);
				password.setText("设置您的密码");
				password.setForeground(Color.GRAY);
				repass.setText("确认您的密码");
				repass.setForeground(Color.GRAY);
				repass.setEchoChar((char)0);
				mail.setText("设置您的邮箱");
				mail.setForeground(Color.GRAY);
			}
		});
	}
}
