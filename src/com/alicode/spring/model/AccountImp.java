package com.alicode.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountImp {
	
	private String name;
	private String serviceCode;
	
	public void addAccount(Account theAccount, boolean vipAccount) {
		System.out.println(getClass().getName()+": ADDING AN ACCOUNT");
	}
							
	public List <Account> findAccounts() {
		
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("Bob", "Silver");
		Account temp2 = new Account("Rich", "Platinum");
		Account temp3 = new Account("Katy", "Gold");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	
	public boolean doWork() {
		
		System.out.println(getClass().getName()+" doWork()");
		return true;
	}

	public String getName() {
		System.out.println(getClass()+" : in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+" : in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass()+" : in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass()+" : in setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
}
