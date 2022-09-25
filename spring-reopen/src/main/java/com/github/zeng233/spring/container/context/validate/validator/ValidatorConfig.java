package com.github.zeng233.spring.container.context.validate.validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zenghua
 * @date 2022/9/25
 */
@Configuration
public class ValidatorConfig {

	@Bean
	public PersonValidator personValidator() {
		return new PersonValidator();
	}
}
