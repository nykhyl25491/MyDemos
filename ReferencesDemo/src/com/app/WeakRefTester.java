package com.app;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class WeakRefTester 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee(101, "Nikhil", 100000); //Strong Reference
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		//creating weak reference to Employee type object to which employee also pointing
		//WeakReference<Employee> weakEmp = new WeakReference<Employee>(employee);
		
		System.out.println("Strong Ref o/p :: "+employee.getName());
		
		employee = null; //employee is now available for garbage collection,But it will garbage collected only if JVM needs memmory.
		for(int i=0;i<10;i++)
		{
			System.gc();
		}
		
		//Employee emp = weakEmp.get();  //we can retrive back the object which has been weakly reffered. 
		
		//System.out.println("Weak Ref o/p :: "+emp.getName());
		
	}
}
