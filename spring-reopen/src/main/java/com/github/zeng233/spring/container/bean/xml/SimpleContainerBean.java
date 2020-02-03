package com.github.zeng233.spring.container.bean.xml;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/9 下午9:39
 */
public class SimpleContainerBean {
	private Long id;

	private String name;

	/**
	 * 测试AbstractAutowireCapableBeanFactory.instantiationStrategy默认为Cglib策略初始化对象，对象里面必须有空构造函数
	 * @param id
	 */
//	public SimpleContainerBean(Long id) {
//		this.id = id;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
