package com.github.zeng233.spring.container.context.annotation.config.env.profiles;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * profile作用于类的简单测试
 * 参考：{@link org.springframework.test.context.junit4.annotation.meta.ConfigClassesAndProfilesMetaConfigTests}
 *
 * @author zenghua
 * @date 2022/8/26
 */
public class ProfileTest {

	private AnnotationConfigApplicationContext context;

	@Before
	public void before() {
//		context = new AnnotationConfigApplicationContext(ProfileConfig.class);

//		第一种方法：手动添加spring.profiles.active属性
//		context = new AnnotationConfigApplicationContext();
//		ConfigurableEnvironment environment = context.getEnvironment();
//		MutablePropertySources mutablePropertySources = environment.getPropertySources();
//		//添加变量必须在加载bean之前初始化（手动添加配置：spring.profiles.active=config3）
//		mutablePropertySources.addFirst(new ProfilePropertySource(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev"));
//
//		context.register(ProfileConfig.class);
//		context.refresh();

//		第二种方法
		context = new AnnotationConfigApplicationContext();
//		参考：https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-definition-profiles-enable
//		spring框架本身不要在配置文件中设置属性spring.profiles.active=dev，一般通过参数命令激活
		context.getEnvironment().setActiveProfiles("test");


//		这种写法，PropertySource作用于Configuration
//		发生在refresh之后，没有设置setActiveProfiles生效的profile，就永远获取不到配置文件所配置的profile。
//		context = new AnnotationConfigApplicationContext(ProfileConfig.class);

		context.register(ProfileConfig.class);
		context.refresh();

		System.out.println("================context初始化完成=================");
	}

	@Test
	public void testSimple() {
		ProfileBean profileBean = context.getBean("profileBean", ProfileBean.class);
		System.out.println(profileBean);
	}
}
