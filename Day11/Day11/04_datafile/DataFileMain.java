package com.sunbeaminfo.dbda;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DataFileMain {
	public static final String DB_FILE = "emp.db";
	private static Scanner sc = new Scanner(System.in);
	public static void addRecord() {
		Emp e = new Emp();
		System.out.print("Enter empno : ");
		e.setEmpno( sc.nextInt() );
		System.out.print("Enter name : ");
		e.setName( sc.next() );
		System.out.print("Enter sal : ");
		e.setSal( sc.nextDouble() );
		System.out.print("Enter city : ");
		e.setCity( sc.next() );

		try(FileOutputStream fout = new FileOutputStream(DB_FILE, true)) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				dout.writeInt(e.getEmpno());
				dout.writeUTF(e.getName());
				dout.writeDouble(e.getSal());
				dout.writeUTF(e.getCity());
				dout.flush();
			} // dout.close()
		} // fout.close()
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void displayAllRecords() {
		try(FileInputStream fin = new FileInputStream(DB_FILE)) {
			try(DataInputStream din = new DataInputStream(fin)) {
				Emp e = new Emp();
				while(true) {
					e.setEmpno( din.readInt() );
					e.setName( din.readUTF() );
					e.setSal( din.readDouble() );
					e.setCity( din.readUTF() );
					System.out.println(e);
				}
			}
		}
		catch (EOFException e) {
			// do nothing
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//		addRecord();
		//		addRecord();
		//		addRecord();

		displayAllRecords();
	}
}





