package com.app;

public class StringDemo {

	public static void main(String[] args) 
	{ 
		String s1 = new String("You cannot changd me !"); //1st object is created on scp then heap 
		String s2 = new String("You cannot changd me !"); // it will check constant value if it is available in scp it will not create object in scp 
														  // but it will crate new object in heap
		
		System.out.print("Case1 :: ");
		System.out.println(s1 == s2);//false
	
		
		String s3 = "You cannot changd me !"; //1st it will check constant value present in scp or not if not it will create new object otherwise it will refer previously created object
		String s4 = "You cannot changd me !";
		
		System.out.print("Case2 :: ");
		System.out.println(s3 == s4); //true
		
		
		System.out.print("Case3 :: ");
		System.out.println(s1 == s4); //false
		
		
		String s5 = "You cannot" + " changd me !"; //in case of concatination it will always create new object on SCP area if both are literal strings
		
		System.out.print("Case4 :: ");
		System.out.println(s3 == s5); // true
		
		System.out.print("Case5 :: ");
		System.out.println(s4 == s5); // true
		
		String s6 = "You cannot"; // Create new object on scp
		String s7 = s6 + " changd me !"; //in case of concatination it will always create new object on heap area if one is string object and other is string literal
		
		System.out.print("Case6 :: ");
		System.out.println(s3 == s7); // false
		
		System.out.print("Case7 :: ");
		System.out.println(s5 == s7); // false
		
		final String s8 = "You cannot"; // if the string declared as final,in this case it will create object on SCP
		String s9 = s8 + " changd me !"; // //in case of concatination it will always create new object on SCP area if it is not present
		
		System.out.print("Case8 :: ");
		System.out.println(s4 == s9); // true
		
		System.out.print("Case9 :: ");
		System.out.println(s6 == s8); // true
		
		final String s10 = "You cannot"; //SCP
		final String s11 = " changd me !"; //SCP
		final String s12 = s10 + s11; // in the scenario,if we concat two final string object it will always create new object in SCP by looking to object present in SCP if object already present it will refer to same object if not then it will create new object
		
		System.out.print("Case10 :: ");
		System.out.println(s4 == s12); // true
		
		String s13 = "You cannot";
		final String s14  = " changd me !";
		String s15 = s13 + s14;
		
		String s16 = new String("You cannot") + s14;
		
		System.out.print("Case11 :: ");
		System.out.println(s3 == s15); // false
		
		System.out.print("Case12 :: ");
		System.out.println(s3 == s16); // false
		
		
		
	}
}
