package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;

/**
 * @author zenghua
 * @date 2022/9/21
 */
public class ProfileConfigTest {

	private static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void beforeClass() {
		context = new AnnotationConfigApplicationContext();
	}

	@Test
	public void testSimple() {
		ConfigurableEnvironment environment = context.getEnvironment();
		MutablePropertySources mutablePropertySources = environment.getPropertySources();
		//添加变量必须在加载bean之前初始化
		mutablePropertySources.addFirst(new ProfilePropertySource(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "config3"));

		context.register(ProfileConfig1.class, ProfileConfig2.class, ProfileConfig3.class);
		context.refresh();


		String[] profiles = context.getEnvironment().getActiveProfiles();
		System.out.println(Arrays.asList(profiles));
		ProfileConfigBean3 profileConfigBean3 = context.getBean("profileConfigBean3", ProfileConfigBean3.class);
		System.out.println(profileConfigBean3);
	}
}
