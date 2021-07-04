/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.servlet.mytest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.mock.web.test.MockHttpServletRequest;
import org.springframework.mock.web.test.MockHttpServletResponse;
import org.springframework.mock.web.test.MockServletConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.AbstractServletHandlerMethodTests;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 复制来源：org.springframework.web.servlet.mvc.method.annotation.ServletAnnotationControllerHandlerMethodTests
 *
 * 主要测试各种流程
 * @author Rossen Stoyanchev
 * @author Juergen Hoeller
 */
public class MyServletAnnotationControllerHandlerMethodTests extends AbstractServletHandlerMethodTests {
	public static final Logger mylog = Logger.getLogger(MyServletAnnotationControllerHandlerMethodTests.class);

	private DispatcherServlet servlet;

	/**
	 * 参考：org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupportTests#customArgumentResolvers()
	 *
	 * AnnotationConfigWebApplicationContext
	 * @throws Exception
	 */
	@Test
	public void tesstArgs() throws Exception {
		final GenericWebApplicationContext wac = new GenericWebApplicationContext();

		servlet = new DispatcherServlet() {
			@Override
			protected WebApplicationContext createWebApplicationContext(@Nullable WebApplicationContext parent) {
				Class<MyArgsController> clazz = MyArgsController.class;
					wac.registerBeanDefinition(clazz.getSimpleName(), new RootBeanDefinition(clazz));

				RootBeanDefinition mappingDef = new RootBeanDefinition(RequestMappingHandlerMapping.class);
				mappingDef.getPropertyValues().add("removeSemicolonContent", "false");
				wac.registerBeanDefinition("handlerMapping", mappingDef);
				wac.registerBeanDefinition("handlerAdapter",
						new RootBeanDefinition(RequestMappingHandlerAdapter.class));
				wac.registerBeanDefinition("requestMappingResolver",
						new RootBeanDefinition(ExceptionHandlerExceptionResolver.class));
				wac.registerBeanDefinition("responseStatusResolver",
						new RootBeanDefinition(ResponseStatusExceptionResolver.class));
				wac.registerBeanDefinition("defaultResolver",
						new RootBeanDefinition(DefaultHandlerExceptionResolver.class));

				wac.refresh();
				return wac;
			}
		};

		servlet.init(new MockServletConfig());

		MockHttpServletRequest request = new MockHttpServletRequest("GET", "/foo");
		request.setContextPath("/foo");
		request.setServletPath("");
		MockHttpServletResponse response = new MockHttpServletResponse();
		servlet.service(request, response);
		assertEquals("test", response.getContentAsString());
	}


	@EnableWebMvc
	@Configuration
	static class CustomArgumentResolverConfig implements WebMvcConfigurer {

		@Override
		public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
			resolvers.add(new TrackerHandlerMethodArgumentResolver());
		}

		@Override
		public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
//			handlers.add(new WebMvcConfigurationSupportTests.TestReturnValueHandler());
		}
	}
}
