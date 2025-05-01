package com.infy.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.demo.Customer;

public class UserInterface {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Customer customer=(Customer) context.getBean("customerBean");
		
		customer.setCustomerName("Alex");
		System.out.println(customer.registerCustomer(customer.getCustomerName()));
		
	}

}
