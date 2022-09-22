package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zenghua
 * @date 2022/9/21
 */
@Profile("config2")
@Configuration
public class ProfileConfig2 {

	@Bean
	public ProfileConfigBean2 profileConfigBean2() {
		return new ProfileConfigBean2();
	}
}
