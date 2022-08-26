package com.github.zeng233.spring.container.context.xml.context;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zenghua
 * @date 2022/8/23
 */
public class XmlComponentScanTest {

	private ApplicationContext context;

	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("com/github/zeng233/spring/container/context/xml/context/XmlComponetScanTest.xml");
	}

	@Test
	public void testSimple() {
		XmlComponentScanBean xmlComponentScanBean = context.getBean("xmlComponentScanBean", XmlComponentScanBean.class);
		System.out.println(xmlComponentScanBean);
	}
}
