package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
			System.out.println(ctx.getBean("beanA",BeanA.class));
			System.out.println(ctx.getBean("beanB",BeanB.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
