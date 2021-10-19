package com.github.zeng233.spring.container.context.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationWithXml {

	@Bean
	public MyBean2 myBean2() {
		return new MyBean2();
	}
}
