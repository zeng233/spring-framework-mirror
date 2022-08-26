package com.github.zeng233.spring.container.context.xml.context;

import org.springframework.stereotype.Component;

/**
 * @author zenghua
 * @date 2022/8/23
 */
@Component
public class XmlComponentScanBean {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
