package com.github.zeng233.spring.dataaccess.tx.data;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
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
	}

	@Test
	public void testUpdate() {
		txDataService.update(1);
	}
}
