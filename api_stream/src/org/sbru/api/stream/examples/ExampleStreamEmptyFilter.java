package org.sbru.api.stream.examples;

import java.util.stream.Stream;

public class ExampleStreamEmptyFilter {

	public static void main(String[] args) {
		
		long count = Stream
				.of("Salvador Bru", "", "Aimee Yao", "", "John Gosling")
				.filter(String::isEmpty)
				.peek(System.out::println)
				.count();

		System.out.println("count: " + count);
		
	}
}
