package org.sbru.api.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamListToStream {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		list.add(new User("Salvador", "Bru"));
		list.add(new User("Aimee", "Yao"));
		list.add(new User("John", "Doe"));
		list.add(new User("Maria", "Smith"));
		list.add(new User("Peter", "Gosling"));
		list.add(new User("Bruce", "Lee"));
		list.add(new User("Bruce", "Willis"));

		Stream<String> names = list.stream()
				.map(u -> u.getFirstName().toUpperCase().concat(" ").concat(u.getLastName().toUpperCase()))
				.flatMap(name -> {
					if (name.contains("bruce".toUpperCase())) {
						return Stream.of(name);
					}
					return Stream.empty();
				}).map(String::toLowerCase).peek(System.out::println);
		System.out.println(names.count());

	}

}
