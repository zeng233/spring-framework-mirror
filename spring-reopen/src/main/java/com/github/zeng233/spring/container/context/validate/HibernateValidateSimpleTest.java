package com.github.zeng233.spring.container.context.validate;

import org.hibernate.validator.HibernateValidator;
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
        HibernateBean hibernateBean = new HibernateBean(null, null, new Date());
        Set<ConstraintViolation<HibernateBean>> constraintViolations =
                validator.validate(hibernateBean);

        for (ConstraintViolation<HibernateBean> e : constraintViolations) {
            System.out.println(e.getMessage());
        }

        assertEquals( 1, constraintViolations.size() );
//        assertEquals(
//                "may not be null",
//                constraintViolations.iterator().next().getMessage()
//        );
    }

    /**
     * hibernate validator提供了两种模式：
     * 参考：springboot使用hibernate validator校验：https://www.cnblogs.com/leeego-123/p/10820099.html
     */
    @Test
    public void testFastFail() {
        ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
                .configure()
                .failFast( true )
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        HibernateBean hibernateBean = new HibernateBean();
        Set<ConstraintViolation<HibernateBean>> constraintViolations =
                validator.validate(hibernateBean);

        for (ConstraintViolation<HibernateBean> e : constraintViolations) {
            System.out.println(e.getMessage());
        }
    }
}