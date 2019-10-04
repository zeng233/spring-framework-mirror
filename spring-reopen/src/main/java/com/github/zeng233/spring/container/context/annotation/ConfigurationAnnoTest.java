/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.zeng233.spring.container.context.annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 参考spring3.x文档，3.0新特性"The Inversion of Control (IoC) container" 
 * 参考API：Configuration
 * 
 * @author zenghua233
 */
public class ConfigurationAnnoTest {

	/**
	 * 1、直接使用注解容器初始化
	 */
	@Test
	public void testConfigWithAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		MyBean myBean = ctx.getBean(MyBean.class);
		System.out.println(myBean);
		System.out.println(myBean.getMyBean2());
	}
	
	/**
	 * 2、通过标签<context:annotation-config />扫描带@Configuration注解的bean
	 */
	@Test
	public void testConfigWithXml() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/github/zeng233/spring/container/context/annotation/ConfigurationAnnoTest.xml");
		MyBean myBean = context.getBean(MyBean.class);
		System.out.println(myBean);
	}
	
	/**
	 * 3、使用@ComponentScan注解注入bean
	 */
	@Test
	public void testConfigWihtScanAndXmlIoc() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/github/zeng233/spring/container/context/annotation/ConfigurationAnnoTest.xml");
		MyBean myBean = context.getBean(MyBean.class);
		System.out.println(myBean);
	}
	
	/**
	 * @Bean 注解都为单例？？
	 */
	@Test
	public void testConfigWithScanAndAnnotationIoc() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		MyBean myBean = ctx.getBean(MyBean.class);
		System.out.println(myBean);
		
		MyBean myBean2 = ctx.getBean(MyBean.class);
		System.out.println(myBean2);
	}
}
