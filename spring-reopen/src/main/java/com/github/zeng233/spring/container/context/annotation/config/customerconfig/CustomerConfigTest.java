package com.github.zeng233.spring.container.context.annotation.config.customerconfig;

import com.github.zeng233.spring.container.context.annotation.config.componentscan.AppScanBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zenghua
 * @date 2022/12/2
 */
public class CustomerConfigTest {

	/**
	 *	测试组合注解，CustomerConfig注解输入的字符串就是@AliasFor注解作用效果
	 */
	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyConfig.class);
		context.refresh();
		MyConfigBean myConfigBean = context.getBean("myConfigBean", MyConfigBean.class);
		System.out.println(myConfigBean);
	}

	/**
	 * 如果ComponentScan的basePackages为空，就使用配置类的路径作为默认的basePackages，所以myConfigBean可以获取到
	 * 参考org.springframework.context.annotation.ComponentScanAnnotationParser#parse(org.springframework.core.annotation.AnnotationAttributes, java.lang.String)
	 */
	@Test
	public void testComponentScanBasePackages() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyConfig1.class);
		context.refresh();
		AppScanBean appScanBean = context.getBean("appScanBean", AppScanBean.class);
		System.out.println(appScanBean);
	}
}
