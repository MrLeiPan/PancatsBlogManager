package com.pancats.domain;

import java.util.Date;
/**
 * ��־��
 * ld:����
 * title������
 * happendate����������
 * trigger��������
 * type������
 * @author С����
 *
 */
public class Log {
	private Integer ld=null;
	private String title=null;
	private Date happendate=null;
	private String trigger=null;
	private String type=null;
	public Integer getLd() {
		return ld;
	}
	public void setLd(Integer ld) {
		this.ld = ld;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getHappendate() {
		return happendate;
	}
	public void setHappendate(Date happendate) {
		this.happendate = happendate;
	}
	public String getTrigger() {
		return trigger;
	}
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Log [ld=" + ld + ", title=" + title + ", happendate=" + happendate + ", trigger=" + trigger + ", type="
				+ type + "]";
	}
	
	
}
