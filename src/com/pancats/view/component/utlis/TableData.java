package com.pancats.view.component.utlis;
/*
 * �������
 * 
 */
public interface TableData {
	/**
	 * ��ȡ����
	 * @return
	 */
	Object[] getColumnNames();
	/**
	 * ��ȡ������
	 * @return
	 */
	Object[][] getDatas();
	/**
	 * ��ȡÿ�����ݵ�����
	 * @return
	 */
	Class<?>[] getColumnTypes();
	/**
	 * ��ȡ��������---->��¼
	 * @return
	 */
	int getDataCount();
	/***
	 * ��ȡ����
	 * @return
	 */
	int getColumnCount();
	
}
