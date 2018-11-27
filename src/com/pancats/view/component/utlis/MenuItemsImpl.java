package com.pancats.view.component.utlis;

import java.awt.Color;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.pancats.view.components.ButtonFactory;
import com.pancats.view.components.IconRButton;
import com.pancats.view.event.MenuMouseListener;
import com.pancats.view.event.WebsiteListener;


public class MenuItemsImpl implements MenuItems {
	public MenuItemsImpl() {
	}
	
	/**
	 * �˵���ť���
	 * @param iconPath
	 * @param text
	 * @return
	 */
	private JButton setButton(File iconPath,String text) {
		Color bcolor = new Color(36,142,194);
		Icon icon = new ImageIcon(iconPath.getAbsolutePath());
		IconRButton button = ButtonFactory.createIconRButton(icon,text);
		button.setIconTextGap(28);
		button.setGradualPaint(0, 0, bcolor, 0, 0, bcolor);
		button.setBorderStyle(bcolor, bcolor);
		button.setForeground(Color.WHITE);
		button.setHorizontalTextPosition(SwingConstants.RIGHT);
		button.addMouseListener(new MenuMouseListener());
		button.setRadian(0);
		return button;
	};
	
	@Override
	public JButton websiteInfoItem() {
		return setButton(new File("../blogManager/images/website.png"),"վ����Ϣ");
	}

	@Override
	public JButton blogItem() {
		return setButton(new File("../blogManager/images/blog.png"),"���͹���");
	}

	@Override
	public JButton usersItem() {
		return setButton(new File("../blogManager/images/users.png"),"�û�����");
	}

	@Override
	public JButton logItem() {
		return setButton(new File("../blogManager/images/log.png"),"��־����");
	}
	@Override
	public JButton messageItem() {
		return setButton(new File("../blogManager/images/message.png"),"���Թ���");
	}
	@Override
	public JButton webItem() {
		return setButton(new File("../blogManager/images/web.png"),"��վ����");
	}
	
	@Override
	public JButton systemHomeItem() {
		return setButton(new File("../blogManager/images/system2.png"),"ϵͳ��ҳ");
	}
	@Override
	public JButton menu() {
		File menuIcon = new File("../blogManager/images/menu.png");
		Icon icon = new ImageIcon(menuIcon.getAbsolutePath());
		IconRButton button = ButtonFactory.createIconRButton(icon,"ϵͳ����");
		button.setIconTextGap(50);
		button.setGradualPaint(0, 0, new Color(48,155,209), 0, 0, new Color(48,155,209));
		button.setBorderStyle(Color.WHITE, Color.WHITE);
		button.setForeground(Color.WHITE);
		button.setHorizontalTextPosition(SwingConstants.LEFT);
		return button;
	}







}
