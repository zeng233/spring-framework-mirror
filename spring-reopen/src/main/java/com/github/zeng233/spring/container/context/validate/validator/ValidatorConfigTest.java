package com.github.zeng233.spring.container.context.validate.validator;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;

import java.util.List;

/**
 * @author zenghua
 * @date 2022/9/25
 */
public class ValidatorConfigTest {

	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidatorConfig.class);
		PersonValidator personValidator = context.getBean("personValidator", PersonValidator.class);
		Person person = new Person();
		person.setAge(-10);
		Errors errors = new BeanPropertyBindingResult(person, "persion");
		ValidationUtils.invokeValidator(personValidator, person, errors);

		List<FieldError> fieldErrorList = errors.getFieldErrors();
		System.out.println(fieldErrorList);
		fieldErrorList.forEach(e -> {
			System.out.println(e.getCodes());
		});
	}
}
