package com.pancats.view.component.utlis;

import javax.swing.JComboBox;

/**
 * 默认
 * @author 小疯子
 *
 */
public class DefaultTableData implements TableData {
	private Object[] columnNames=null;//列名
	private Object[][] datas=null;//数据域
	private Class<?>[] colTypes=null;//自定义列类型
	
	public DefaultTableData(Object[][] datas) {
		this.datas=datas;
	}
	public DefaultTableData(Object[] columnNames,Object[][] datas) {
		this.columnNames=columnNames;
		this.datas=datas;
	}
	@Override
	public Object[] getColumnNames() {
		return columnNames;
	}

	@Override
	public Object[][] getDatas() {
		return datas;
	}

	@Override
	public Class<?>[] getColumnTypes() {
		if(this.colTypes!=null) return colTypes; 
		Class<?>[] types=new Class[getColumnCount()];
		for(int i=0;i<types.length;i++) {
			types[i]=Object.class;
		}
		return types;
	}

	@Override
	public int getDataCount() {
		if(datas==null) return 0;
		return datas.length;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	/**
	 * 从数据域中获取第一行数据
	 * @return
	 */
	public Object[] getFirstRowData() {
		if(datas==null) {
			throw new RuntimeException("Data is Null");
		}
		Object[] firstRowdata=new Object[getColumnCount()];
		for(int i=0;i<firstRowdata.length;i++) {
			firstRowdata[i]=datas[0][i];
		}
		return firstRowdata;
	}
	/**
	 * 自定义类型
	 * @param colTypes
	 */
	public void setColumnTypes(Class<?>[] colTypes) {
		this.colTypes=colTypes;
	}
	
}
