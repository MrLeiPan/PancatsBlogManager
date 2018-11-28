package com.pancats.view.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.pancats.view.components.BasicPopupMenu;
import com.pancats.view.components.PTable;

public class PTableMouseListener extends MouseAdapter {
	private BasicPopupMenu pMenu=null;
	public PTableMouseListener(BasicPopupMenu popupMenu) {
		this.pMenu=popupMenu;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		PTable table = (PTable)e.getSource();
		int currentMouseindex = -1;
		if(e.getButton()==MouseEvent.BUTTON3) {// Û±Í”“ª˜
			currentMouseindex = table.rowAtPoint(table.getMousePosition());
			if(table.getSelectedRow()==currentMouseindex) {
				pMenu.show(table, e.getX(), e.getY());
			}
		}
		
	}
	
}
