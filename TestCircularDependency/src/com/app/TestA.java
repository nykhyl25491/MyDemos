package com.app;

import javax.annotation.PostConstruct;
import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class TestA 
{
	
	@Autowired
	private  TestB b;
	

	/*
	 * public TestA(@Lazy TestB b) { this.b = b;
	 * System.out.println("Inside constructor of "+getClass().getName() +
	 * " Reference "+ b); }
	 */
	 
	
	public void doSomethimg()
	{
		System.out.println("HEllo from Test A "+ b);
	}


	public TestB getB() {
		return b;
	}


	public void setB(TestB b) {
		this.b = b;
	}


	/*
	 * @PostConstruct public void init() {
	 * System.out.println("Inside init post creation"); b.setA(this); }
	 */
	
	
	
	
	
	
}
