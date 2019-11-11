package com.github.zeng233.spring.aop.config.pattern.staticproxy;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午6:22
 */
public interface ITargetObject {

	/**
	 * 打印消息
	 * @param message
	 */
	void print(String message);
}
