package com.pancats.domain;
/**
 * 站点信息
 * sd:主键
 * key：键
 * value：值
 * @author 小疯子
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
