package com.github.zeng233.spring.container.context.annotation.importconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/3/4 18:24
 * @Version 1.0
 */
@Configuration
public class OtherConfig {

    @Bean
    public OtherConfigBean bean() {
        return new OtherConfigBean();
    }
}