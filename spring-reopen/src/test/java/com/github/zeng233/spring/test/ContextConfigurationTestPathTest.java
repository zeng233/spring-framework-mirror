package com.github.zeng233.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/1/6 9:53
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ContextConfigurationTest.xml"})
public class ContextConfigurationTestPathTest {
    @Autowired
    private IMyTestBean myTestBean;

    /**
     * 测试目录bean注入问题
     *
     * 参考：https://stackoverflow.com/questions/9632710/adding-src-main-resources-to-classpath-when-running-spring-junit-tests-from-ecl
     * 1、src与test目录怎么扫描；2、context:component-scan的use-default-filters属性作用
     */
    @Test
    public void testBean() {
        System.out.println(myTestBean);
    }
}