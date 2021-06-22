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
	 * spring如何启动的
	 * 为了方便查看每一步的动作，使用手动刷新容器
	 */
	@Test
	public void testBootstrap() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(SimpleConfig.class);
		System.out.println("======注册bean完成=======");
		ctx.refresh();
	}

	/**
	 * 参考：org.springframework.context.annotation.AnnotationConfigApplicationContextTests
	 * <p>
	 * 测试主流程，
	 * 也可以手动refresh
	 * AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	 * ctx.register(SimpleConfig.class);
	 * ctx.refresh();
	 */
	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleConfig.class);
	}
}
