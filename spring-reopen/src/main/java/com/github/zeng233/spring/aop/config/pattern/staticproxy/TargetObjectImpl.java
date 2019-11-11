package com.github.zeng233.spring.aop.config.pattern.staticproxy;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午6:23
 */
public class TargetObjectImpl implements ITargetObject {

	@Override
	public void print(String message) {
		System.out.println("realobject do action：" + message);
	}
}
