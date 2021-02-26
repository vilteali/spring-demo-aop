package com.alicode.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alicode.spring.model.Account;
import com.alicode.spring.model.AccountImp;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountImp accountImp = context.getBean("accountImp", AccountImp.class);
		
		List<Account> theAccounts = accountImp.findAccounts();
		
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("===================================");
		System.out.println("\n"+theAccounts);
		
		context.close();
		
	}
	
}
