package com.infy.utility;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

public static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class); 
	
	@Before("com.infy.utility.CommonAOP.logUsingPointcut()")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("Before Enrolling for a plan.."+joinPoint.getSignature().getName());
	}

	@After("com.infy.utility.CommonAOP.logUsingPointcut()")
	public void after() {
		LOGGER.info("Enrolled successfully.");
	}	
	
	@AfterReturning(pointcut = "com.infy.utility.CommonAOP.logUsingPointcut()",returning = "returnVal")
	public void afterReturning(Object returnVal) {
		LOGGER.info("Enrolled successfully for the plan."+returnVal);
	}

	
	@Around( "com.infy.utility.CommonAOP.logUsingPointcut()")
	  public Object aroundExec(ProceedingJoinPoint proceedJP) throws Throwable {
	    long startTime= System.currentTimeMillis();
	    Object returnVal = proceedJP.proceed();
	    Long timeTaken = System.currentTimeMillis()- startTime;
	    LOGGER.info("Time Taken by joinpoint to execute is"+timeTaken);
	    return returnVal;
	  }





}
