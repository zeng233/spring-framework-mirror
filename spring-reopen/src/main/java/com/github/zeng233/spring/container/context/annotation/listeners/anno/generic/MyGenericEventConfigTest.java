package com.github.zeng233.spring.container.context.annotation.listeners.anno.generic;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zenghua
 * @date 2022/9/22
 */
public class MyGenericEventConfigTest {

	@Test
	public void testSimple() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyGenericEventConfig.class);
		Person person = new Person();
		person.setId("1");
		MyGenericEvent<Person> myGenericEvent1 = new MyGenericEvent<>(person);
		context.publishEvent(myGenericEvent1);

		Animal animal = new Animal();
		animal.setName("tiger");
		MyGenericEvent<Animal> myGenericEvent2 = new MyGenericEvent<>(animal);
		context.publishEvent(myGenericEvent2);
	}
}
