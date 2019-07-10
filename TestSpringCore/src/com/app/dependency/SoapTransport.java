package com.app.dependency;

public class SoapTransport implements Transport
{

	public SoapTransport() {
		System.out.println("In constructor of "+getClass().getName());
	}
	
	@Override
	public void informBank(String msg) {
		System.out.println("Informing bank using "+getClass().getName()+" layer");
		
	}
}
