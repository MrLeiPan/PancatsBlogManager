package com.pancats.view.component.utlis;

import javax.swing.table.AbstractTableModel;

public class RAMTableModel extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
	private DefaultTableData tableData=null;
	public RAMTableModel(DefaultTableData tableData) {
		this.tableData=tableData;
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
		Object[][] datas = tableData.getDatas();
		return datas[rowIndex][columnIndex];
	}

	
}
