package com.github.zeng233.spring.container.context.xml;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/7 下午5:56
 */
public class MyXmlAttrBeanTest {
	public static final Logger mylog = Logger.getLogger(MyXmlBeanTest.class);

	public static final String PATH = "com/github/zeng233/spring/container/context/xml/MyXmlAttrBeanTest.xml";


	/**
	 * 前置依赖的bean会在本bean实例化之前创建好
	 */
	@Test
	public void testDependsOn() {
		ApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		MyXmlAttrBeanB myXmlAttrBeanB = context.getBean("myXmlAttrBeanB", MyXmlAttrBeanB.class);
		System.out.println(myXmlAttrBeanB.getMyXmlAttrBean());
	}

	/**
	 * Spring默认会把所有bean都实例化，标签属性Lazy为true表示applicationContext.get()时才实例化对象
	 * 默认值为default
	 */
	@Test
	public void testLazy() {

	}
}
