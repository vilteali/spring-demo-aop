package com.alicode.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {
	
	@Before("com.alicode.spring.aspect.PointCutsExpressionsAOP."
			+ "forDaoPackageNoGetterSetter()") 
	public void logToCloudAsync() {
		System.out.println("\n=======> Logging to Cloud in Async for user");
	}
	
}
