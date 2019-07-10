package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) 
	{
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		TestA a = (TestA) ctx.getBean("a"); //it gives exception BeanCurrentlyInCreationException
		TestB b = (TestB) ctx.getBean("b");
		
		a.doSomethimg();
		b.doSomethimg();
	}

}
