package com.infy.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.SpringConfig;
import com.infy.demo.Customer;

public class UserInterface {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Customer customer=(Customer) context.getBean("customer");
		
		customer.setCustomerName("Tanaka");
		System.out.println(customer.registerCustomer(customer.getCustomerName()));
		
		
	}

}
