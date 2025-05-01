package com.infosys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infosys.demo.Customer;

@Configuration
public class SpringConfig {

	@Bean
	@Scope("prototype")
	public Customer customer() {
		return new Customer();
	}
}
