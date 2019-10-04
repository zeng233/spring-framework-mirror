/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.zeng233.spring.container.context.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 
 * @author zenghua233
 * @since 4.2.1
 */

@Configuration
public class AppConfig {

	@Bean(name = "myBean2")
	public MyBean2 myBean2() {
		MyBean2 myBean2 = new MyBean2();
		return myBean2;
	}

	//默认为singleton
	@Bean
	@Scope("singleton")
	public MyBean myBean(@Qualifier("myBean2") MyBean2 myBean2) {
		return new MyBean(myBean2);
	}
}
