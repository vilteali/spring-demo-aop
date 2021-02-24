package com.alicode.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alicode.spring.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		accountDAO.addAccount();
		
		context.close();
		
	}
	
}
