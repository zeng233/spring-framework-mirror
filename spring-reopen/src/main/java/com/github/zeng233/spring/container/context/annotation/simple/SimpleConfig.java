package com.github.zeng233.spring.container.context.annotation.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/2/11 11:55
 * @Version 1.0
 */
@Configuration
//ComponentScan也会扫描Configuration注解本身
//Import注解引入某一个带@Configuration注解的对象
//@ComponentScan("com.github.zeng233.spring.container.context.annotation.simple")
public class SimpleConfig {

	/**
	 * 如果bean注解没有name属性制定名称，就使用方法名称为beanName，参考
	 * {@link org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsForBeanMethod(org.springframework.context.annotation.BeanMethod)}
	 */
    @DependsOn
    @Bean
    public SimpleConfigBean simpleConfigBeanM() {
        SimpleConfigBean simpleConfigBean = new SimpleConfigBean();
        return simpleConfigBean;
    }
}
