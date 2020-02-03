package com.github.zeng233.spring.test;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/1/6 10:02
 * @Version 1.0
 */
@Component
public class MyTestBeanImpl implements IMyTestBean {

    @Override
    public void print() {
        System.out.println("this is MyTestBeanImpl");
    }
}