package org.sbru.api.stream.examples;

import java.util.Optional;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamSingleFilter {

	public static void main(String[] args) {
		
		Stream<User> names = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.filter(u -> u.getFirstName().equals("John"))
				.peek(System.out::println);
				
		Optional<User> user = names.findFirst();
		System.out.println(user.get());

	}
}
