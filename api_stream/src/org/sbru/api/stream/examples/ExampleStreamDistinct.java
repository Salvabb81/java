package org.sbru.api.stream.examples;

import java.util.stream.Stream;

public class ExampleStreamDistinct {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling", "John Doe", "John Doe")
				.distinct();
		
				names.forEach(System.out::println);

	}
}
