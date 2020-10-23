package com.github.zeng233.spring.aop.config;

import com.github.zeng233.spring.aop.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午4:02
 */
public class AopConfigBeanAspect {

	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		Object[] args = pjp.getArgs();
		Student student = (Student) args[0];

		Class<?> clazz = args[0].getClass();
		Field idField = ReflectionUtils.findField(clazz, "id");
		ReflectionUtils.makeAccessible(idField);
		Object id = ReflectionUtils.getField(idField, args[0]);
		System.out.println("学生field id值：" + Integer.valueOf(id.toString()));

		Method idMethod = ReflectionUtils.findMethod(clazz, "getId");
		Object idMethodResult = ReflectionUtils.invokeMethod(idMethod, args[0]);
		System.out.println("学生method id值：" + idMethodResult);


		System.out.println("MyAspect: around before");
		pjp.proceed();
		System.out.println("MyAspect: around after");
	}
}
