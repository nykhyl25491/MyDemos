package com.app;

import java.util.Arrays;

public class TestMethodReferenceArbitraryObj {
	
	public static void main(String[] args) {
		
		String [] array = {"Nikhil","Prachi","Atul","atul","Gurav"};
		
		Arrays.sort(array,String::compareToIgnoreCase);
		
		for (String str : array) {
			System.out.println(str);
		}
	}

}
