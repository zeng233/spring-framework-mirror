package com.github.zeng233.spring.container.context.annotation.config.env.properties.placeholder;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

/**
 * @author zenghua
 * @date 2022/12/1
 */
public class ProfilePlaceholderConfigTest {

	private AnnotationConfigApplicationContext context;

	@Before
	public void before() {
		context = new AnnotationConfigApplicationContext();
	}

	@Test
	public void testPlaceholder() {
		ConfigurableEnvironment environment = context.getEnvironment();
		MutablePropertySources mutablePropertySources = environment.getPropertySources();
//		参考：org.springframework.core.env.CompositePropertySource
		mutablePropertySources.addFirst(new PropertySource<Object>("myenv") {
			@Override
			public Object getProperty(String name) {
				return "test";
			}
		});
		context.register(ProfilePlaceholderConfig.class);
		context.refresh();

		ProfilePlaceholderBean profilePlaceholderBean = context.getBean("profilePlaceholderBean", ProfilePlaceholderBean.class);
		System.out.println(profilePlaceholderBean.getName());
	}
}
