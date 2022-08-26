package com.github.zeng233.spring.container.context.annotation.config.profile;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 参考：{@link org.springframework.test.context.junit4.annotation.meta.ConfigClassesAndProfilesMetaConfigTests}
 *
 * @author zenghua
 * @date 2022/8/26
 */
public class ProfileTest {

	private AnnotationConfigApplicationContext context;

	@Before
	public void before() {
		context = new AnnotationConfigApplicationContext(ProfileConfig.class);
		System.out.println("================context初始化完成=================");
	}

	@Test
	public void testSimple() {
		ProfileBean profileBean = context.getBean("profileBean", ProfileBean.class);
		System.out.println(profileBean);
	}
}
