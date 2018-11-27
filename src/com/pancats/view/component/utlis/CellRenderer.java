package com.pancats.view.component.utlis;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


public class CellRenderer extends JLabel implements TableCellRenderer{
	private static final long serialVersionUID = 1L;
	//private JCheckBox checkBox=null;
	private static final Font FONT1 = new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,16);
	private static final Color BC1 = new Color(249,249,249);
	private static final Color BC2 = new Color(255,255,255);
	private static final Color SELECTEDROW = new Color(184, 207,229);
	public CellRenderer() {
	}
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		setOpaque(true);
		setText(value.toString());
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(FONT1);
		if(row%2==0) {
			setBackground(BC2);
		}else {
			setBackground(BC1);
		}
		if(row == table.getSelectedRow()) {
			setBackground(SELECTEDROW);
		}
		
		return this;
	}
	
	
}
