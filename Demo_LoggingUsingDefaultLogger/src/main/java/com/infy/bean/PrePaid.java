package com.infy.bean;

import org.springframework.stereotype.Component;

@Component
public class PrePaid implements Plan {

	@Override
	public Boolean enrollToPlam(String planName) {
		return planName.equals("PREPAID");
	}
	
}
