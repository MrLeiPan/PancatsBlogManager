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
		Object[] firstRowData = getFirstRowData();
		for(int i=0;i<types.length;i++) {
			types[i]=firstRowData[i].getClass();
		}
		return types;
	}

	@Override
	public int getDataCount() {
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
	
	public static void main(String[] args) {
		Object[] data1 = { "200913420125", "SUMMER", new Boolean(true),
				new Integer(20), "1", "NULL" };
		Object[] data2 = { "200913420124", "WULEI", new Boolean(true),
				new Integer(20), "2", "NULL" };
		Object[] data3 = { "200913420125", "BOOK", new Boolean(false),
				new Integer(20), "3", "NULL" };
		Object[] data4 = { "200913420125", "CUP", new Boolean(true),
				new Integer(20), "4", "NULL" };
		Object[] data5 = { "200913420125", "MOUSE", new Boolean(true),
				new Integer(20), "5", "NULL" };
		Class[] typeArray = { Object.class, Object.class, Boolean.class,
				Integer.class, JComboBox.class, Object.class };
		Object[][] data = { data1, data2, data3, data4, data5 };
		String[] head = { "ID", "NAME", "SEX(boy)", "AGE", "ADDRESS", "DEMO" };
		DefaultTableData dtd = new DefaultTableData(head, data);
		dtd.setColumnTypes(typeArray);
		Class<?>[] columnTypes = dtd.getColumnTypes();
		for (Class<?> class1 : columnTypes) {
			System.out.println(class1);
		}
	}
}
