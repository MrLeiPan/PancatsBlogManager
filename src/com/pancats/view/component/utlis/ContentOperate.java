package com.pancats.view.component.utlis;

import javax.swing.JPanel;
import javax.swing.table.TableModel;

public interface ContentOperate {
	
	/**
	 * ��ȡ����̨���
	 * @return
	 */
	JPanel getOperatePanel();
	/**
	 * ���ñ���
	 * @param name
	 */
	void setTitle(String name);
	/**
	 * ���ñ����ʾ������
	 * @param datas
	 */
	void setData(TableModel tableModel);
}
