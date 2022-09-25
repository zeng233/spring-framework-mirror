package com.github.zeng233.spring.container.context.validate.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author zenghua
 * @date 2022/9/25
 */
public class PersonValidator implements Validator {
	/**
	 * This Validator validates only Person instances
	 */
	@Override
	public boolean supports(Class clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty", "name is required");
		Person p = (Person) obj;
		if (p.getAge() < 0) {
			//实例化AbstractBindingResult.rejectValue，
			e.rejectValue("age", "negativevalue", "年龄不能为负数");
		} else if (p.getAge() > 110) {
			e.rejectValue("age", "too.darn.old");
		}
	}
}
