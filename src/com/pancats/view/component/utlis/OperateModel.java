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
	private JPanel OperateArea=null;
	private final Color BC1=new Color(246, 246, 246);
	private TableData tdata=null;
	private Font font = new Font("微软雅黑", Font.BOLD, 16);
	
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
		JLabel title = getTitleArea();
		title.setPreferredSize(new Dimension(operatePanel.getWidth(), 40));
		operatePanel.add(BorderLayout.NORTH,title);
		JPanel operate = getOperateArea();
		operatePanel.add(operate);
		return operatePanel;
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
		titleArea.setHorizontalAlignment(SwingConstants.CENTER);
		titleArea.setFont(new Font("微软雅黑",Font.BOLD,16));
		titleArea.setBackground(Color.WHITE);
		titleArea.setForeground(new Color(80,80,80));
		titleArea.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(230,230,230)));
		titleArea.setOpaque(true);
		return titleArea;
	}
	
	
	private JPanel getOperateArea() {
		table.setRowHeight(35);
		table.setHeadFont(font);
		OperateArea = new JPanel();
		BoxLayout box = new BoxLayout(OperateArea, BoxLayout.Y_AXIS);//盒子布局，自上而下排列
		OperateArea.setLayout(box);
		OperateArea.add(table.getJScrollPane());//给表格创建滚动条并将返回的带有滚动条的表格添加到饥饿层面板中
		return OperateArea;
	}

}
