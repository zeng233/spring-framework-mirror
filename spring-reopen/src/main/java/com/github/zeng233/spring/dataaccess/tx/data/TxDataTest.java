package com.github.zeng233.spring.dataaccess.tx.data;

import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 事务测试参考：
 * Spring的事务 之 9.3 编程式事务 ——跟我学spring3：https://www.iteye.com/blog/jinnianshilongnian-1441271
 * 深入Spring事务源码剖析事务（一）：https://www.javazhiyin.com/24920.html
 *
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/12 下午4:21
 */
public class TxDataTest {
	public static final String PATH = "com/github/zeng233/spring/dataaccess/tx/data/TxDataTest.xml";

	private ApplicationContext context;

	private ITxDataService txDataService;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(PATH);
		System.out.println("============setUp初始化xml完成================");
		System.out.println();
		txDataService = context.getBean("txDataService", ITxDataService.class);
	}

	@Test
	public void testSave() {

		System.out.println(txDataService);
		txDataService.save();
		System.out.println(AopUtils.isAopProxy(txDataService));
	}

	@Test
	public void testUpdate() {
		txDataService.update(1);
	}
}
