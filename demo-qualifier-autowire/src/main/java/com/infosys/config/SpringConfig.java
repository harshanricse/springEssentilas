package com.infosys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.demo.Customer;
import com.infosys.demo.Plan;
import com.infosys.demo.PostPaid;
import com.infosys.demo.PrePaid;

@Configuration
public class SpringConfig {

	@Bean
	public Plan planPerPaid() {
		return new PrePaid();
	}
	
	@Bean
	public Plan planPostPaid() {
		return new PostPaid();
	}
	
	@Bean
	public Customer customer() {
		return new Customer();
	}
}
