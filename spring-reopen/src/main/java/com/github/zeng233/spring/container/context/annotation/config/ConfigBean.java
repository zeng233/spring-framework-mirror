package com.github.zeng233.spring.container.context.annotation.config;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/13 上午11:08
 */
public class ConfigBean {

	private int id;

	private ConfigBean2 configBean2;

	private ConfigBean3 configBean3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ConfigBean2 getConfigBean2() {
		return configBean2;
	}

	public void setConfigBean2(ConfigBean2 configBean2) {
		this.configBean2 = configBean2;
	}

	public ConfigBean3 getConfigBean3() {
		return configBean3;
	}

	public void setConfigBean3(ConfigBean3 configBean3) {
		this.configBean3 = configBean3;
	}
}
