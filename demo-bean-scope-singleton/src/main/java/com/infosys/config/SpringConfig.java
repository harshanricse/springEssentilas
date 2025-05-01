package com.infosys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infosys.demo.CustomerLogin;

@Configuration
public class SpringConfig {

	@Bean
	@Scope("singleton")
	public CustomerLogin customerLogin() {
		return new CustomerLogin();
	}
}
