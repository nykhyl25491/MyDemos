package com.app.dependent;

import com.app.dependency.Transport;

public class ATMImpl implements ATM
{
	private Transport ref ; 
	public ATMImpl() {
		System.out.println("Inside constructor of " + getClass().getName()+" "+ref);
		
	}
	@Override
	public void deposite(double amount) 
	{
		System.out.println("defositing "+amount);
		String msg = "defositing "+amount;
		ref.informBank(msg);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing "+amount);
		String msg = "Withdrawing "+amount;
		ref.informBank(msg);
	}
	public void setRef(Transport ref) {
		System.out.println("Inside setter of transport");
		this.ref = ref;
	}
	
	public void myInit() throws Exception {
		System.out.println("in init "+ref);
	}

	// destroy style method
	public void myDestroy()  {
		System.out.println("in destroy" + ref);
	}
	
	
}
