package com.github.zeng233.spring.container.context.validate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.ConstraintViolationException;

/**
 * @Description
 *  参考：https://github.com/ghillert/spring-hibernate-validator-sample
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/2/28 9:09
 * @Version 1.0
 */
@ContextConfiguration(locations = "classpath:com/github/zeng233/spring/container/context/validate/ValidateBeanTest.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ValidateBeanTest {
    @Autowired
    private IValidateBean validateBean;

    /**
     * 有配置的MethodValidationPostProcessor 初始化参数拦截配置
     */
    @Test
    public void testMethod() {

            try {
                validateBean.print("a");
            } catch (ConstraintViolationException e) {
                System.out.println(e.getConstraintViolations().iterator().next().getMessage());
            }
    }
}