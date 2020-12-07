package org.sbru.api.stream.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamFilter {

	public static void main(String[] args) {

		Stream<User> names = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.filter(u -> u.getFirstName().equals("John"))
				.peek(System.out::println);
				
		List<User> list2 = names.collect(Collectors.toList());
		list2.forEach(System.out::println);

	}
}
