package org.sbru.api.stream.examples;

import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamFlatMap {

	public static void main(String[] args) {

		Stream<User> names = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.flatMap(u -> {
					if(u.getFirstName().equalsIgnoreCase("John")) {
						return Stream.of(u);
					}
					return Stream.empty();
				})
				.peek(System.out::println);
				
		names.forEach(System.out::println);

	}
}
