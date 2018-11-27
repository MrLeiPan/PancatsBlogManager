package com.pancats.test;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import com.pancats.view.components.PTable;

public class DataLabelTest {

	public static void main(String[] args) {
		String[] columnNames = { "Name", "Age", "Job","Sex"};
		Object[][] rowData = new Object[50][7];

		/*DataLabel<User> d = new DataLabel<User>(u.getClass(),u);
		DataLabel<User> d2 = new DataLabel<User>(u.getClass(),u);*/
		PTable  pt = new PTable(rowData,columnNames);
		JScrollPane jScrollPane = pt.getJScrollPane();
		jScrollPane.setBounds(0, 0, 800, 400);
		pt.setRowHeight(35);
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(800, 400);
		jf.setLayout(null);
		jf.setLocationRelativeTo(null);
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		jp.setBounds(0, 50, 800, 400);
		jf.add(jp);
		jp.add(jScrollPane);
		jf.setVisible(true);
	}
}
