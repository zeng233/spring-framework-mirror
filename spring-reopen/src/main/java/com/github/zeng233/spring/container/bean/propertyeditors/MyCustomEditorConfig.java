package com.github.zeng233.spring.container.bean.propertyeditors;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zenghua
 * @date 2022/10/19
 */
@Configuration
public class MyCustomEditorConfig {

	@Bean
	public CustomEditorConfigurer customEditorConfigurer() {
		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
		List<PropertyEditorRegistrar> propertyEditorRegistrarList = new ArrayList<>();
		//添加时间editor
		PropertyEditorRegistrar propertyEditorRegistrar = new MyPropertyEditorRegistrar();
		propertyEditorRegistrarList.add(propertyEditorRegistrar);

		PropertyEditorRegistrar[] propertyEditorRegistrars = propertyEditorRegistrarList.toArray(new PropertyEditorRegistrar[0]);
		customEditorConfigurer.setPropertyEditorRegistrars(propertyEditorRegistrars);

		Map<Class<?>, Class<? extends PropertyEditor>> mapCustomEditors = new HashMap<>(1);
		//添加自定义editor
		mapCustomEditors.put(MultiNameBean.class, NamePropertyEditor.class);
		customEditorConfigurer.setCustomEditors(mapCustomEditors);
		return customEditorConfigurer;
	}

//	@Bean
//	public MyCustomEditorBean myCustomEditorBean() {
//		MyCustomEditorBean myCustomEditorBean = new MyCustomEditorBean();
//		myCustomEditorBean.setName("hell world");
//		return myCustomEditorBean;
//	}
}
