package com.github.zeng233.spring.container.context.annotation.dependency.context;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/11/15 17:08
 * @Version 1.0
 */
public class ContextBeanDiTest {

	/**
	 * 容器本身注入到bean中测试
	 * 参考AbstractApplicationContext类，
	 * beanFactory.registerResolvableDependency(ApplicationContext.class, this);
	 * 将容器添加到依赖Map中，由于Autowired本身不支持按名称注入，
	 * org.springframework.beans.factory.support.DefaultListableBeanFactory#findAutowireCandidates(java.lang.String, java.lang.Class, org.springframework.beans.factory.config.DependencyDescriptor)
	 * 使用dependencyType类来获取。
	 *
	 * 参考：https://github.com/spring-projects/spring-framework/issues/13096
	 */
	@Test
	public void testContextDi() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextBeanConfig.class);
		ContextBean contextBean = context.getBean("contextBean", ContextBean.class);
//		contextBean.print();
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
