package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("beanA")
public  class BeanA {
	
	private  BeanB ref;

	@Autowired
	public BeanA(@Lazy BeanB ref) {
		super();
		this.ref = ref;
	}
	
	
	
	public void setBean()
	{
		this.ref = new BeanB(this);
	}
	
	
	/*
	 * public BeanA() { System.out.println("Bean A created"); }
	 * 
	 * public void setRef(BeanB ref) { this.ref = ref; }
	 */
	

}
