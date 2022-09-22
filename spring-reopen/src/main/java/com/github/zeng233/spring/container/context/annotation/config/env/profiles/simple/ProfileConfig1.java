package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zenghua
 * @date 2022/9/21
 */
@Profile("config1")
@Configuration
public class ProfileConfig1 {

	@Bean
	public ProfileConfigBean1 profileConfigBean1() {
		return new ProfileConfigBean1();
	}
}
