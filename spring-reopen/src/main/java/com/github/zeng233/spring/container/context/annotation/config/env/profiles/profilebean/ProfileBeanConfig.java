package com.github.zeng233.spring.container.context.annotation.config.env.profiles.profilebean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

/**
 * @author zenghua
 * @date 2022/11/30
 */
@PropertySource("classpath:com/github/zeng233/spring/container/context/annotation/config/env/profiles/simple/ProfileConfigTest.properties")
@Configuration
public class ProfileBeanConfig {

	@Profile("dev1")
	@Bean
	public Date dev1() {
		return new Date();
	}

	@Profile("dev2")
	@Bean
	public Date dev2() {
		return new Date();
	}
}
