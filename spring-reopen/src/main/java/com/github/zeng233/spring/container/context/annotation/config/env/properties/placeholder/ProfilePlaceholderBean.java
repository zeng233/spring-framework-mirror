package com.github.zeng233.spring.container.context.annotation.config.env.properties.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zenghua
 * @date 2022/12/1
 */
@Component
public class ProfilePlaceholderBean {

	@Value("${com.myholder}")
	private String name;

	public String getName() {
		return name;
	}
}
