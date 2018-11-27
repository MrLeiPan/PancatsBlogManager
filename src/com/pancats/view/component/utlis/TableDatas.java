package com.pancats.view.component.utlis;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.pancats.util.MethodSortCollections;
/**
 * �����ݿ������ת��Ϊ 
 * @author С����
 *
 * @param <T>
 */
public final class TableDatas<T> {
	private List<T> datalist = null;
	private Class<T> clas = null;
	private Object[] data = null;
	private Object[][] datas = null;
	private Field[] fields = null;
	private int fieldCount = 0;

	public TableDatas(List<T> datalist, Class<T> classpath) {
		this.datalist = datalist;
		this.clas = classpath;
		this.fieldCount = getFieldCount();
		transform();
	}
	/**
	 * ��ȡ��ά����
	 * @return
	 */
	public Object[][] getDatas() {
		return datas;
	}
	/**
	 * ��ȡ�����ķ���
	 * @return
	 */
	private List<Method> getMethodSort() {
		Method[] method = clas.getDeclaredMethods();
		List<Method> methodList = new ArrayList<>();
		for(Method m:method) {
			String mName = m.getName().substring(0, 3);
			if("get".equals(mName)) {
				methodList.add(m);
			}
		}
		Collections.sort(methodList,new MethodSortCollections());
		return methodList;
	}
	/**
	 * list����ת����ά����
	 */
	private void transform() {
		if(datalist.isEmpty()) {
			datas=null;
		}else {
			datas = new Object[datalist.size()][];
			for (int v = 0; v < datalist.size(); v++) {
				datas[v] = getValuesObject(datalist.get(v));
			}
		}
	}
	/**
	 * ��ÿ��listԪ��ת��һά����
	 * @param obj
	 * @return
	 */
	private Object[] getValuesObject(Object obj) {
		List<Method> methods = getMethodSort();
		data = new Object[fieldCount];
		for(int i=0;i<methods.size();i++) {
			try {
				data[i]=methods.get(i).invoke(obj);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
	/**
	 * ��ȡ�ֶθ���
	 * @return
	 */
	public int getFieldCount() {
		fields = clas.getDeclaredFields();
		return fields.length;
	}
}
