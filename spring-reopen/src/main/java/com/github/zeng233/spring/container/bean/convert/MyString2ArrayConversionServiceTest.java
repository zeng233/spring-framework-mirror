package com.github.zeng233.spring.container.bean.convert;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zenghua
 * @date 2022/11/22
 */
public class MyString2ArrayConversionServiceTest {
	/**
	 * 参考：org.springframework.context.expression.ApplicationContextExpressionTests
	 *
	 * org.springframework.core.convert.support.GenericConversionServiceTests#emptyListToArray()
	 *
	 *
	 */
	@Test
	public void testConversionService() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyString2ArrayConversionServiceTest.xml", getClass());


//		=====================================错误示范，配置文件中中配置，不用代码中手动配置=========================================================
		//手动设置AbstractBeanFactory.setConversionService，替换PropertyEditors，参考BeanWrapperImpl
		//AbstractBeanFactory.initBeanWrapper执行
//		ConfigurableConversionService configurableConversionService = new DefaultConversionService();
//		configurableConversionService.addConverter(new Converter<String, Date>() {
//			@Override
//			public Date convert(String source) {
//				System.out.println(source);
//				return new Date();
//			}
//		});
//		configurableConversionService.addConverter(new Converter<String, MultiNameBean>() {
//			@Override
//			public MultiNameBean convert(String source) {
//				String[] name = source.split("\\s");
//				MultiNameBean result = new MultiNameBean(name[0], name[1]);
//				return result;
//			}
//		});
////		这样手动初始化永远不行的
////		参考org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireBean，设置转换器之前就已经初始化BeanWrapper
////		参考org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization，需要配置中先设置到转换器api,DefaultConversionService
//		context.getBeanFactory().setConversionService(configurableConversionService);
//		======================================================================================================



		MyCustomConvertBean myCustomConvertBean = context.getBean("myCustomConvertBean", MyCustomConvertBean.class);
//		System.out.println(myCustomConvertBean.getMultiNameBean());
//		System.out.println(myCustomConvertBean.getCreateDate());
		System.out.println(myCustomConvertBean.getNumbers());
	}
}
