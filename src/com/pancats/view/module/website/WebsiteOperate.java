package com.pancats.view.module.website;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.MyTableModel;
import com.pancats.view.component.utlis.Operate;
import com.pancats.view.component.utlis.OperateModel;
import com.pancats.view.component.utlis.TableDatas;
import com.pancats.domain.*;
public class WebsiteOperate implements Operate<Website> {
	private OperateModel om=null;
	private Object[] columnNames=null;
	private TableDatas<Website> td=null;
	public WebsiteOperate(Dimension ds) {
		om= new OperateModel(ds);
	}
	
	public void setTitle(String title) {
		om.setTitle(title);
	}
	public void setColumnNames(Object[] columnNames) {
		this.columnNames=columnNames;
	}
	public void initData(List<Website> datalist) {
		td=new TableDatas<>(datalist,Website.class);
		DefaultTableData dtd = new DefaultTableData(columnNames, td.getDatas());
		om.setData(new MyTableModel(dtd));
	}
	
	public JPanel getOperate() {
		return om.getOperatePanel();
	}

}
