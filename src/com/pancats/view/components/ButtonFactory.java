package com.pancats.view.components;

import javax.swing.Icon;

/**
 * 按钮组件
 * @author 小疯子
 *
 */
public class ButtonFactory{
	
	public static RButton createRButton(String name) {
		return new RButton(name); 
	}
	
	public static IconRButton createIconRButton(Icon icon,String name) {
		return new IconRButton(icon, name); 
	}
}


