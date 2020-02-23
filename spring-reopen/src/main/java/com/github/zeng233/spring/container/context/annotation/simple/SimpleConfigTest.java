package com.github.zeng233.spring.container.context.annotation.simple;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/2/11 11:55
 * @Version 1.0
 */
public class SimpleConfigTest {

	/**
	 * 测试主流程，
	 * 也可以手动refresh
	 * AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	 * 		ctx.register(SimpleConfig.class);
	 * 		ctx.refresh();
	 */
	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleConfig.class);
	}
}
