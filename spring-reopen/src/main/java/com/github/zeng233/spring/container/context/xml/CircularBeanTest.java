package com.github.zeng233.spring.container.context.xml;

import org.junit.Test;

/**
 * 循环依赖测试
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/9/25 上午9:33
 */
public class CircularBeanTest {

	/**
	 * 循环依赖测试
	 * 参考：https://www.jianshu.com/p/6c359768b1dc
	 *
	 *
	 * Spring单例对象的初始化其实可以分为三步：
	 *
	 * createBeanInstance， 实例化，实际上就是调用对应的构造方法构造对象，此时只是调用了构造方法，spring xml中指定的property并没有进行populate
	 * populateBean，填充属性，这步对spring xml中指定的property进行populate
	 * initializeBean，调用spring xml中指定的init方法，或者AfterPropertiesSet方法
	 * 会发生循环依赖的步骤集中在第一步和第二步。
	 *
	 */
	@Test
	public void testSimple() {

	}
}
