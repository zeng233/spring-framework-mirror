package com.github.zeng233.spring.container.context.xml.bean.dependsOn;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDependsOnTest {

	private static ApplicationContext context;

	@BeforeClass
	public static void beforeClass() {
		context = new ClassPathXmlApplicationContext("com/github/zeng233/spring/container/context/xml/bean/XmlDependsOnTest.xml");
	}

	/**
	 * 1、xmlDependsOnBean1类似数据库dao，xmlDependsOnBean2类似于数据库驱动，需要先加载这些属性
	 * 2、或者mlDependsOnBean1需要mlDependsOnBean2的某些属性值，并不是直接强依赖mlDependsOnBean2
	 * 参考：https://stackoverflow.com/questions/12663491/ref-vs-depends-on-attributes-in-spring
	 * https://blog.csdn.net/u010285974/article/details/107428511
	 */
	@Test
	public void testSimple() {

	}
}
