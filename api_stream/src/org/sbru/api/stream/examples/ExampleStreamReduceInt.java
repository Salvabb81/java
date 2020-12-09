package org.sbru.api.stream.examples;

import java.util.stream.Stream;

public class ExampleStreamReduceInt {

	public static void main(String[] args) {

		Stream<Integer> names = Stream.of(5, 10, 15, 20, 25);
		
//				int result = names.reduce(0, (a, b) -> a + b);
		int result = names.reduce(0, Integer::sum);
				System.out.println(result);

	}
}
