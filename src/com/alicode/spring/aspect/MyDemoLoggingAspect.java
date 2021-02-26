package com.alicode.spring.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.alicode.spring.model.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@AfterReturning(
			pointcut = "execution(* com.alicode.spring.model.AccountImp.findAccounts(..))",
			returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=======> Executing @AfterReturnig on method: "+method);
		
		System.out.println("\n=======> Result is: "+result);
		
	}
		
	@Before("com.alicode.spring.aspect.PointCutsExpressionsAOP."
			+ "forDaoPackageNoGetterSetter()")
	public void beforeAddAccount(JoinPoint joinPoint) {
		System.out.println("\n=======> Executing @Before");
	
		// display the method signature
		MethodSignature methodSig = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: "+methodSig);
		
		// display method arguments
		Object[] args =  joinPoint.getArgs();
		
		for (Object object : args) {
			System.out.println(object);
			
			if(object instanceof Account) {
				Account account = (Account) object;
				
				System.out.println("Account name: "+account.getName());
				System.out.println("Account name: "+account.getLevel());
			}
		}
		
	}
	
}

