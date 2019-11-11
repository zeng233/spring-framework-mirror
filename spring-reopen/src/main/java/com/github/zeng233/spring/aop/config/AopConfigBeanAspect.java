package com.github.zeng233.spring.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午4:02
 */
public class AopConfigBeanAspect {

	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("MyAspect: around before");
		pjp.proceed();
		System.out.println("MyAspect: around after");
	}
}
