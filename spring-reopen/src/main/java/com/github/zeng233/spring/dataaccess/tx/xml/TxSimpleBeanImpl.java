package com.github.zeng233.spring.dataaccess.tx.xml;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/12 下午3:45
 */
public class TxSimpleBeanImpl implements ITxSimpleBean {

	@Override
	public void get() {
		System.out.println("this is get");
	}

	@Override
	public void doAction() {
		System.out.println("this is doAction");
	}
}
