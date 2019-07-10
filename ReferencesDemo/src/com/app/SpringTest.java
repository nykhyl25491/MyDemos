package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	public static void main(String[] args) 
	{
		try 
		{
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
			Employee emp1 = (Employee) ctx.getBean("emp1");
			System.out.println(emp1.getName());
			Employee emp2 = (Employee) ctx.getBean("emp2");
			System.out.println(emp2.getName());
			System.out.println(emp1 == emp2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
