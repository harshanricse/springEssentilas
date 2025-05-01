package com.infy.bean;

import org.springframework.stereotype.Component;

@Component
public class PostPaid implements Plan{

	@Override
	public Boolean enrollToPlam(String planName) {
		return planName.equals("POSTPAID");
	}

	
}
