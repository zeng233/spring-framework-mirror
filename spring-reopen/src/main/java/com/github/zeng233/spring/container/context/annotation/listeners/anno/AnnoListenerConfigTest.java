package com.github.zeng233.spring.container.context.annotation.listeners.anno;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zenghua
 * @date 2022/9/21
 */
public class AnnoListenerConfigTest {

	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoListenerConfig.class);
		context.publishEvent(new MyAnnoEvent1());
	}
}
