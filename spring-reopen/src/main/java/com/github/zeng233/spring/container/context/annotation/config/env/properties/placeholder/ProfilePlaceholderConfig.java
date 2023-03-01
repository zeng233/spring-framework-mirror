package com.github.zeng233.spring.container.context.annotation.config.env.properties.placeholder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zenghua
 * @date 2022/12/1
 */
@PropertySource("classpath:com/github/zeng233/spring/container/context/annotation/config/env/properties/placeholder/ProfilePlaceholderConfigTest-${myenv}.properties")
@Configuration
public class ProfilePlaceholderConfig {

	@Bean
	public ProfilePlaceholderBean profilePlaceholderBean() {
		ProfilePlaceholderBean profilePlaceholderBean = new ProfilePlaceholderBean();
		return profilePlaceholderBean;
	}
}
