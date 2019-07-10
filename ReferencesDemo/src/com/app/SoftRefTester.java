package com.app;

import java.lang.ref.SoftReference;

public class SoftRefTester 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(101,"Nikhil",10000); //Strong Reference
		
		System.out.println(emp.getName());
		
		SoftReference<Employee> softRef = new SoftReference<Employee>(emp); //Creating a soft reference to Employee type object ro which emp also pointing
		
		// In Soft reference, even if the object is free for garbage collection then also its not garbage collected, 
		//until JVM is in need of memory badly.The objects gets cleared from the memory when JVM runs out of memory.
		//To create such references java.lang.ref.SoftReference class is used.
		
		emp= null; //Strong reference emp,eligible for garbage collector
		
		Employee softEmp = softRef.get(); //getting soft ref of Employee
		
		System.out.println(softEmp.getName());
		
		
		
		 
	}
}
