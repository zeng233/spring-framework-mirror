package com.github.zeng233.spring.container.bean.propertyeditors;

/**
 * @author zenghua
 * @date 2022/10/19
 */
public class MultiNameBean {

	private String name1;

	private String name2;

	public MultiNameBean(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public String toString() {
		return "First name: " + name1 + " - Last name: " + name2;
	}
}
