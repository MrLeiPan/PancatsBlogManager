package com.pancats.view.component.utlis;

import java.util.List;

import javax.swing.JPanel;

public interface Operate<T> {
	void setTitle(String title);
	void setColumnNames(Object[] columnNames);
	void initData(List<T> datalist);
	JPanel getOperate();
}
