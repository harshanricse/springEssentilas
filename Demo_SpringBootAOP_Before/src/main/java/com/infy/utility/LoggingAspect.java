package com.infy.utility;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	public static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class); 
	@Before("execution(* com.infy.bean.*.*(..))")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("Before Enrolling for a plan.."+joinPoint.getSignature().getName());
	}

	@After("execution(* com.infy.bean.*.*(..))")
	public void after() {
		LOGGER.info("Enroll/Decide on the plans available.");
	}


}
