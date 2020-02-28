package com.github.zeng233.spring.container.context.validate;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/2/28 9:02
 * @Version 1.0
 */
@Validated
public interface IValidateBean {

    /**
     * validate方法校验
     * @param input
     * @return
     */
    @NotNull(message = "Null returns are not permitted")
    String print(@NotEmpty(message = "Input must not be null or empty.") String input);
}
