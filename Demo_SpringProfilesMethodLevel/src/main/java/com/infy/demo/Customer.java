package com.infy.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("Customer")
public class Customer {
	
	private static final Logger LOGGER = LogManager.getLogger(Customer.class);

	@Bean("customer")
	@Profile("dev")
	public void CustomerDev() {
		LOGGER.info("CustomerDev bean created in Dev env");
	}
	
	@Profile("prod")
	@Bean("customer")
	public void CustomerProd() {
		LOGGER.info("CustomerProd bean created in Prod env");
	}

}
