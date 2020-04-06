package org.springframework.alexander.model;


/**
 * @author Alex
 * @version 1.0.0
 * @date 2020/3/31
 */

public class MyBean {
	private String beanName;

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void setBeanAge(String beanAge) {
		this.beanAge = beanAge;
	}

	public void setBeanSize(String beanSize) {
		this.beanSize = beanSize;
	}

	public void setBeanMember(String beanMember) {
		this.beanMember = beanMember;
	}

	public String getBeanName() {
		return beanName;
	}

	public String getBeanAge() {
		return beanAge;
	}

	public String getBeanSize() {
		return beanSize;
	}

	public String getBeanMember() {
		return beanMember;
	}

	private String beanAge;
	private String beanSize;
	private String beanMember;


}
