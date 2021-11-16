package com.github.zeng233.spring.container.context.annotation.dependency.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/11/15 17:08
 * @Version 1.0
 */
@Component
public class ContextBean {

	@Autowired
	private ApplicationContext context;

	public void print() {
		System.out.println(context);
	}
}
