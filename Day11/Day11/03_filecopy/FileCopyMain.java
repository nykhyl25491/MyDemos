package com.sunbeaminfo.dbda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a source file path : ");
		String srcPath = sc.nextLine();
		System.out.print("Enter a destination file path : ");
		String destPath = sc.nextLine();
		int b, cnt=0;

		try(FileInputStream fin = new FileInputStream(srcPath)) {
			try(FileOutputStream fout = new FileOutputStream(destPath)) {
				while( (b = fin.read()) != -1 ) {
					fout.write(b);
					cnt++;
				}
				fout.flush();
			} // close fout
		} // close fin
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of bytes copied : " + cnt);
		sc.close();
	}

}

