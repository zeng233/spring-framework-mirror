package com.github.zeng233.spring.container.context.annotation.config.env;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.StandardEnvironment;

/**
 * @author zenghua
 * @date 2022/8/26
 */
public class EnvTest {

	private AnnotationConfigApplicationContext context;

	@Before
	public void before() {
		context = new AnnotationConfigApplicationContext(EnvConfig.class);
	}

	@Test
	public void testSimple() {
		EnvBean envBean = context.getBean("envBean", EnvBean.class);
		StandardEnvironment environment = new StandardEnvironment();
		System.out.println(envBean);
	}
}
