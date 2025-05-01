package com.infy;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyTelException;

@SpringBootApplication
public class DemoLoggingUsingDefaultLoggerApplication implements CommandLineRunner{

	private static final Logger LOGGER = LogManager.getLogger(DemoLoggingUsingDefaultLoggerApplication.class);
	
	@Autowired
	CustomerLoginController customerLoginController;
	
	@Autowired
	Environment environment;
	
	public static void main(String[] args){
		SpringApplication.run(DemoLoggingUsingDefaultLoggerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harry");
			customerLogin.setPassword("harry123");
			customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty("SUCCESS"));
		}catch (InfyTelException exception) {
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}
		
	}
	
	

}
