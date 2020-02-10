package com.github.zeng233.spring.container.context.xml.map;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapBeanNoConfigTest {
	public static final Logger mylog = Logger.getLogger(MapBeanNoConfigTest.class);

	private static final String PATH = "com/github/zeng233/spring/container/context/xml/map/MapBeanNoConfigTest.xml";

	private ApplicationContext context;

	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext(PATH);
		System.out.println("==============初始化容器完成=================");
	}

	/**
	 * Map类型注入，map不用配置，直接可以注入了测试
	 * 搜索关键字：判断是否是集合bean注入，DefaultListableBeanFactory.doResolveDependency会根据属性判断是否是集合类型，
	 * 如果是就把集合里面类型的bean全部加载出来并保存到集合
	 */
	@Test
	public void testAutowire() {
		MapService mapService = context.getBean("mapService", MapService.class);
		System.out.println(mapService);
		mapService.print();
	}
}
