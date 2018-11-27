package com.pancats.view.component.utlis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableModel;

import com.pancats.view.components.PTable;
import com.pancats.view.components.TableFactory;

public class OperateModel implements ContentOperate {
	private JLabel titleArea=null;
	private Dimension dimension=null;
	private JPanel operatePanel=null;
	private String name=null;
	private PTable table = null;
	private JPanel displayData=null;
	private final Color BC1=new Color(246, 246, 246);
	private Font font = new Font("΢���ź�", Font.BOLD, 16);
	
	public OperateModel(Dimension dimension) {
		this.dimension=dimension;
		table = TableFactory.createTable();
	}
	
	@Override
	public JPanel getOperatePanel() {
		operatePanel= new JPanel();
		operatePanel.setLayout(new BorderLayout());
		operatePanel.setBackground(BC1);
		operatePanel.setPreferredSize(dimension);
		operatePanel.setBorder(BorderFactory.createMatteBorder(25, 0, 25, 25,BC1));
		operatePanel.add(BorderLayout.NORTH, getTitleArea());
		table.setRowHeight(35);
		table.setHeadFont(font);
		table.setDefaultRenderer(Object.class,new CellRenderer());
		operatePanel.add(table.getJScrollPane());//����񴴽��������������صĴ��й������ı����ӵ������������
		operatePanel.add(BorderLayout.SOUTH,getDisplayDataArea());
		return operatePanel;
	}
	
	private JPanel getDisplayDataArea() {
		displayData = new JPanel();
		displayData.setBackground(Color.WHITE);
		displayData.setPreferredSize(new Dimension(0, 300));
		displayData.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
		JLabel hint = new JLabel("������������");
		hint.setFont(new Font("΢���ź�",Font.BOLD,18));
		displayData.add(hint);
		return displayData;
	}
	@Override
	public void setTitle(String name) {
		this.name=name;
	}

	@Override
	public void setData(TableModel tableModel) {
		table.setModel(tableModel);
	}

	
	private JLabel getTitleArea() {
		titleArea=new JLabel(name);
		titleArea.setPreferredSize(new Dimension(operatePanel.getWidth(), 40));
		titleArea.setHorizontalAlignment(SwingConstants.CENTER);
		titleArea.setFont(new Font("΢���ź�",Font.BOLD,16));
		titleArea.setBackground(Color.WHITE);
		titleArea.setForeground(new Color(80,80,80));
		titleArea.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(230,230,230)));
		titleArea.setOpaque(true);
		return titleArea;
	}
	
	public PTable getPTable() {
		return this.table;
	}
}
