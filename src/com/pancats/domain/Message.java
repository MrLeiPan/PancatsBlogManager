package com.pancats.domain;
import java.util.Date;
/**
 * ���Ա�
 * md:����
 * ip��������ip
 * mail������������
 * leavedate����������
 * content����������
 * status������״̬(�Ƿ�鿴��)
 * @author С����
 * 
 */
public class Message {
	private Integer md=null;
	private String ip=null;
	private String mail=null;
	private Date leavedate=null;
	private String content=null;
	private Integer status=null;
	public Integer getMd() {
		return md;
	}
	public void setMd(Integer md) {
		this.md = md;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getLeavedate() {
		return leavedate;
	}
	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Leave [md=" + md + ", ip=" + ip + ", mail=" + mail + ", leavedate=" + leavedate + ", content=" + content
				+ ", status=" + status + "]";
	}
	
	
}
