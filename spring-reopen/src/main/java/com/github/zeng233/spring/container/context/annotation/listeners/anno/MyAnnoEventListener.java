package com.github.zeng233.spring.container.context.annotation.listeners.anno;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author zenghua
 * @date 2022/9/21
 */
@Component
public class MyAnnoEventListener {

	@EventListener
	public void simple(MyAnnoEvent1 myAnnoEvent1) {
		System.out.println("myAnnoEvent1");
	}

	@EventListener
	@Async
	public void simple(MyAnnoEvent2 myAnnoEvent2) {
		System.out.println("myAnnoEvent2");
	}
}
