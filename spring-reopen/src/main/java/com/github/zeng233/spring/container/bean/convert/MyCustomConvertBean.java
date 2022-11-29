package com.github.zeng233.spring.container.bean.convert;

import java.util.List;

/**
 * @author zenghua
 * @date 2022/10/19
 */
public class MyCustomConvertBean {

//	private Integer id;
//
//	private MultiNameBean multiNameBean;
//
//	private Date createDate;

	private Long[] numbers;

	private List<User> userList;

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public MultiNameBean getMultiNameBean() {
//		return multiNameBean;
//	}
//
//	public void setMultiNameBean(MultiNameBean multiNameBean) {
//		this.multiNameBean = multiNameBean;
//	}
//
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}

	public Long[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Long[] numbers) {
		this.numbers = numbers;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
