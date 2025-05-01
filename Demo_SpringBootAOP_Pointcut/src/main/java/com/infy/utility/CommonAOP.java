package com.infy.utility;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonAOP {

	//pointcut declaration
	@Pointcut("execution(* com.infy.bean.*.*(..))")
	public void logUsingPointcut() {
		
	}

}
