package com.github.zeng233.spring.container.context.xml.simple;

import com.github.zeng233.spring.container.context.simple.SimpleBeanTest;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/2/20 17:04
 * @Version 1.0
 */
public class XmlSimpleBeanTest {
    public static final Logger mylog = Logger.getLogger(SimpleBeanTest.class);

    public static final String PATH = "com/github/zeng233/spring/container/context/xml/simple/XmlSimpleBeanTest.xml";

    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext(PATH);
        System.out.println("============setUp初始化xml完成================");
    }

    @Test
    public void test() {
        System.out.println(XmlSimpleBeanTest.class.getSimpleName());
    }

    /**
     * 测试bean的生命周期
     */
    @Test
    public void testLifeCycle() {
        XmlSimpleBean xmlSimpleBean = context.getBean("xmlSimpleBean", XmlSimpleBean.class);
        System.out.println(xmlSimpleBean);
    }

    /**
     * depend-on，参考:org.springframework.beans.factory.xml.XmlBeanFactoryTests#testDependsOn()
     */
    @Test
    public void testAttr() {
        XmlSimpleBean xmlSimpleBean = context.getBean("xmlSimpleBean", XmlSimpleBean.class);
        System.out.println(xmlSimpleBean.getXmlSimpleBean2());
    }
}