package com.infy.bean;

public class PostPaid implements Plan{

	@Override
	public Boolean enrollToPlan(String planName) {
		return planName.equals("POSTPAID");
	}
}
