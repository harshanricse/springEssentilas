package com.infy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoLoggingUsingDefaultLoggerApplicationTests {

	@Test
	void contextLoads() {
		
		Object test = new Object();
		Assertions.assertNotNull(test);
		
	}

}
