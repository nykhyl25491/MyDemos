package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class TestB {
	@Autowired
	private  TestA a;
	
	
	  public TestB(TestA a) { this.a = a;
	  System.out.println("Inside constructor of "+getClass().getName() +
	  " Reference "+ a); }
	 
	
	public void doSomethimg()
	{
		System.out.println("HEllo from Test B" + a);
	}


	public TestA getA() {
		return a;
	}


	public void setA(TestA a) {
		this.a = a;
	}
	
	
	
	/*
	 * public TestB() {
	 * System.out.println("Inside constructor of "+getClass().getName()); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void setAref(TestA aref) { this.a = aref;
	 * System.out.println("Inside setter of "+getClass().getName() +" Reference "+
	 * this.a); }
	 */
	 
	
	
}
