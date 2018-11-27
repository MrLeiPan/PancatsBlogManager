package com.pancats.domain;

import org.junit.Test;

import com.pancats.util.BeanOrder;
import com.pancats.util.BeanOrder.BeanOrders;

public class User {
	private Integer ud=null;
	private String name=null;
	private String password=null;
	private String mail=null;
	@BeanOrders(1)
	public Integer getUd() {
		return ud;
	}

	public void setUd(Integer ud) {
		this.ud = ud;
	}
	@BeanOrders(2)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@BeanOrders(3)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@BeanOrders(4)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "User [ud=" + ud + ", name=" + name + ", password=" + password + ", mail=" + mail + "]";
	}
	
	
}
