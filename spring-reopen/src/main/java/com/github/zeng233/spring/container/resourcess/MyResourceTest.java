package com.github.zeng233.spring.container.resourcess;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @author zenghua
 * @date 2022/9/23
 */
public class MyResourceTest {

	@Test
	public void testSimple() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/github/zeng233/spring/container/resourcess/MyResourceTest.xml");
		//没有前缀开头的，解析URL异常，兜底用ClassPathContextResource
		Resource resource = context.getResource("container/resourcess/MyResourceTest.xml");
		System.out.println(resource);
	}
}
