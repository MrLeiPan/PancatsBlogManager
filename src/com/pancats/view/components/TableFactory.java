package com.pancats.view.components;

import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class TableFactory {
	
	
	public static PTable createTable() {
		return new PTable();
	}
	public static PTable createTable(Object[][] rowData, Object[] columnNames) {
		return new PTable(rowData,columnNames);
	}
	
	public static PTable createTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
		return new PTable(dm,cm,sm);
	}
	
	public static PTable createTable(int numRows, int numColumns) {
		return new PTable(numRows,numColumns);
	}
	
	public static PTable createTable(TableModel dm, TableColumnModel cm) {
		return new PTable(dm,cm);
	}
	
	public static PTable createTable(TableModel dm) {
		return new PTable(dm);
	}
	
	
}
