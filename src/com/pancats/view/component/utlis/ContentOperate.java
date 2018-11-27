package com.pancats.view.component.utlis;

import javax.swing.JPanel;
import javax.swing.table.TableModel;

public interface ContentOperate {
	
	/**
	 * 获取操作台面板
	 * @return
	 */
	JPanel getOperatePanel();
	/**
	 * 设置标题
	 * @param name
	 */
	void setTitle(String name);
	/**
	 * 设置表格显示的数据
	 * @param datas
	 */
	void setData(TableModel tableModel);
}
