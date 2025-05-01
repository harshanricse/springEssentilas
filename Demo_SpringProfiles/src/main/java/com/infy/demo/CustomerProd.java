package com.infy.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class CustomerProd {

private static final Logger LOGGER = LogManager.getLogger(CustomerProd.class);

	public CustomerProd() {
		LOGGER.info("CustomerProd bean initialized in production environment");
	}
	
	
}
