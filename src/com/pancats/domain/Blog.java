package com.pancats.domain;
/**
 * ���ͱ�
 * bd������
 * title������
 * author������
 * publishdate����������
 * modifydate���޸�����
 * pv��������
 * status��״̬(�ö�/�Ƿ�ɼ�)
 */
import java.util.Date;
public class Blog {
	private Integer bd=null;
	private String title=null;
	private String author=null;
	private Date publishdate=null;
	private Date modifydate=null;
	private Integer pv=null;
	private Integer status=null;
	
	public Integer getBd() {
		return bd;
	}
	public void setBd(Integer bd) {
		this.bd = bd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public Date getModifydate() {
		return modifydate;
	}
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
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
		return "Blog [bd=" + bd + ", title=" + title + ", author=" + author + ", publishdate=" + publishdate
				+ ", modifydate=" + modifydate + ", pv=" + pv + ", status=" + status + "]";
	}
	
	
}
