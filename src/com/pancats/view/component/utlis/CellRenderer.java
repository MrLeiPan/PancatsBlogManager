package com.pancats.view.component.utlis;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


public class CellRenderer extends JCheckBox implements TableCellRenderer{
	private static final long serialVersionUID = 1L;
	//private JCheckBox checkBox=null;
	private static final Font FONT1 = new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,16);
	private static final Color BC1 = new Color(249,249,249);
	private static final Color BC2 = new Color(255,255,255);
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		setForeground(table.getSelectionForeground());
		setBackground(table.getSelectionBackground());
		setFont(FONT1);
		return this;
	}
	
	
}
