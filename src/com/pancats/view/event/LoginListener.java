package com.pancats.view.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.pancats.dao.IUserDao;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.view.Login;
import com.pancats.view.MainFrame;

public class LoginListener implements ActionListener{
	private Login login=null;
	public LoginListener(Login login) {
		this.login=login;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		IUserDao udao = DaoFactory.createUserDao();
		try {
			if(udao.findByNameByPassword(login.getUserName(),login.getUserPassword())==null) {
				JOptionPane.showMessageDialog(null, "µÇÂ½Ê§°Ü");
			}else {
				login.dispose();
				MainFrame mainframe = new MainFrame(login.getUserName());
				mainframe.setVisible(true);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
