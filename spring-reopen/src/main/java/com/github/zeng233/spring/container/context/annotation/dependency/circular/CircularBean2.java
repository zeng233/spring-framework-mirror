package com.github.zeng233.spring.container.context.annotation.dependency.circular;

public class CircularBean2 {

	private CircularBean1 circularBean1;

	public CircularBean1 getCircularBean1() {
		return circularBean1;
	}

	public void setCircularBean1(CircularBean1 circularBean1) {
		this.circularBean1 = circularBean1;
	}
}
