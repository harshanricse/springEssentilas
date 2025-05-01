package com.infy.demo;

import javax.annotation.PostConstruct;

public class CustomerEager {

	@PostConstruct
	public void onBeanLoading() {
		System.out.println("Success Message: CustomerEager bean is Eagerly Loaded!");
	}
	
}
