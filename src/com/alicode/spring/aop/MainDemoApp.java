package com.alicode.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alicode.spring.model.Account;
import com.alicode.spring.model.AccountImp;
import com.alicode.spring.model.MemberShip;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountImp accountImp = context.getBean("accountImp", AccountImp.class);
		MemberShip memberShip = context.getBean("memberShip", MemberShip.class);
		Account theAccount = context.getBean("account", Account.class);
		
		theAccount.setName("aliTest");
		theAccount.setLevel("Black");
		
		accountImp.addAccount(theAccount, true);
		accountImp.doWork();
		
		// call the accountImp getter/setter methods
		accountImp.setName("test");
		accountImp.setServiceCode("test service");
		
		String name = accountImp.getName();
		String code = accountImp.getServiceCode();
		
		memberShip.addTest();
		memberShip.goToSleep();
		
		
		context.close();
		
	}
	
}
