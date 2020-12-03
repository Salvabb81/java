package org.sbru.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.sbru.java8.lambda.models.User;

public class ExampleConsumer {

	public static void main(String[] args) {

		Consumer<Date> consumer = date -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(f.format(date));
		};
		consumer.accept(new Date());

		BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " is " + age + " years old.");
		biConsumer.accept("John", 39);

		Consumer<String> consumer2 = System.out::println;
		consumer2.accept("Hello world lambda!");

		List<String> names = Arrays.asList("Salvador", "Aimee", "John", "Peter");
		names.forEach(consumer2);

		Supplier<User> createUser = User::new;
//		Supplier<User> createUser = () -> new User();
		User user = createUser.get();
//		User user = new User();
		BiConsumer<User, String> assignName = User::setName;
//		BiConsumer<User, String> assignName = (person, name) -> {
//			person.setName(name);
//		};
		assignName.accept(user, "Salvador");
		System.out.println("User's name: " + user.getName());

		Supplier<String> producer = () -> "Hello world lambda supplier!";
//		Supplier<String> producer = () -> {
//			return "Hello world lambda supplier!";
//		};
		System.out.println(producer.get());
	}

}
