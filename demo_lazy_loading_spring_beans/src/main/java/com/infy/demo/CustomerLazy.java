package com.infy.demo;

import javax.annotation.PostConstruct;

public class CustomerLazy {

	@PostConstruct
	public void onBeanLoading() {
		System.out.println("Success Message: CustomerEager bean is Lazily Loaded!");
	}
	
}
