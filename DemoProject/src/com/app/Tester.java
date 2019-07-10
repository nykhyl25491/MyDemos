package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tester 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		/*
		 * List<Integer> numList = new ArrayList<>(); numList.add(50); numList.add(10);
		 * numList.add(20); numList.add(null); numList.add(40);
		 * 
		 * System.out.println(numList);
		 * 
		 * numList.sort(null); // Collections.sort(numList);
		 * 
		 * System.out.println(numList);
		 * 
		 * 
		 * Collection<Integer> c1 = new ArrayList<Integer>(); c1.add(10); c1.add(20);
		 * c1.add(30); c1.add(40); c1.add(50); System.out.println(c1);
		 * 
		 * Set<Integer> c2 = new HashSet<Integer>(); c2.add(10); c2.add(20); c2.add(30);
		 * c2.add(40); c2.add(50); System.out.println(c2);
		 * System.out.println(c1.equals(c2));
		 * 
		 * Map<Integer, Integer> mapVal = new HashMap<Integer, Integer>();
		 * mapVal.put(1,10); mapVal.put(2,20); mapVal.put(3,30); mapVal.put(4,40);
		 * mapVal.put(5,50); System.out.println(c1.equals(mapVal));
		 */
		
		Customer1 c1 = new Customer1(101, "Nikhil", "Ngp");
		Customer1 c2 = (Customer1) c1.clone();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(" Orignal Hash Code C1 :: "+System.identityHashCode(c1));
		System.out.println(" Orignal Hash Code C2 :: "+System.identityHashCode(c2));
		
	}

}
