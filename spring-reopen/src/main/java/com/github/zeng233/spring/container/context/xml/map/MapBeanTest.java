package com.github.zeng233.spring.container.context.xml.map;

import com.github.zeng233.spring.container.context.xml.MyXmlBeanTest;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

/**
 * @ClassName MapBeanTest
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/1/3 10:09
 * @Version 1.0
 */
public class MapBeanTest {
    public static final Logger mylog = Logger.getLogger(MyXmlBeanTest.class);

    public static final String PATH = "com/github/zeng233/spring/container/context/xml/map/MapBeanTest.xml";

    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext(PATH);
    }

    @Test
    public void testSimple() {
        HashMap<String, MapBean> routeMap = context.getBean("routeMap", HashMap.class);
        System.out.println(routeMap.size());
        System.out.println(routeMap.get("routea"));
    }

    /**
     * 参考：Spring - How do you set Enum keys in a Map with annotations：
     * https://stackoverflow.com/questions/1174308/spring-how-do-you-set-enum-keys-in-a-map-with-annotations
     */
    @Test
    public void testEnum() {
        HashMap<MapTypeEnum, MapBean> routeMap = context.getBean("enumRouteMap", HashMap.class);
        System.out.println(routeMap.size());
        System.out.println(routeMap.get(MapTypeEnum.A));
    }
}
