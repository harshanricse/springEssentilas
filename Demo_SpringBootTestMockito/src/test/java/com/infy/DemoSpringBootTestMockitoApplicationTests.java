package com.infy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.bean.Customer;
import com.infy.bean.Plan;

@SpringBootTest
class DemoSpringBootTestMockitoApplicationTests {

	@Mock
	
	private Plan plan;
	
	@InjectMocks
	
	private Customer customer = new Customer();
	
	@Test
	void registerTestValidPlan() throws Exception{
		
		String planName="PREPAID";
		
		Mockito.when(plan.enrollToPlan(planName)).thenReturn(true);
	
		String actual  = customer.register(planName);
		
		Assertions.assertEquals("Customer enrolled to Plan", actual);
	}
	
	@Test
	void registerTestInvalidPlan() throws Exception{
		
		String planName="POSTPAID";
		
		Mockito.when(plan.enrollToPlan(planName)).thenReturn(false);
	
		Exception exception = Assertions.assertThrows(Exception.class, () -> customer.register(planName));
		
		Assertions.assertEquals("Customer not registered", exception.getMessage());
	}
}
