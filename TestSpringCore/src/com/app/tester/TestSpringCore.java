package com.app.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dependent.ATM;

public class TestSpringCore {
	
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		ATM atmRef = (ATM) ctx.getBean("my_atm");
		System.out.println("-------------------"+atmRef);
		
	}

}
