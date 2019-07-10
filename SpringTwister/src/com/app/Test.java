package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("spring-config.xml");
		Twister obj = (Twister)ctx.getBean("t");
	}
}
