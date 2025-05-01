package com.infy.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class CustomerDev {

private static final Logger LOGGER = LogManager.getLogger(CustomerDev.class);

	public CustomerDev() {
		LOGGER.info("CustomerDev bean initialized in development environment");
	}
	
	
}
