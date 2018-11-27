package com.pancats.view.components;

import javax.swing.Icon;

/**
 * ��ť���
 * @author С����
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


