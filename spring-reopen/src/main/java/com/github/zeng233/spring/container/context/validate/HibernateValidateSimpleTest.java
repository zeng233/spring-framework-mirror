package com.github.zeng233.spring.container.context.validate;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Date;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/2/28 8:35
 * @Version 1.0
 */
public class HibernateValidateSimpleTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testNotNull() {
        HibernateBean hibernateBean = new HibernateBean(null, "a", new Date());
        Set<ConstraintViolation<HibernateBean>> constraintViolations =
                validator.validate(hibernateBean);

        assertEquals( 1, constraintViolations.size() );
//        assertEquals(
//                "may not be null",
//                constraintViolations.iterator().next().getMessage()
//        );
    }
}