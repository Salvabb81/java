package org.sbru.api.stream.examples;

import java.util.stream.Stream;

public class ExampleStreamReduce {

	public static void main(String[] args) {

		Stream<String> names = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling", "John Doe", "John Doe")
				.distinct();

		String result = names.reduce("Result concat", (a, b) -> a + ", " + b);
		System.out.println(result);

	}
}
