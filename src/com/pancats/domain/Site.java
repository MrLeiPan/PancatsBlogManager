package com.pancats.domain;
/**
 * վ����Ϣ
 * sd:����
 * key����
 * value��ֵ
 * @author С����
 *
 */
public class Site {
	private Integer sd=null;
	private String key=null;
	private String value=null;
	public Integer getSd() {
		return sd;
	}
	public void setSd(Integer sd) {
		this.sd = sd;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Site [sd=" + sd + ", key=" + key + ", value=" + value + "]";
	}
	
	
}
