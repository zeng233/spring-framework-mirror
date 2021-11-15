package com.github.zeng233.spring.container.context.annotation.listeners;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/11/15 14:17
 * @Version 1.0
 */
public class ListenerTest {

	/**
	 * 何时出发自定义的listener的
	 */
	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ListenerConfig.class);
		context.publishEvent(new MyEvent(1));
		MyEventListener myEventListener = context.getBean("myEventListener", MyEventListener.class);
		System.out.println(myEventListener);
	}
}
