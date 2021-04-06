package com.github.zeng233.spring.dataaccess.tx.anno;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/6 16:40
 * @Version 1.0
 */
public class AnnoTest {
    public static final String PATH = "com/github/zeng233/spring/dataaccess/tx/anno/AnnoTest.xml";

    private ApplicationContext context;

    private AnnoService annoService;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext(PATH);
        System.out.println("============setUp初始化xml完成================");
        System.out.println();
        annoService = context.getBean(AnnoService.class);
    }

    @Test
    public void testSave() {
        System.out.println(annoService);
    }
}