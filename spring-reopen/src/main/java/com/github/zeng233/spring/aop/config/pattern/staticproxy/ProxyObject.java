package com.github.zeng233.spring.aop.config.pattern.staticproxy;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午6:24
 */
public class ProxyObject implements ITargetObject {

	private ITargetObject targetObject;

	public ProxyObject(ITargetObject targetObject) {
		this.targetObject = targetObject;
	}

	public void before() {
		System.out.println("before：执行真正动作之前的操作");
	}

	public void after() {
		System.out.println("after：执行真正动作之后的操作");
	}

	@Override
	public void print(String message) {
		if (targetObject == null) {
			targetObject = new TargetObjectImpl();
		}
		before();
		targetObject.print(message);
		after();
	}
}
