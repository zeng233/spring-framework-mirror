package com.github.zeng233.spring.container.context.annotation.listeners;

import org.springframework.context.ApplicationEvent;

/**
 * @Description
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/11/15 11:20
 * @Version 1.0
 */
public class MyEvent extends ApplicationEvent {

	private Integer count;

	public MyEvent(Integer count) {
		super(count);
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
