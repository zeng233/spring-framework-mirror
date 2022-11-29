package com.github.zeng233.spring.container.bean.convert;

import org.springframework.core.convert.converter.Converter;

/**
 * @author zenghua
 * @date 2022/11/29
 */
public class String2UserConvert implements Converter<String, User> {
	@Override
	public User convert(String source) {
		User user = new User();
		user.setName(source);
		return user;
	}
}
