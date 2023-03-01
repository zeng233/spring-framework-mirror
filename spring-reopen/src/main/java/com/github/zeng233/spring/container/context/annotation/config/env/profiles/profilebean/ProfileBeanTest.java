package com.github.zeng233.spring.container.context.annotation.config.env.profiles.profilebean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * profile作用于bean测试
 * @author zenghua
 * @date 2022/11/30
 */
public class ProfileBeanTest {

	private AnnotationConfigApplicationContext context;

	@Before
	public void before() {
		context = new AnnotationConfigApplicationContext();
	}

	/**
	 * 作用于bean的解析，参考：org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsForBeanMethod(org.springframework.context.annotation.BeanMethod)
	 * 注册bean到容器中之前，先判断改bean作用的profile是否在激活的profile中，如果不满足就返回
	 */
	@Test
	public void test() {
		context.getEnvironment().setActiveProfiles("dev1");
		context.register(ProfileBeanConfig.class);
		context.refresh();

		Date date1 = context.getBean("dev1", Date.class);
		System.out.println(date1);
	}
}
