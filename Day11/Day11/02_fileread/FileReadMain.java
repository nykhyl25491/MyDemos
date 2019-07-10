package com.sunbeaminfo.dbda;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileReadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file path : ");
		String path = sc.nextLine();
		int b;

		try(FileInputStream fin = new FileInputStream(path)) {
			while( (b = fin.read()) != -1 )
				System.out.print((char)b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
