package com.github.zeng233.spring.container.context.annotation.config.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @author zenghua
 * @date 2022/8/23
 */
@Configuration
//配置多个ComponentScan
@ComponentScans(value = {
		@ComponentScan(value = "com.github.zeng233.spring.container.context.annotation.config.componentscan"),
		@ComponentScan(value = "com.github.zeng233.spring.container.context.annotation.importconfig")
})
public class AppScansConfig {
}
