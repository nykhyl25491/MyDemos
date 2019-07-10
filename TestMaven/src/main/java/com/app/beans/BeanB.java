package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("beanB")
public class BeanB {
	
	private   BeanA ref;

	@Autowired
	public BeanB(BeanA ref) {
		super();
		this.ref = ref;
	}
	
	
	/*
	 * public BeanB() { System.out.println("Bean B created"); }
	 * 
	 * public void setRef(BeanA ref) { this.ref = ref; }
	 */
	
	

}
