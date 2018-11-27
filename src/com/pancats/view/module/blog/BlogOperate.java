package com.pancats.view.module.blog;

import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import com.pancats.domain.User;
import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.OperateModel;
import com.pancats.view.component.utlis.TableDatas;

public class BlogOperate {
	private OperateModel om=null;
	private Object[] columnNames=null;
	private TableDatas<User> td=null;
	public BlogOperate(Dimension ds) {
		om= new OperateModel(ds);
	}
	
	public void setTitle(String title) {
		om.setTitle(title);
	}
	public void setColumnNames(Object[] columnNames) {
		this.columnNames=columnNames;
	}
/*	public void initData(List<Log> datalist) {
		td=new TableDatas<>(datalist, Log.class);
		om.setData(new DefaultTableData(columnNames,td.getDatas()));
	}*/
	
	public JPanel getOperate() {
		return om.getOperatePanel();
	}
}

