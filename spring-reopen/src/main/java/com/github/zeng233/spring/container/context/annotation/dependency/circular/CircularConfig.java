package com.github.zeng233.spring.container.context.annotation.dependency.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularConfig {
	@Autowired
	private CircularBean1 circularBean1;

	@Autowired
	private CircularBean2 circularBean2;

	@Bean
	public CircularBean1 circularBean1() {
		CircularBean1 circularBean1 = new CircularBean1();
		circularBean1.setCircularBean2(circularBean2);
		return circularBean1;
	}

	@Bean
	public CircularBean2 circularBean2() {
		CircularBean2 circularBean2 = new CircularBean2();
		circularBean1.setCircularBean2(circularBean2);
		return circularBean2;
	}
}
