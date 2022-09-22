package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zenghua
 * @date 2022/9/21
 */
@Profile("config3")
@Configuration
//@ActiveProfiles
public class ProfileConfig3 {

	@Bean(name = "profileConfigBean3")
	public ProfileConfigBean3 profileConfigBean3() {
		return new ProfileConfigBean3();
	}
}
