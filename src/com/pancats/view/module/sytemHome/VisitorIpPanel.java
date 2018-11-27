package com.pancats.view.module.sytemHome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;

import com.pancats.view.component.utlis.DefaultTableData;
import com.pancats.view.component.utlis.ModulePanel;
import com.pancats.view.component.utlis.MyTableModel;
import com.pancats.view.components.LabelFactory;
import com.pancats.view.components.PTable;
import com.pancats.view.components.TableFactory;

public class VisitorIpPanel implements ModulePanel{
	private JPanel panel=null;
	@Override
	public JPanel getPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(36, 142, 194)));
		JLabel titleBar = LabelFactory.createFrameTitleBar("  今日游客访问IP");
		titleBar.setOpaque(true);
		titleBar.setFont(new Font("微软雅黑",Font.PLAIN,16));
		titleBar.setBackground(new Color(36, 142, 194));
		titleBar.setPreferredSize(new Dimension(0, 30));
		
		PTable table = TableFactory.createTable();
		table.setModel(getDatas());
		table.setFont(new Font("",Font.PLAIN,16));
		table.setRowHeight(30);
		JScrollPane jScrollPane = table.getJScrollPane();
		panel.add(BorderLayout.NORTH,titleBar);
		panel.add(jScrollPane);
		return panel;
	}

	public TableModel getDatas() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Object[] data1 = { sdf.format(new Date()), "192.168.0.1"};
		Object[] data2 = { sdf.format(new Date()), "192.168.121.1"};
		Object[] data3 = { sdf.format(new Date()), "192.168.1.1"};
		Object[] data4 = { sdf.format(new Date()), "192.168.5.1"};
		Object[] data5 = { sdf.format(new Date()), "192.168.2.1"};
		Object[][] datas= {data1,data2,data3,data4,data5,data1,data2,data3,data4,data5};
		Object[] colNames= {"时间","IP地址"};
		DefaultTableData dtd = new DefaultTableData(colNames,datas);
		MyTableModel mtm = new MyTableModel(dtd);
		return mtm;
	} 
}
