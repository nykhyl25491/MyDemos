package com.sunbeaminfo.dbda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// top-level class
class EmpNameAscComparator implements Comparator<Emp> {
	@Override
	public int compare(Emp e1, Emp e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		int diff = name1.compareTo(name2);
		return diff;
	}
}

public class SortMain {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		Collections.addAll(list, 
				new Emp(22, "G", 765.35, "Pune"),
				new Emp(55, "H", 823.45, "Mumbai"),
				new Emp(33, "A", 523.45, "Pune"),
				new Emp(11, "R", 923.67, "Mumbai"),
				new Emp(44, "T", 402.56, "Pune")
			);
		Collections.sort(list); // sort based on Comparable.
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
		
		// named object of named class (top-level)
		EmpNameAscComparator comparator = new EmpNameAscComparator();
		Collections.sort(list, comparator);
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
		
		// local-class
		class EmpSalDescComparator implements Comparator<Emp> {
			@Override
			public int compare(Emp e1, Emp e2) {
				double diff = e1.getSal() - e2.getSal();
				return (int)Math.signum(-diff);
			}
		}
		// anonymous object of named class
		Collections.sort(list, new EmpSalDescComparator());
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
		
		Comparator<Emp> empNameDescComparator = new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				int diff = e1.getName().compareTo(e2.getName());
				return -diff;
			}
		};
		// named object of anonymous class
		Collections.sort(list, empNameDescComparator);
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
		
		// anonymous object of anonymous class
		Collections.sort(list, new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				int diff = e1.getCity().compareTo(e2.getCity());
				return diff;
			}
		});
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
		
		// lambda expression
		Collections.sort(list, (Emp e1, Emp e2) -> {
			int diff = e1.getCity().compareTo(e2.getCity());
			return -diff;
		});
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
		
		// lambda expression (arg types are inferred)
		Collections.sort(list, (e1, e2) -> {
			double diff = e1.getSal() - e2.getSal();
			return (int)Math.signum(diff);
		});
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
				
		// lambda expression (single liner)
		Collections.sort(list, (e1, e2) -> e2.getEmpno() - e1.getEmpno());
		for (Emp e : list)
			System.out.println(e);
		System.out.println();
	}
}
