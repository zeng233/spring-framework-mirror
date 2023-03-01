package com.github.zeng233.spring.container.context.annotation.config.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author zenghua
 * @date 2022/8/26
 */
@Configuration
@PropertySource("classpath:com/github/zeng233/spring/container/context/annotation/config/env/EnvConfig.properties")
public class EnvConfig {
	/**
	 * Environment注入参考：{@link AbstractApplicationContext#prepareBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)}
	 * beanFactory.registerSingleton(ENVIRONMENT_BEAN_NAME, getEnvironment());
	 */
	@Autowired
	private Environment environment;

	@Bean(name = "envBean")
	public EnvBean buildBean() {
		EnvBean envBean = new EnvBean();
		//或者使用@Value注解取值
		envBean.setEnvFoo(environment.getProperty("env.config"));
		return envBean;
	}
}
