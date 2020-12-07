package org.sbru.api.stream.examples;

import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamSingleFilter {

	public static void main(String[] args) {

		User user = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
//				.filter(u -> u.getFirstName().equals("John"))
				.filter(u -> u.getId().equals(3))
				.findFirst().get();
				
		System.out.println(user);

	}
}
