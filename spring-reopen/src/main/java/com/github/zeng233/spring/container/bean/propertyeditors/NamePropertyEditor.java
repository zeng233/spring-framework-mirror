package com.github.zeng233.spring.container.bean.propertyeditors;

import java.beans.PropertyEditorSupport;

/**
 * @author zenghua
 * @date 2022/10/19
 */
public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] name = text.split("\\s");
		MultiNameBean result = new MultiNameBean(name[0], name[1]);
		setValue(result);
	}
}
