package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.bean.Customer;

@SpringBootApplication
public class DemoSpringBootAopApplication implements CommandLineRunner{
	
	private static final Log LOGGER = LogFactory.getLog(DemoSpringBootAopApplication.class);
	

	@Autowired
	Customer cust;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootAopApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		LOGGER.info(cust.register("POSTPAID"));
		
	}

}
