package com.infosys.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	@Autowired
	@Qualifier("planPostPaid")
	private Plan plan;
	
	
	public String register() {
		
		if(plan.enrollToPlan()!=null && plan.enrollToPlan()) {
			return "Customer enrolled to plan successfully";
		}
		else {
			return "Customer not registered. Pls try again.";
		}
	}
}
