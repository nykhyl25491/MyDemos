package com.sunbeaminfo.dbda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 
		33, 77, 99, 22, 44, 66, 55, 11, 88);
		
		/*
		list1.stream()
			.filter(x -> x % 2 == 0)
			.map(x -> x % 10)
			.sorted((x,y) -> y - x)
			.forEach(x -> System.out.println(x));
		*/
		
		/*
		Stream<Integer> s1 = list1.stream();
		Stream<Integer> s2 = s1.filter(x -> x % 2 == 0);
		Stream<Integer> s3 = s2.map(x -> x % 10);
		Stream<Integer> s4 = s3.sorted((x,y) -> y - x);
		s4.forEach(x -> System.out.println(x));
		System.out.println();
		
		//s4.forEach(x -> System.out.println(x)); // exception: stream cannot be reused.
		
		list1.forEach(x -> System.out.println(x)); // list contents are not modified.
		*/
		
		/*
		list1.stream()
			.filter(x -> {
				System.out.println("in filter() for " + x);
				return x % 2 == 0;
			})
			.map(x -> {
				System.out.println("in map() for " + x);
				return x % 10;
			})
			.sorted((x,y) -> {
				System.out.println("in sorted() for " + x + " & " + y);
				return y - x;
			})
			.map(x -> {
				System.out.println("in next map() for " + x);
				return x * x;
			})
			.forEach(x -> {
				System.out.println("in forEach() for " + x);
			});
		
		System.out.println("bye!");
		*/
		
		/*
		IntStream is = IntStream.rangeClosed(1, 6);
		
		// is.forEach(x -> System.out.println(x));
		
		int sum = is.reduce(0, (x,y) -> x + y);
		System.out.println("sum : " + sum);
		*/

		/*
		IntStream is = IntStream.rangeClosed(1, 6);
		int fact = is.reduce(1, (x,y) -> x * y);
		System.out.println("fact : " + fact);
		*/
		
		Stream<String> stream = Stream.of(
			"welcome to java8",
			"we are learning lambda expressions",
			"and stream opeartions",
			"hope you are alive"
		);
		
		stream
			.flatMap(line -> Stream.of(line.split(" ")))
			.forEach(word -> System.out.println(word));
	}
}






