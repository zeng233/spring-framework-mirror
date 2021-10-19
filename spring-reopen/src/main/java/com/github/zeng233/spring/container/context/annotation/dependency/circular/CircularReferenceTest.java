package com.github.zeng233.spring.container.context.annotation.dependency.circular;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 循环依赖测试
 */
public class CircularReferenceTest {

	/**
	 * 循环依赖
	 */
	@Test
	public void testCircular() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(CircularConfig.class);
		context.refresh();
		CircularBean1 circularBean1 = context.getBean(CircularBean1.class);
		System.out.println(circularBean1);
		System.out.println(circularBean1.getCircularBean2());
	}
}
