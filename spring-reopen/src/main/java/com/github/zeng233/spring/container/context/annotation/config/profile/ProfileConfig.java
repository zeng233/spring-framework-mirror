package com.github.zeng233.spring.container.context.annotation.config.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author zenghua
 * @date 2022/8/26
 */
//如果不加Profile注解，直接从默认容器中拿，注意Profile内部声明了ProfileCondition，满足了条件才解析bean
@Profile({"dev1", "dev2"})
@ActiveProfiles("dev1")
//@ActiveProfiles，注解激活文件，或者配置文件使用AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME属性激活
@Configuration
public class ProfileConfig {

	@Bean(name = "profileBean")
	public ProfileBean createBean() {
		return new ProfileBean();
	}
}
