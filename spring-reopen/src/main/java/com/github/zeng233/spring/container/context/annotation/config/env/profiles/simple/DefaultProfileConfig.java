package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zenghua
 * @date 2022/9/21
 */
//@Profile("default")
@Configuration
public class DefaultProfileConfig {

	@Bean
	public DefaultProfileConfigBean defaultProfileConfigBean() {
		return new DefaultProfileConfigBean();
	}
}
