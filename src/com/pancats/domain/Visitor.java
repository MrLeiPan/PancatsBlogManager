package com.pancats.domain;

import java.util.Date;
/**
 * 游客表
 * td:主键
 * ip：游客ip
 * visitordate：访问日期
 * pv：访问次数
 * status：状态(是否禁止该ip)
 * @author 小疯子
 *
 */
public class Visitor {
	private String td=null;
	private String ip=null;
	private Date visitordate=null;
	private Integer pv=null;
	private Integer status=null;
	public String getTd() {
		return td;
	}
	public void setTd(String td) {
		this.td = td;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getVisitordate() {
		return visitordate;
	}
	public void setVisitordate(Date visitordate) {
		this.visitordate = visitordate;
	}
	public Integer getPv() {
		return pv;
	}
	public void setPv(Integer pv) {
		this.pv = pv;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Visitor [td=" + td + ", ip=" + ip + ", visitordate=" + visitordate + ", pv=" + pv + ", status=" + status
				+ "]";
	}
	
	
}
