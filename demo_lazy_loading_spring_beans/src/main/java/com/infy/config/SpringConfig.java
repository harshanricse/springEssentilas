package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.infy.demo.CustomerEager;
import com.infy.demo.CustomerLazy;

@Configuration
public class SpringConfig {

	@Bean
	public CustomerEager customerEager() {
		return new CustomerEager();
	}
	
	@Bean
	@Lazy
	public CustomerLazy customerLazy() {
		return new CustomerLazy();
	}
}
