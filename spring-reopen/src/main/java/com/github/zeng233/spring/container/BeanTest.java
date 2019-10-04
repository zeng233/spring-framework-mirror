package com.github.zeng233.spring.container;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinitionHolder;

/**
 * @ClassName BeanTest
 * @Description TODO
 * @Author dukezeng
 * @CreatedTime 2019/5/2 20:37
 * @Version 1.0
 **/
public class BeanTest {

	@Test
	public void testSimple() {
		System.out.println(11);
		BeanDefinitionHolder holder = new BeanDefinitionHolder(null, "simple");
		System.out.println(holder.getBeanName());
	}
}
