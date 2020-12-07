package org.sbru.api.stream.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamMap {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Salvador", "John", "Aimee", "Maria")
				.map(String::toUpperCase)
				.peek(System.out::println)
				.map(String::toLowerCase);
		List<String> list = names.collect(Collectors.toList());
		list.forEach(System.out::println);
//		names.forEach(System.out::println);
		
		Stream<User> names2 = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.peek(System.out::println)
				.map(user -> {
					 String firstName = user.getFirstName().toUpperCase();
					user.setFirstName(firstName);
					return user; 
				});
		List<User> list2 = names2.collect(Collectors.toList());
		list2.forEach(System.out::println);

	}
}
