package com.alicode.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {

	@Before("com.alicode.spring.aspect.PointCutsExpressionsAOP."
			+ "forDaoPackageNoGetterSetter()")
	public void performApiUsers() {
		System.out.println("\n=======> Performing API user analytics");
	}	
}
