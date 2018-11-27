package com.pancats.dao.factory;

import com.pancats.dao.IUserDao;
import com.pancats.dao.proxy.IUserDaoProxy;

public class DaoFactory {
	public static IUserDao createIUserDao() {
		return new IUserDaoProxy();
	}
}
