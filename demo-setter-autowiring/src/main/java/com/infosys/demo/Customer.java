package com.infosys.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private Plan plan;
	
	@Autowired
	public void setPlan(Plan plan) {
		this.plan=plan;
	}
	
	public String register() {
		
		if(plan.enrollToPlan()!=null && plan.enrollToPlan()) {
			return "Customer enrolled to plan successfully";
		}
		else {
			return "Customer not registered. Pls try again.";
		}
	}
}
