package com.alicode.spring.model;

import org.springframework.stereotype.Component;

@Component
public class MemberShip {

	public boolean addTest() {
		
		System.out.println(getClass()+": ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}
	
	public void goToSleep() {
	
		System.out.println(getClass().getName()+" I'm going to sleep now...");
	}
}
