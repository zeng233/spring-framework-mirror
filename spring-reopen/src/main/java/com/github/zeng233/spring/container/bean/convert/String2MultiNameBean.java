package com.github.zeng233.spring.container.bean.convert;

import com.github.zeng233.spring.container.bean.propertyeditors.MultiNameBean;
import org.springframework.core.convert.converter.Converter;

/**
 * @author zenghua
 * @date 2022/11/22
 */
public class String2MultiNameBean implements Converter<String, MultiNameBean> {
	@Override
	public MultiNameBean convert(String source) {
		String[] names = source.split("\\s");
		MultiNameBean multiNameBean = new MultiNameBean(names[0], names[1]);
		return multiNameBean;
	}
}
