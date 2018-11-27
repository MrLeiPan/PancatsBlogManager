package com.pancats.view.module.blog;

import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;

import com.pancats.domain.Blog;
import com.pancats.domain.Log;
import com.pancats.domain.User;
import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.MyTableModel;
import com.pancats.view.component.utlis.OperateModel;
import com.pancats.view.component.utlis.TableDatas;

public class BlogOperate {
	private OperateModel om=null;
	private Object[] columnNames=null;
	private TableDatas<Blog> td=null;
	public BlogOperate(Dimension ds) {
		om= new OperateModel(ds);
	}
	
	public void setTitle(String title) {
		om.setTitle(title);
	}
	public void setColumnNames(Object[] columnNames) {
		this.columnNames=columnNames;
	}
	public void initData(List<Blog> datalist) {
		td=new TableDatas<>(datalist, Blog.class);
		DefaultTableData dtd = new DefaultTableData(columnNames, td.getDatas());
		om.setData(new MyTableModel(dtd));
	}
	
	public JPanel getOperate() {
		return om.getOperatePanel();
	}
}

