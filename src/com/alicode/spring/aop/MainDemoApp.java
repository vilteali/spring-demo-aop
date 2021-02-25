package com.alicode.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alicode.spring.dao.AccountDAO;
import com.alicode.spring.dao.MemberShipDAO;
import com.alicode.spring.model.Account;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MemberShipDAO memberShipDao = context.getBean("memberShipDAO", MemberShipDAO.class);
		Account theAccount = context.getBean("account", Account.class);
		
		accountDAO.addAccount(theAccount, true);
		accountDAO.doWork();
		
		memberShipDao.addTest();
		memberShipDao.goToSleep();
		
		context.close();
		
	}
	
}
