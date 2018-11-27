package com.pancats.view.module.message;

import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;

import com.pancats.domain.Message;
import com.pancats.domain.Log;
import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.MyTableModel;
import com.pancats.view.component.utlis.Operate;
import com.pancats.view.component.utlis.OperateModel;
import com.pancats.view.component.utlis.TableDatas;
public class MessageOperate implements Operate<Message> {
	private OperateModel om=null;
	private Object[] columnNames=null;
	private TableDatas<Message> td=null;
	public MessageOperate(Dimension ds) {
		om= new OperateModel(ds);
	}
	
	public void setTitle(String title) {
		om.setTitle(title);
	}
	public void setColumnNames(Object[] columnNames) {
		this.columnNames=columnNames;
	}
	public void initData(List<Message> datalist) {
		td=new TableDatas<>(datalist,Message.class);
		DefaultTableData dtd = new DefaultTableData(columnNames, td.getDatas());
		om.setData(new MyTableModel(dtd));
	}
	
	public JPanel getOperate() {
		return om.getOperatePanel();
	}
}

