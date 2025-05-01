package com.infy.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class CustomerDev {

private static final Log LOGGER = LogFactory.getLog(CustomerDev.class);

	public CustomerDev() {
		LOGGER.info("CustomerDev bean initialized in development environment");
	}
	
	
}
