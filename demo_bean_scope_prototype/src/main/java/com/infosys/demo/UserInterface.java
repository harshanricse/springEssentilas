package com.infosys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.SpringConfig;

public class UserInterface {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//for Illustrating Prototype Bean Scope
		
		Customer customer1=(Customer) context.getBean("customer");
		Customer customer2=(Customer) context.getBean("customer");
		
		System.out.println("Hashcode of customerLogin1: "+customer1.hashCode());
		System.out.println("Hashcode of customerLogin2: "+customer2.hashCode());

		if(customer1==customer2) 
			System.out.println("Same instances depicting Singleton Scope!");	
		else 
			System.out.println("Different instances depicting Prototype Scope!");	
		
	}

}
