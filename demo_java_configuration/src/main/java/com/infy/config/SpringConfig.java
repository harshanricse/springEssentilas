package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.demo.Customer;

@Configuration
public class SpringConfig {

	@Bean(name = "customerBean")	
	public Customer customer() {
		return new Customer();
	}
	
}
