package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

@FunctionalInterface
interface MyInterface //an interface having only one abstract method is called functional interface
{
	public void sayHello(String msg);
	default int addition(int a,int b)
	{
		return a+b;
	}
	
}
public class Test {
	
	ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	public static void main(String[] args) {
		
		
		/*
		 * Employee e1 = new Employee(101,"Nikhil",500.00); Employee e2 = new
		 * Employee(101,"Nikhil",500.00);
		 * 
		 * Map<Employee, String> map = new HashMap<>(); map.put(e1, e1.getName());
		 * map.put(e2, e2.getName());
		 * 
		 * System.out.println(e1.hashCode()); System.out.println(e2.hashCode());
		 * 
		 * System.out.println(map.get(e2));
		 * map.forEach((k,v)->System.out.println(k+"----"+v));
		 */
		 
		
		/*
		 * Map<Integer, String> map = new HashMap<Integer, String>();
		 * map.put(100,"abc"); map.put(200,"xyz");
		 * 
		 * map.forEach((k,v)->System.out.println(k+"----"+v));
		 */
		 
		/*
		 * List<Integer> iList = new ArrayList<Integer>(); iList.add(10); iList.add(20);
		 * iList.add(30); iList.add(40); iList.add(50);
		 * 
		 * System.out.println("using foreach loop"); for (Integer num : iList) {
		 * System.out.println("------"+num); }
		 * 
		 * System.out.println("using forech method");
		 * iList.forEach((num)->System.out.println("--------"+num));
		 * 
		 * System.out.println("using method references");
		 * iList.forEach(System.out::println);
		 */
		
		//Lambda expression used to implement functional interfaces
		
		/*
		 * MyInterface obj = (String msg)->System.out.println("Helllo "+msg); //Lambda
		 * expression to implement MyInterface function interface ,this will implement
		 * sayHello function by default
		 * 
		 * obj.sayHello("Nikhil"); //this will call above lambda expression
		 * 
		 * System.out.println("Addition :: "+obj.addition(10, 20));
		 */
		
		
	}

}
