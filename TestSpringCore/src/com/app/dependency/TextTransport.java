package com.app.dependency;

public class TextTransport implements Transport 
{
	public TextTransport() {
		System.out.println("In constructor of "+getClass().getName());
	}
	
	@Override
	public void informBank(String msg) {
		System.out.println("Informing bank using "+getClass().getName()+" layer");
		
	}
}
