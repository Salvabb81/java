package org.sbru.api.stream.examples;

import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamDistinctUser {

	public static void main(String[] args) {
		
		Stream<User> names = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling", "Salvador Bru", "Salvador Bru")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.distinct();
				
		names.forEach(System.out::println);

	}
}
