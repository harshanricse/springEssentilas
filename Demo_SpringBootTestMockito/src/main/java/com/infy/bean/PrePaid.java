package com.infy.bean;

public class PrePaid implements Plan{

	@Override
	public Boolean enrollToPlan(String planName) {
		return planName.equals("PREPAID");

	}

}
