package com.pancats.view.components;

import javax.swing.Icon;

public class IconRButton extends RButton {
	private static final long serialVersionUID = 1L;
	public IconRButton(Icon icon,String name) {
		super(name);
		setIcon(icon);
	}
}
