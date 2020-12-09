package org.sbru.api.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamParallel {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		list.add(new User("Salvador", "Bru"));
		list.add(new User("Aimee", "Yao"));
		list.add(new User("John", "Doe"));
		list.add(new User("Maria", "Smith"));
		list.add(new User("Peter", "Gosling"));
		list.add(new User("Bruce", "Lee"));
		list.add(new User("Bruce", "Willis"));

		Long t1 = System.currentTimeMillis();
		String result = list.stream()
				.parallel()
				.map(u -> u.toString().toUpperCase())
				.peek(n -> {
					System.out.println("Thread name: " + Thread.currentThread().getName() + " - " + n);
				})
				.flatMap(name -> {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (name.contains("bruce".toUpperCase())) {
						return Stream.of(name);
					}
					return Stream.empty();
				}).findAny().orElse("");
		long t2 = System.currentTimeMillis();
		System.out.println("Total time: " + (t2 - t1));
		System.out.println(result);

	}

}
