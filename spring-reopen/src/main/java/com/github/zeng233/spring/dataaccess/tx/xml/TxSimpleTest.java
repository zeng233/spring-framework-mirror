/*
 * Copyright 2002-2016 the original author or authors.
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

package com.github.zeng233.spring.dataaccess.tx.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author zenghua233
 * @since 4.2.1
 */
public class TxSimpleTest {
	public static final String PATH = "com/github/zeng233/spring/dataaccess/tx/xml/TxSimpleTest.xml";

	private ApplicationContext context;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(PATH);
		System.out.println("============setUp初始化xml完成================");
		System.out.println();
	}

	@Test
	public void testConfig() {
//		ITxBean myBean = (ITxBean) context.getBean("myTxBean");
//		//获取TransactionInterceptor
//		System.out.println(context.getBean("myTxAdvice"));
//		System.out.println(myBean);
//		System.out.println(AopUtils.isAopProxy(myBean));
//		AutowiredAnnotationBeanPostProcessor process = (AutowiredAnnotationBeanPostProcessor) context.getBean("org.springframework.context.annotation.internalAutowiredAnnotationProcessor");
//		System.out.println(process);
//		System.out.println(AopUtils.isAopProxy(process));
	}


	@Test
	public void testDoAction() {
		ITxSimpleBean txSimpleBean = context.getBean("txSimpleBean", ITxSimpleBean.class);
		txSimpleBean.doAction();
	}




	
//	@Test
//	public void testGet() {
//		//获取到的是JDK的代理对象
//		ITxBean myBean = (ITxBean) context.getBean("myTxBean");
//		CallCountingTransactionManager ptm = (CallCountingTransactionManager) context.getBean("transactionManager");
//		System.out.println(ptm.begun);
//		//代理对象执行方法，调用JdkDynamicAopProxy.invoke()方法（实现了InvocationHandler接口）
//		//代理对象执行时，DefaultAdvisorChainFactory.getInterceptorsAndDynamicInterceptionAdvice使用ClassFilter过滤表达式
//		//AspectJExpressionPointcut也是ClassFilter的一个子类
//		myBean.getFoo();
//		System.out.println(ptm.begun);
//		System.out.println(ptm.commits);
//	}
//
//	/**
//	 * 测试嵌套的新事务
//	 *
//	 * 如果在同一个类中都加了事务，那调用这个类中的方法实际没有走代理对象的，所以即使是注解了开启新事务也无效
//	 */
//	@Test
//	public void testNestedNew() {
//		//实现类为MyTxBean
//		ITxBean myBean = (ITxBean) context.getBean("myTxBean");
//		myBean.getNested();
//	}
}
