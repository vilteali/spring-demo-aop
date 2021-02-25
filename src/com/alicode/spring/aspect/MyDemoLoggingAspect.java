package com.alicode.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
		
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("\n=======> Executing @Before");
	}
	
}

