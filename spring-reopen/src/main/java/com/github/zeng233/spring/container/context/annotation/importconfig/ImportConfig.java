package com.github.zeng233.spring.container.context.annotation.importconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/3/4 18:23
 * @Version 1.0
 */
@Configuration
@Import(OtherConfig.class)
public class ImportConfig {

    @Bean
    public ImportBean importBean() {
        return new ImportBean();
    }
}