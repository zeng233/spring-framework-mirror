package com.github.zeng233.spring.container.context.xml;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/4 下午3:54
 */
public class MyXmlBeanTest {
	public static final Logger mylog = Logger.getLogger(MyXmlBeanTest.class);

	public static final String PATH = "com/github/zeng233/spring/container/context/xml/MyXmlBeanTest.xml";

	@Test
	public void testLifeCycle() {
		ApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		System.out.println(context.getBean("mySimpleBean"));
		mylog.debug("111");
	}
}
