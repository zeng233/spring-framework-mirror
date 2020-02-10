package com.github.zeng233.spring.container.bean.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;

public class SimpleContainerNamespaceTest {

	private final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

	/**
	 */
	@Before
	public void setUp() {
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(this.beanFactory);
		//参考AbstractBeanDefinitionReader，初始化默认使用PathMatchingResourcePatternResolver解析文件，配置文件只要与类路径一致，就可以解析到文件
		//PathMatchingResourcePatternResolver包含资源加载器DefaultResourceLoader，里面也包含了类加载器
		ClassPathResource classPathResource = new ClassPathResource("SimpleContainerNamespaceTest.xml", getClass());
		reader.loadBeanDefinitions(classPathResource);
		System.out.println("=============初始化完成============");
	}

	@Test
	public void testListBean() {
		ArrayList<Integer> list = beanFactory.getBean("list", ArrayList.class);
		System.out.println(list);
	}
}
