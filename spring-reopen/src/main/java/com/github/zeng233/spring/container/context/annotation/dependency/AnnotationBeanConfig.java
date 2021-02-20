package com.github.zeng233.spring.container.context.annotation.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/13 上午11:03
 */
@Configuration
public class AnnotationBeanConfig {

	@Autowired
	private ConfigBean3 configBean3;

	@Bean(name = "configBean")
	public ConfigBean configBean1() {
		ConfigBean configBean = new ConfigBean();
		configBean.setConfigBean2(configBean2());
		configBean.setConfigBean3(configBean3);
		return configBean;
	}

	@Bean(name = "configBean2")
	public ConfigBean2 configBean2() {
		ConfigBean2 configBean2 = new ConfigBean2();
		return configBean2;
	}

	@Bean(name = "configBean3")
	public ConfigBean3 configBean3() {
		ConfigBean3 configBean3 = new ConfigBean3();
		return configBean3;
	}
}
