package com.app;

interface MyInt1
{
	public void sayHello();
	
	default public void sayGoodBye()
	{
		System.out.println("God Bye from MyInt 1");
	}
}

interface MyInt2
{
	public void sayHey();
	
	default public void sayGoodBye()
	{
		System.out.println("God Bye from MyInt 2");
	}
}
class TestInheritence implements MyInt1 , MyInt2
{


	@Override
	public void sayHey() {
		System.out.println("Hey...");
		
	}

	@Override
	public void sayHello() {
		System.out.println("Hello ...Nikhil");
		
	}

	@Override
	public void sayGoodBye() {
		MyInt1.super.sayGoodBye();
		MyInt2.super.sayGoodBye();
		System.out.println("Good bye from test");
	}

	
	
}
public class TestDefaultMethodMultiInhe 
{
	public static void main(String[] args) {
		TestInheritence obj = new TestInheritence();
		obj.sayHey();
		obj.sayHello();
		obj.sayGoodBye();
	}
	
}
