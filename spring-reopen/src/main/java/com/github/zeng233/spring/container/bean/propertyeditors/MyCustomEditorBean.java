package com.github.zeng233.spring.container.bean.propertyeditors;

import java.util.Date;

/**
 * @author zenghua
 * @date 2022/10/19
 */
public class MyCustomEditorBean {

	private Integer id;

	private MultiNameBean multiNameBean;

	private Date createDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MultiNameBean getMultiNameBean() {
		return multiNameBean;
	}

	public void setMultiNameBean(MultiNameBean multiNameBean) {
		this.multiNameBean = multiNameBean;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
