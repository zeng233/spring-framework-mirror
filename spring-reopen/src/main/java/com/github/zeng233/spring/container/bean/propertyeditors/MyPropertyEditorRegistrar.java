package com.github.zeng233.spring.container.bean.propertyeditors;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author zenghua
 * @date 2022/10/19
 */
public class MyPropertyEditorRegistrar implements PropertyEditorRegistrar {

	/**
	 * PropertyEditorRegistry 只能注册一个，实现PropertyEditorRegistrar.registerCustomEditors方法可以注册多个
	 * @param registry the {@code PropertyEditorRegistry} to register the
	 */
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMAN);
		registry.registerCustomEditor(Date.class, new CustomDateEditor(df, true));
	}
}
