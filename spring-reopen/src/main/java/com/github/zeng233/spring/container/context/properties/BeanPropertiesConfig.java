package com.github.zeng233.spring.container.context.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description
 * @Author zenghua
 * @Email zengh@glodon.com
 * @Date 2021/12/21 10:54
 * @Version 1.0
 */
@PropertySource("classpath:com/github/zeng233/spring/container/context/properties/PropertyPlaceholderTest.properties")
@Configuration
public class BeanPropertiesConfig {
	@Value("${attr.foo:default}")
	private String foo;

	@Bean
	public FooBean fooBeanM() {
		FooBean fooBean = new FooBean();
		fooBean.setName(foo);
		return fooBean;
	}
}
