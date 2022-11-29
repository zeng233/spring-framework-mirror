package com.github.zeng233.spring.container.bean.propertyeditors;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zenghua
 * @date 2022/10/19
 */
public class MyCustomEditorTest {

	private final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

	/**
	 * 参考{@link org.springframework.beans.factory.xml.XmlBeanCollectionTests}
	 * @throws Exception
	 *
	 */
	@Before
	public void setUp() {
//		BeanDefinitionReader reader = new XmlBeanDefinitionReader(this.beanFactory);
//
////		ClassPathResource classPathResource = new ClassPathResource("com/github/zeng233/spring/container/bean/propertyeditors/MyCustomEditorTest.xml", getClass());
//		ClassPathResource classPathResource = new ClassPathResource(MyCustomEditorTest.class.getSimpleName() + ".xml", getClass());
//
//
//		reader.loadBeanDefinitions(classPathResource);
//		System.out.println("=============初始化完成============");
	}

	/**
	 * 参考：sprin源码解析之属性编辑器propertyEditor：https://www.cnblogs.com/hoonick/p/9837211.html
	 * 官网自定义CustomEditorConfigurer：https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-beans-conversion-customeditor-registration
	 */
	@Test
	public void testSimple() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/github/zeng233/spring/container/bean/propertyeditors/MyCustomEditorTest.xml");
		MyCustomEditorBean myCustomEditorBean = context.getBean("myCustomEditorBean", MyCustomEditorBean.class);
		System.out.println(myCustomEditorBean.getMultiNameBean());
		System.out.println(myCustomEditorBean.getCreateDate());
	}



}
