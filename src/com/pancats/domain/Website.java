package com.pancats.domain;
/**
 * ��վ�����
 * wd:����
 * key����
 * value��ֵ
 * @author С����
 *
 */
public class Website {
	private Integer wd=null;
	private String key=null;
	private String value=null;
	public Integer getWd() {
		return wd;
	}
	public void setWd(Integer wd) {
		this.wd = wd;
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
		return "Website [wd=" + wd + ", key=" + key + ", value=" + value + "]";
	}
	
	
}
