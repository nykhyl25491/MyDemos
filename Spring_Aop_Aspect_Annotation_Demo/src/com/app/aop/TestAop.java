package com.app.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		EmployeeManager manager =  (EmployeeManager) ctx.getBean("employeeManager");
		
	//	manager.getEmployeeById(10);
		
		
		  manager.createEmployee(new Employee());
		  
		//  manager.updateEmployee(new Employee());
		 
	}
}
