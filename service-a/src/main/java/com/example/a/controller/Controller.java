package com.example.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.a.config.CloudPropertyConfig;
import com.example.a.config.PropertyConfig;

@RestController
public class Controller {

	@Autowired
	PropertyConfig propertyConfig; 
	
	@Autowired
	CloudPropertyConfig cloudPropertyConfig;
	
	@GetMapping("hello")
	public String hello() {
		return "Hello World" + propertyConfig.getLimit() + cloudPropertyConfig.getTemp();
	}
}
