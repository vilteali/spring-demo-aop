package com.alicode.spring.model;

import org.springframework.stereotype.Component;

@Component
public class AccountImp {
	
	private String name;
	private String serviceCode;
	
	public void addAccount(Account theAccount, boolean vipAccount) {
		
		System.out.println(getClass().getName()+": ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass().getName()+"doWork()");
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
