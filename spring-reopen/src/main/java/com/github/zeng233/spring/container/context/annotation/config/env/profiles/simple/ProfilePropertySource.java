package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.springframework.core.env.PropertySource;

/**
 * @author zenghua
 * @date 2022/9/21
 */
public class ProfilePropertySource extends PropertySource<String> {

	public ProfilePropertySource(String name, String source) {
		super(name, source);
	}

	@Override
	public Object getProperty(String name) {
		return super.getSource();
	}
}
