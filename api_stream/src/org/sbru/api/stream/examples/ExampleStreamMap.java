package org.sbru.api.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamMap {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Salvador", "John", "Aimee", "Maria")
				.map(String::toUpperCase)
				.peek(System.out::println)
				.map(String::toLowerCase);
		List<String> list = names.collect(Collectors.toList());
		list.forEach(System.out::println);
//		names.forEach(System.out::println);

	}
}
