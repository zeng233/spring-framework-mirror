package com.github.zeng233.spring.container.context.annotation.dependency.circular;

public class CircularBean1 {

	private CircularBean2 circularBean2;

	public CircularBean2 getCircularBean2() {
		return circularBean2;
	}

	public void setCircularBean2(CircularBean2 circularBean2) {
		this.circularBean2 = circularBean2;
	}
}
