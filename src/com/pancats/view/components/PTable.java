package com.pancats.view.components;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
public class PTable extends JTable {
	private static final long serialVersionUID = 1L;
	private JScrollPane jsp = null;

	public PTable() {
	}
	public PTable(int numRows, int numColumns) {
		super(numRows,numColumns);
	}
	
	public PTable(TableModel dm, TableColumnModel cm) {
		super(dm, cm, null);
    }
	
	public PTable(Object[][] rowData, Object[] columnNames) {
		super(rowData, columnNames);
	}
	
	public PTable(TableModel dm){
		super(dm);
	}
	public PTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
		super(dm,cm,sm);
	}
	
	
	public void setHeadFont(Font font) {
		JTableHeader th = this.getTableHeader();
		th.setFont(font);
	}
	
	/**
	 * 获取PTable的滚动面板
	 * @return
	 */
	public JScrollPane getJScrollPane() {
		this.jsp=new JScrollPane(this);
		this.jsp.getVerticalScrollBar().setUI(new ScrollBarUIBar());
		return jsp;
	}
	/**
	 * 设置单元格样式
	 * @param columnClass
	 * @param editor
	 * @param renderer
	 */
	public void setCellEditStyle(Class<?> columnClass,TableCellEditor editor,TableCellRenderer renderer) {
		this.setDefaultEditor(columnClass, editor);
		this.setDefaultRenderer(columnClass, renderer);
	}
}
