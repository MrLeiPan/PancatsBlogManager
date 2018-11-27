package com.pancats.dao.factory;

import com.pancats.dao.IBlog;
import com.pancats.dao.IMessage;
import com.pancats.dao.ILog;
import com.pancats.dao.ISite;
import com.pancats.dao.IUserDao;
import com.pancats.dao.IVisitor;
import com.pancats.dao.IWebsite;
import com.pancats.dao.proxy.IBlogDaoProxy;
import com.pancats.dao.proxy.IMessageDaoProxy;
import com.pancats.dao.proxy.ILogDaoProxy;
import com.pancats.dao.proxy.ISiteDaoProxy;
import com.pancats.dao.proxy.IUserDaoProxy;
import com.pancats.dao.proxy.IVisitorDaoProxy;
import com.pancats.dao.proxy.IWebsiteDaoProxy;

public class DaoFactory {
	/**
	 * user表
	 * @return
	 */
	public static IUserDao createUserDao() {
		return new IUserDaoProxy();
	}
	/**
	 * blog表
	 * @return
	 */
	public static IBlog createBlogDao() {
		return new IBlogDaoProxy();
	}
	/**
	 * leave表
	 * @return
	 */
	public static IMessage createMessage() {
		return new IMessageDaoProxy();
	}
	
	/**
	 * log表
	 * @return
	 */
	public static ILog createLog() {
		return new ILogDaoProxy();
	}
	/**
	 * site表
	 * @return
	 */
	public static ISite createSite() {
		return new ISiteDaoProxy();
	}
	/**
	 * visitor表
	 * @return
	 */
	public static IVisitor createVisitor() {
		return new IVisitorDaoProxy();
	}
	/**
	 * website表
	 * @return
	 */
	public static IWebsite createWebsite() {
		return new IWebsiteDaoProxy();
	}
}
