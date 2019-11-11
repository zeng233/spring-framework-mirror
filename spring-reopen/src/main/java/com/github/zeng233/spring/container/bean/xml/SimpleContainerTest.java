package com.github.zeng233.spring.container.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 通过手动注入bean测试spring-bean里面主类的依赖关系
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/9 下午9:14
 */
public class SimpleContainerTest {

	private final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();


	@Before
	public void setUp() throws Exception {
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(this.beanFactory);
		ClassPathResource classPathResource = new ClassPathResource("SimpleContainerTest.xml", getClass());
		reader.loadBeanDefinitions(classPathResource);
		System.out.println("=============初始化完成============");
	}


	/**
	 * 参考：DefaultLifecycleMethodsTests、CollectionMergingTests
	 *
	 * AbstractAutowireCapableBeanFactory.instantiationStrategy默认为Cglib策略初始化对象，对象里面必须有空构造函数
	 */
	@Test
	public void testSimpleContainer() {
		SimpleContainer simpleContainer = beanFactory.getBean("simpleContainer", SimpleContainer.class);
		System.out.println(simpleContainer);
	}
}
