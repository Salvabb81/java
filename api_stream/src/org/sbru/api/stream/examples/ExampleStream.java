package org.sbru.api.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {

	public static void main(String[] args) {

//		Stream<String> names = Stream.of("Salvador", "John", "Aimee", "Maria");
//		names.forEach(System.out::println);
		
//		String[] arr = {"Salvador", "John", "Aimee", "Maria"};
//		Stream<String> names = Arrays.stream(arr);
//		names.forEach(System.out::println);
		
//		Stream<String> names = Stream.<String>builder().add("Salvador").add("John").add("Aimee").add("Maria").build();
//		names.forEach(System.out::println);
		
		List<String> list = new ArrayList<>();
		list.add("Salvador");
		list.add("John");
		list.add("Aimee");
		list.add("Maria");
//		Stream<String> names = list.stream();
//		names.forEach(System.out::println);
		
		list.stream().forEach(System.out::println);
	}
}
