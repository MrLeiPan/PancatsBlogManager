package com.pancats.view.module.user;

import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import com.pancats.domain.User;
import com.pancats.domain.Website;
import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.MyTableModel;
import com.pancats.view.component.utlis.Operate;
import com.pancats.view.component.utlis.OperateModel;
import com.pancats.view.component.utlis.TableDatas;

public class UserOperate implements Operate<User>{
	private OperateModel om=null;
	private Object[] columnNames=null;
	private TableDatas<User> td=null;
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
		DefaultTableData dtd = new DefaultTableData(columnNames, td.getDatas());
		om.setData(new MyTableModel(dtd));
	}
	
	public JPanel getOperate() {
		return om.getOperatePanel();
	}
}

