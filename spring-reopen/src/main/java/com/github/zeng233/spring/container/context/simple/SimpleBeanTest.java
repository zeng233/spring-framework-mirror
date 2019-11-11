package com.github.zeng233.spring.container.context.simple;

import com.github.zeng233.spring.container.context.xml.MyXmlBeanTest;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 主要测试主流程
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/9/13 下午11:24
 */
public class SimpleBeanTest {

	public static final Logger mylog = Logger.getLogger(SimpleBeanTest.class);

	public static final String PATH = "com/github/zeng233/spring/container/context/simple/SimpleBeanTest.xml";

	private ApplicationContext context;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(PATH);
		System.out.println("============setUp初始化xml完成================");
	}


	/**
	 * 测试bean的生命周期
	 */
	@Test
	public void testLifeCycle() {
		MySimpleBean mySimpleBean = context.getBean("mySimpleBean", MySimpleBean.class);
		System.out.println(mySimpleBean);
	}

}
