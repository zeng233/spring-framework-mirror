package com.github.zeng233.spring.container.context.annotation.config.componentsacn;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AppScanConfig通过ComponentScan注解注入bean，包目录下的bean需要添加@Component
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/13 上午11:51
 */
public class AppScanConfigTest {

	/**
	 * ConfigurationClassPostProcessor->ConfigurationClassParser对ComponentScan、Import注解单独处理
	 */
	@Test
	public void testListBean() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppScanConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppScanConfig.class);
		context.refresh();

		AppScanBean appScanBean = context.getBean(AppScanBean.class);
		System.out.println(appScanBean.scan());

		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}
}
