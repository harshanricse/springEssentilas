package com.infy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.bean.Customer;

@SpringBootTest
class DemoSpringBootTestApplicationTests {

	@Autowired
	Customer customer;
	
	
//	@Test
//	void contextLoads() {
//	}
	
	@Test
	void registerTestValidPlan() throws Exception{
		String actual = customer.register("PREPAID");
		Assertions.assertEquals("Customer enrolled to plan", actual);
	}
	
	@Test
	void registerTestInvalidPlan() {
		Exception exception = Assertions.assertThrows(Exception.class, ()->customer.register("POSTPAID"));
		Assertions.assertEquals("Customer not registered!", exception.getMessage());
	}

}
