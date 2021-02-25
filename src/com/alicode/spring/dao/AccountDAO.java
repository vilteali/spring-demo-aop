package com.alicode.spring.dao;

import org.springframework.stereotype.Component;

import com.alicode.spring.model.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vipAccount) {
		
		System.out.println(getClass().getName()+": ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass().getName()+"doWork()");
		return true;
	}
	
}
