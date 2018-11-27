package com.pancats.view.component.utlis;

import javax.swing.JComboBox;

/**
 * Ĭ��
 * @author С����
 *
 */
public class DefaultTableData implements TableData {
	private Object[] columnNames=null;//����
	private Object[][] datas=null;//������
	private Class<?>[] colTypes=null;//�Զ���������
	
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
	 * ���������л�ȡ��һ������
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
	 * �Զ�������
	 * @param colTypes
	 */
	public void setColumnTypes(Class<?>[] colTypes) {
		this.colTypes=colTypes;
	}
	
}
