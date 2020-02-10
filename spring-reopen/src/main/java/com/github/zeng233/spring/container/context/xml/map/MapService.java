package com.github.zeng233.spring.container.context.xml.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MapService {

	@Autowired
	Map<String, MapBean> map;

	public void print() {
		if (map != null && map.size() > 0) {
			map.keySet().forEach(System.out::println);
		}
	}
}
