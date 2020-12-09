package org.sbru.api.stream.examples;

import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamCountFilter {

	public static void main(String[] args) {

		boolean exists = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.peek(System.out::println)
				.anyMatch(u -> u.getId().equals(3));
				
		System.out.println(exists);

	}
}
