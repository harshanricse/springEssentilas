package com.infosys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.SpringConfig;

public class UserInterface {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		CustomerLogin customerLogin1=(CustomerLogin) context.getBean("customerLogin");
		CustomerLogin customerLogin2=(CustomerLogin) context.getBean("customerLogin");
		
		System.out.println("Hashcode of customerLogin1: "+customerLogin1.hashCode());
		System.out.println("Hashcode of customerLogin2: "+customerLogin2.hashCode());

		if(customerLogin1==customerLogin2) 
			System.out.println("Same instances depicting Singleton Scope!");	
		else 
			System.out.println("Different instances depicting Prototype Scope!");	
	}

}
