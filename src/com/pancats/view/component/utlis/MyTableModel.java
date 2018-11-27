package com.pancats.view.component.utlis;
import javax.swing.table.AbstractTableModel;
public class MyTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private Object[] tableHeader=null;
	private TableData tableData=null;
	private Object[][] datas=null;
	private Class<?>[] typeArray=null;
	public MyTableModel(TableData tableData) {
		this.tableData=tableData;
		initMy();
	}
	/**
	 * ≥ı ºªØ
	 */
	private void initMy() {
		this.datas=tableData.getDatas();
		this.typeArray=tableData.getColumnTypes();
		this.tableHeader=tableData.getColumnNames();
	}
	
	@Override
	public int getRowCount() {
		return tableData.getDataCount();
	}

	@Override
	public int getColumnCount() {
		return tableData.getColumnCount();
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return datas[rowIndex][columnIndex];
	}
	
	@Override
	public String getColumnName(int column) {
		return this.tableHeader[column].toString();
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		datas[rowIndex][columnIndex]=aValue;
		fireTableCellUpdated(rowIndex, columnIndex);
	}
 
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return typeArray[columnIndex];
	}
	
}
