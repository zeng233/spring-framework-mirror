package com.github.zeng233.spring.container.context.annotation.config.customerconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zenghua
 * @date 2022/12/2
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration//组合@Configuration元注解  bean注解
@ComponentScan//组合@ComponentScan元注解  自动扫描对应value（package路径）值下面的所有bean
public @interface CustomerConfig {
	/**
	 * 默认注解属性对应，ComponentScan注解的basePackages属性
	 * @return
	 */
	@AliasFor(annotation = ComponentScan.class, attribute = "basePackages")
	String[] value() default {};//覆盖value参数
	//就是覆盖@ComponentScan注解中的value参数----必须要写，否则组合注解中放入value值时会报错
}
