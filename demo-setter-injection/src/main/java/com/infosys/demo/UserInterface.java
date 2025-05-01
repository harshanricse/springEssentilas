package com.infosys.demo;

public class UserInterface {

	public static void main(String[] args) {
		Plan plan = new PrePaid();
		Customer customer =  new Customer();
		customer.setPlan(plan);
		customer.register();
	}

}
