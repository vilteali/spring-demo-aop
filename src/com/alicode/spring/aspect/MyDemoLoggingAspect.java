package com.alicode.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.alicode.spring.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccount() {
		
		System.out.println("\n=======> Executing @Before");
	}
	
	@Before("forDaoPackage()")
	public void performApiUsers() {
		System.out.println("=======> Performing API users");
	}
	
}

