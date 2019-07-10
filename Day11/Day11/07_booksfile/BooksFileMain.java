package com.sunbeaminfo.dbda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFileMain {
	public static Book parseBook(String line) {
		try {
			Book b = new Book();
			String[] parts = line.split(",");
			b.setId(Integer.parseInt(parts[0]));
			b.setName(parts[1]);
			b.setAuthor(parts[2]);
			b.setSubject(parts[3]);
			b.setPrice(Double.parseDouble(parts[4]));
			return b;
		} catch (Exception e) {
			// ignore record
		}
		return null;
	}
	public static void main(String[] args) {
		File booksFile = new File("books.csv");
		List<Book> list = new ArrayList<Book>();
		try (Scanner sc = new Scanner(booksFile)) {
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				Book b = parseBook(line);
				if(b != null)
					list.add(b);
			//	System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//Q. display all books in desc order of price
		/*
		list.stream()
			.sorted((b1,b2) -> (int)Math.signum(b2.getPrice() - b1.getPrice()))
			.forEach(b -> System.out.println(b));
		*/
		
		/*
		//Q. display all books in desc order of subejct and asc order of name.
		list.stream()
			.sorted((b1,b2) -> {
				int diff = b2.getSubject().compareTo(b1.getSubject());
				if(diff == 0)
					diff = b1.getName().compareTo(b2.getName());
				return diff;
			})
			.forEach(b -> System.out.println(b));
		*/

		/*
		//Q. count number books per subject
		Map<String, List<Book>> map = list.stream()
			.collect(Collectors.groupingBy((Book b) -> b.getSubject()));
		
		map.entrySet().stream()
			.map(en -> en.getKey() + "," + en.getValue().size())
			.forEach(res -> System.out.println(res));
		*/

		//Q. subjectwise total price
		list.stream()
			.collect(Collectors.groupingBy((Book b) -> b.getSubject()))
			.entrySet()
			.stream()
			.map(en -> en.getKey() + "," + en.getValue().stream().map(b->b.getPrice()).reduce(0.0, (x,y)->x+y))
			.forEach(res -> System.out.println(res));
	}
}
