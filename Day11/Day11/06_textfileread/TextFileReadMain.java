package com.sunbeaminfo.dbda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class TextFileReadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text file path : ");
		String path = sc.nextLine();
		int c;
		
		/*
		try(FileReader fin = new FileReader(path)) {
			while( (c = fin.read()) != -1 )
				System.out.print((char)c);
		} // fin.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		String line;
		try(FileReader fin = new FileReader(path)) {
			try(BufferedReader bin = new BufferedReader(fin)) {
				while( (line = bin.readLine()) != null )
					System.out.println(line);
			} // bin.close();
		} // fin.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		File file = new File(path);
		try(Scanner fsc = new Scanner(file)) {
			while(fsc.hasNextLine()) {
				String line = fsc.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}





