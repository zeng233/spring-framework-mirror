package com.github.zeng233.spring.container.context.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 上午11:06
 */
public class AnnotationBeanConfigTest {


	/**
	 * 通过构造函数注册config对象
	 */
	@Test
	public void testConfigWithAnnotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBeanConfig.class);
		ConfigBean configBean = context.getBean("configBean", ConfigBean.class);
		ConfigBean2 configBean2 = context.getBean("configBean2", ConfigBean2.class);
		ConfigBean3 configBean3 = context.getBean("configBean3", ConfigBean3.class);
		System.out.println(configBean);
		System.out.println("configBean.getConfigBean2()：" + configBean.getConfigBean2());
		System.out.println("ConfigBean2：" + configBean2);
		System.out.println("ConfigBean3：" + configBean3);
	}

	/**
	 * 通过register注册
	 */
	@Test
	public void testRegister() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AnnotationBeanConfig.class);
		context.refresh();
		ConfigBean configBean = context.getBean("configBean", ConfigBean.class);
		System.out.println(configBean);
	}
}
