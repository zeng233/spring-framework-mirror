package com.github.zeng233.spring.container.context.annotation.listeners.anno.generic;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zenghua
 * @date 2022/9/22
 */
@Component
public class MyGenericListener {

	@EventListener
	public void onEvent1(MyGenericEvent<Person> myGenericEvent) {
		Person person = (Person) myGenericEvent.getSource();
		System.out.println(person.getId());
	}

	@EventListener
	public void onEvent2(MyGenericEvent<Animal> myGenericEvent) {
		Animal animal = (Animal) myGenericEvent.getSource();
		System.out.println(animal.getName());
	}
}
