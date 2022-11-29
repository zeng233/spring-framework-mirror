package com.github.zeng233.spring.container.bean.convert;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * 参考{@link org.springframework.core.convert.support.StringToArrayConverter}
 * {@link org.springframework.core.convert.support.StringToCollectionConverter}
 * @author zenghua
 * @date 2022/11/25
 */
public class MyStringConditionConvert implements ConditionalGenericConverter {
	@Override
	public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
		return false;
	}

	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		return Collections.singleton(new ConvertiblePair(String.class, List.class));
	}

	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		if (source == null) {
			return null;
		}
		return null;
	}
}
