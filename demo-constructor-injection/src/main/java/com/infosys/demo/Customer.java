package com.infosys.demo;

public class Customer {

	private Plan plan;
	
	public Customer(Plan plan) {
		this.plan=plan;
	}
	
	public void register() {
		
		if(plan.enrollToPlan()!=null && plan.enrollToPlan()) {
			System.out.println("Customer enrolled to plan successfully");
		}
		else {
			System.out.println("Customer not registered. Pls try again.");
		}
	}
}
