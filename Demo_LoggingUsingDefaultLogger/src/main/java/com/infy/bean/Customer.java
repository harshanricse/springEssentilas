package com.infy.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.infy.exception.InfyTelException;

@Component
public class Customer {

	@Autowired
	@Qualifier("prePaid")
	private Plan plan;
	
	public String register(String planName) throws InfyTelException{
		try {
			if(plan.enrollToPlam(planName)!=null && plan.enrollToPlam(planName)) {
				return "Customer enrolled to Plan";
			} else {
				throw new InfyTelException("Customer not registered!");
			}
		}
		
		catch(InfyTelException exception){
			Log LOGGER = LogFactory.getLog(this.getClass());
			LOGGER.error(exception.getMessage(), exception);
			throw exception;
		}
	}
}
