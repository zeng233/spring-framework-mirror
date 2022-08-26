package com.github.zeng233.spring.container.context.annotation.config.env;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zenghua
 * @date 2022/8/26
 */
@Configuration
public class EnvConfig {

	@Bean(name = "envBean")
	public EnvBean buildBean() {
		return new EnvBean();
	}
}
