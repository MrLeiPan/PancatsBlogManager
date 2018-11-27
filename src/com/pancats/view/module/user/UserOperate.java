package com.pancats.view.module.user;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.pancats.dao.IUserDao;
import com.pancats.dao.factory.DaoFactory;
import com.pancats.domain.User;
import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.MyTableModel;
import com.pancats.view.component.utlis.Operate;
import com.pancats.view.component.utlis.OperateModel;
import com.pancats.view.component.utlis.TableDatas;
import com.pancats.view.components.BasicPopupMenu;
import com.pancats.view.components.PTable;

public class UserOperate implements Operate<User>{
	private OperateModel om=null;
	private Object[] columnNames=null;
	private TableDatas<User> td=null;
	private DefaultTableData dtd =null;
	private MyTableModel mm = null;
	public UserOperate(Dimension ds) {
		om= new OperateModel(ds);
	}
	
	public void setTitle(String title) {
		om.setTitle(title);
	}
	public void setColumnNames(Object[] columnNames) {
		this.columnNames=columnNames;
	}
	public void initData(List<User> datalist) {
		td=new TableDatas<>(datalist,User.class);
		dtd = new DefaultTableData(columnNames, td.getDatas());
		mm = new MyTableModel(dtd);
		om.setData(mm);
	}
	
	public JPanel getOperate() {
		return om.getOperatePanel();
	}
	
	public void registerListener() {
		PTable pTable = om.getPTable();
		BasicPopupMenu bpm = new BasicPopupMenu();
		JMenuItem deleItem = bpm.getDeleItem();
		deleItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String)pTable.getValueAt(pTable.getSelectedRow(),1);
				try {
					int opt=JOptionPane.showConfirmDialog(null, "确认删除？", "系统提示",JOptionPane.YES_NO_OPTION);
					if(opt==JOptionPane.YES_OPTION) {
						Boolean res = DaoFactory.createUserDao().doDeleteUser(name.trim());
						if(res) {
							JOptionPane.showMessageDialog(null, "删除成功！", "系统提示", JOptionPane.OK_OPTION);
							initData(DaoFactory.createUserDao().findAll());
						}else {
							JOptionPane.showMessageDialog(null, "删除失败！", "系统提示", JOptionPane.OK_OPTION);
						}
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		pTable.addPopupMenu(bpm);
	}
}

