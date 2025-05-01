package com.infy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Autowired
	@Qualifier(value="postPaid")
	private Plan plan;

	public String register(String planName) {
		if (plan.enrollToPlan(planName)!=null && plan.enrollToPlan(planName)) {
			return "Customer enrolled to Plan";
		} else {
			return "Customer not registered!";
		}
	}

}
