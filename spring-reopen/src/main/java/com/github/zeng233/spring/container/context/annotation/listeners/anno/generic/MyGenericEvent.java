package com.github.zeng233.spring.container.context.annotation.listeners.anno.generic;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
 * 实现事件ResolvableTypeProvider接口，实现泛型事件
 * @author zenghua
 * @date 2022/9/22
 */
public class MyGenericEvent<T> extends ApplicationEvent implements ResolvableTypeProvider {

	public MyGenericEvent(T source) {
		super(source);
	}

	@Override
	public ResolvableType getResolvableType() {
		return ResolvableType.forClassWithGenerics(getClass(), ResolvableType.forInstance(getSource()));
	}
}
