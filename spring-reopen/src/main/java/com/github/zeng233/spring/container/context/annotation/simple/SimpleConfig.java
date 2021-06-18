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
//@ComponentScan("com.github.zeng233.spring.container.context.annotation.simple")
public class SimpleConfig {

    @DependsOn
    @Bean
    public SimpleConfigBean simpleConfigBean() {
        SimpleConfigBean simpleConfigBean = new SimpleConfigBean();
        return simpleConfigBean;
    }
}
