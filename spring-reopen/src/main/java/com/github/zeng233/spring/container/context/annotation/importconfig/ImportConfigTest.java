package com.github.zeng233.spring.container.context.annotation.importconfig;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description 导入其他config注解配置
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/3/4 18:23
 * @Version 1.0
 */
public class ImportConfigTest {

	/**
	 * 参考：{@link org.springframework.context.annotation.ConfigurationClassPostProcessor#postProcessBeanDefinitionRegistry(org.springframework.beans.factory.support.BeanDefinitionRegistry)}
	 * {@link org.springframework.context.annotation.ConfigurationClassParser#parse(java.util.Set)}
	 */
    @Test
    public void testSimple() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ImportConfig.class);
        OtherConfigBean otherConfigBean = ctx.getBean(OtherConfigBean.class);
        System.out.println(otherConfigBean.other());
    }
}