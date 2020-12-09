package org.sbru.api.stream.examples;

import java.util.Optional;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamSingleFilterOptionalAPI {

	public static void main(String[] args) {
		
		Stream<User> names = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.filter(u -> u.getFirstName().equals("John"))
				.peek(System.out::println);
				
		Optional<User> user = names.findFirst();
		
		// DIFFERENT POSSIBLITIES TO HANDLE AN OPTIONAL OBJECT
		
//		System.out.println(user.orElse(new User("Harrison", "Ford")).getFirstName());
		// same result but using lambda expression
//		System.out.println(user.orElseGet(() -> new User("Harrison", "Ford")).getFirstName());
//		System.out.println(user.orElseThrow());
		if(user.isPresent()) {
			System.out.println(user.get().getFirstName());
		} else {
			System.out.println("Object not found");
		}


	}
}
