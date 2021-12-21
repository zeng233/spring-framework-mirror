package com.github.zeng233.spring.container.context.properties;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * 参考：{@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurerTests}
 *
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/12/21 10:51
 * @Version 1.0
 */
public class PropertyPlaceholderTest {

	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanPropertiesConfig.class);
		FooBean fooBean = context.getBean("fooBeanM", FooBean.class);
		System.out.println(fooBean);
		System.out.println(fooBean.getName());
	}
}
