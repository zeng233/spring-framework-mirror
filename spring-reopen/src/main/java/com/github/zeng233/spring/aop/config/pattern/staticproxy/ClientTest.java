package com.github.zeng233.spring.aop.config.pattern.staticproxy;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/11 下午6:29
 */
public class ClientTest {

	public static void main(String[] args) {
		ITargetObject realObject = new TargetObjectImpl();
		ITargetObject proxyObject = new ProxyObject(realObject);
		proxyObject.print("foo");
	}
}
