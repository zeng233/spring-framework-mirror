package com.github.zeng233.spring.container.context.annotation.listeners.anno.generic;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
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
