package com.pancats.view.component.utlis;

import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CellEditor extends DefaultCellEditor {
	private static final long serialVersionUID = 1L;
	private JComponent editor=null;
	public CellEditor(JComponent editor) {
		super(new JTextField());
		this.editor=editor;
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		editor.setBackground(table.getBackground());
		editor.setForeground(table.getForeground());
		return editor;
	}
	
}
