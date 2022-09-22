package com.github.zeng233.spring.container.context.annotation.config.env.properties;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * 参考：{@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurerTests}
 * {@link org.springframework.context.annotation.PropertySourceAnnotationTests}
 *
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/12/21 10:51
 * @Version 1.0
 */
public class BeanPropertiesConfigTest {

	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanPropertiesConfig.class);
		FooBean fooBean = context.getBean("fooBeanM", FooBean.class);
		System.out.println(fooBean);
		System.out.println(fooBean.getName());
	}
}
