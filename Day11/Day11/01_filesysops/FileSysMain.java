package com.sunbeaminfo.dbda;

import java.io.File;
import java.util.Scanner;

/*
 * Input a path from user. If path is not valid, give error & exit.
 * If path is of a directory, display its contents.
 * If path if of a file, display its size.
 */

public class FileSysMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path : ");
		String path = sc.nextLine();
		
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("Invalid path.");
			System.exit(1);
		}
		
		if(file.isDirectory()) {
			String[] files = file.list();
			for (String f : files) 
				System.out.println(f);
		}
		else if(file.isFile()) {
			long len = file.length();
			System.out.println("File size = " + len);
		} else
			System.out.println("Neither file nor directory.");
		
		sc.close();
	}
}






