package com.github.zeng233.spring.container.context.annotation.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/11/15 11:25
 * @Version 1.0
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println(event);
	}
}
