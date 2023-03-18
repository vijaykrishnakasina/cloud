package com.example.a.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom.properties")
public class PropertyConfig {

	@Value("${custom.key}")
	private String key;
	
	@Value("${custom.value}")
	private Integer value;
	
	@Value("${custom.limit:10}")
	private Integer limit;

	public String getKey() {
		return key;
	}

	public Integer getValue() {
		return value;
	}

	public Integer getLimit() {
		return limit;
	}
	
	
}
