package com.alicode.spring.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	@After("execution(* com.alicode.spring.model.AccountImp.findAccounts(..))")
	public void afterFinallyFindAccoutsAdvice(JoinPoint joinPoint) {
		
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=======> Executing @After on method: "+method);
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.alicode.spring.model.AccountImp.findAccounts(..))",
			throwing = "exc")
	public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exc) {
		
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=======> Executing @AfterThrowing on method: "+method);
		
		System.out.println("\n=======> The exception is: "+exc);
	}
	
	@AfterReturning(
			pointcut = "execution(* com.alicode.spring.model.AccountImp.findAccounts(..))",
			returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=======> Executing @AfterReturnig on method: "+method);
		
		System.out.println("\n=======> Result is: "+result);
		
		// let's post-process the data.. let's modify the account
		// convert the account names to upperCase
		convertAccountNamesToUpperCase(result);
		System.out.println("\n=======> Result is: "+result);
	}
		
	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for (Account account : result) {
			String theUpperName = account.getName().toUpperCase();
			account.setName(theUpperName);
		}
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

