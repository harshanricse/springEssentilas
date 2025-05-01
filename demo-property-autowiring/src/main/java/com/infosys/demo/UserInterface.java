package com.infosys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.SpringConfig;

public class UserInterface {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer.register());
	}

}
