package com.pancats.view.component.utlis;
/*
 * 表格数据
 * 
 */
public interface TableData {
	/**
	 * 获取列名
	 * @return
	 */
	Object[] getColumnNames();
	/**
	 * 获取数据域
	 * @return
	 */
	Object[][] getDatas();
	/**
	 * 获取每列数据的类型
	 * @return
	 */
	Class<?>[] getColumnTypes();
	/**
	 * 获取数据总数---->记录
	 * @return
	 */
	int getDataCount();
	/***
	 * 获取列数
	 * @return
	 */
	int getColumnCount();
	
}
