package com.github.zeng233.spring.aop.config;

import com.github.zeng233.spring.aop.IPrintBean;
import com.github.zeng233.spring.aop.Student;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午4:01
 */
public class AopConfigBean implements IPrintBean {

	@Override
	public String print(String message) {
		System.out.println(message);
		return message;
	}

	@Override
	public Student getStudent(Student student) {
		return student;
	}
}
