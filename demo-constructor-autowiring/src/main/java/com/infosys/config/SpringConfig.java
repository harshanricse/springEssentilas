package com.infosys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.demo.Customer;
import com.infosys.demo.Plan;
import com.infosys.demo.PrePaid;

@Configuration
public class SpringConfig {

	@Bean
	public Plan plan() {
		return new PrePaid();
	}
	
	@Bean
	public Customer customer(Plan plan) {
		return new Customer(plan);
	}
}
