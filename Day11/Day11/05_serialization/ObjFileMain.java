package com.sunbeaminfo.dbda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjFileMain {
	public static final String DB_FILE = "emp.db";
	public static void saveRecords(List<Emp> list) {
		try(FileOutputStream fout = new FileOutputStream(DB_FILE)) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(list);
				oout.flush();
				System.out.println("Records saved : " + list.size());
			} // oout.close();
		} // fout.close();
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static List<Emp> loadRecords() {
		List<Emp> result = new ArrayList<>();
		try (FileInputStream fin = new FileInputStream(DB_FILE)) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				result = (ArrayList<Emp>)oin.readObject();
				System.out.println("Records loaded : " + result.size());
			} // oin.close();
		} // fin.close(); 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		/*
		List<Emp> list1 = new ArrayList<Emp>();
		list1.add(new Emp(1, "A", 1000.00, "Pune"));
		list1.add(new Emp(2, "B", 1200.00, "Mumbai"));
		list1.add(new Emp(3, "C", 1300.00, "Pune"));
		saveRecords(list1);
		*/
		
		List<Emp> list2 = loadRecords();
		list2.forEach(e -> System.out.println(e));
	}
}
