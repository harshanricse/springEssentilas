package com.infy.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.SpringConfig;
import com.infy.demo.CustomerEager;
import com.infy.demo.CustomerLazy;

public class UserInterface {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("Success Message: AppicationContext is Instantiated!");
		
		CustomerEager customerEager=(CustomerEager) context.getBean("customerEager");
		CustomerLazy customerLazy=(CustomerLazy) context.getBean("customerLazy");
		
		
	}

}
