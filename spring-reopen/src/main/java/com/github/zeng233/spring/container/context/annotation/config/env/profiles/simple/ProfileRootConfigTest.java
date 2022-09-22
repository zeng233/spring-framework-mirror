package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author zenghua
 * @date 2022/9/21
 */
public class ProfileRootConfigTest {

	private static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void beforeClass() {
		context = new AnnotationConfigApplicationContext();
		context.register(ProfileRootConfig.class);
		context.refresh();
	}

	@Test
	public void testSimple() {
		String[] profiles = context.getEnvironment().getActiveProfiles();
		System.out.println(Arrays.asList(profiles));
		ProfileConfigBean2 profileConfigBean2 = context.getBean("profileConfigBean2", ProfileConfigBean2.class);
		System.out.println(profileConfigBean2);
	}
}
