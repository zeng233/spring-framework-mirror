package com.github.zeng233.spring.container.context.annotation.componentsacn;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/13 上午11:51
 */
public class AppScanConfigTest {


	@Test
	public void testListBean() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppScanConfig.class);
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}
}
