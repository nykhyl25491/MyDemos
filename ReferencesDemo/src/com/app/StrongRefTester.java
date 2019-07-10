package com.app;

public class StrongRefTester {
public static void main(String[] args) {
	Employee emp = new Employee(101,"Nikhil",10000); //Strong reference :this is default type references
													//Any object which has an active strong reference are not eligible for garbage collection. 
													//The object is garbage collected only when the variable which was strongly referenced points to null.
	System.out.println(emp.getName());
	emp = null; //"emp" object is no longer referencing to the instance, so Employee type object is now eligible for garbage collection
	System.out.println(emp.getName()); //it will throws NullPointerException
}
}
