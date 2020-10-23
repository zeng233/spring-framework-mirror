package com.github.zeng233.spring.aop.config;

import com.github.zeng233.spring.aop.IPrintBean;
import com.github.zeng233.spring.aop.Student;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午3:55
 */
public class JdkProxyConfigTest {
	public static final Logger mylog = Logger.getLogger(JdkProxyConfigTest.class);

	public static final String PATH = "com/github/zeng233/spring/aop/config/JdkProxyConfigTest.xml";

	private ApplicationContext context;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(PATH);
		System.out.println("============setUp初始化xml完成================");
	}

	@Test
	public void testConfig() {
		IPrintBean printBean = context.getBean("aopConfigBean", IPrintBean.class);
		System.out.println("testConfig:" + AopUtils.isAopProxy(printBean));
		//这里结果为什么为空？ TODO (string 引用问题导致的？？)
//		String result = printBean.print("foo");
		System.out.println(printBean.print("foo"));
	}

	@Test
	public void testJoinPointArgs() {
		IPrintBean printBean = context.getBean("aopConfigBean", IPrintBean.class);
		System.out.println("testConfig:" + AopUtils.isAopProxy(printBean));
		Student student = new Student();
		student.setId(1);
		student.setName("a");
		Student result = printBean.getStudent(student);
		System.out.println(result);
	}
}
