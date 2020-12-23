package org.sbru.optional.example;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String name = "Salvador";
		Optional<String> opt = Optional.of(name);
		System.out.println("opt = " + opt);
		System.out.println(opt.isPresent());
		if (opt.isPresent()) {
			System.out.println("Hello " + opt.get());
		}

		System.out.println(opt.isEmpty());

		opt.ifPresent(value -> System.out.println("Hello " + value));

//		name = null;
		name = "John";
		opt = Optional.ofNullable(name);
		System.out.println("opt = " + opt);
		System.out.println(opt.isPresent());
		System.out.println(opt.isEmpty());

		opt.ifPresentOrElse(value -> System.out.println("Hello " + value), 
				() -> System.out.println("It is not present."));
		
		if (opt.isPresent()) {
			System.out.println("Hello " + opt.get());
		} else {
			System.out.println("It is not present.");
		}
		
		Optional<String> optEmpty = Optional.empty();
		System.out.println("optEmpty = " + optEmpty);
		System.out.println(optEmpty.isPresent());
	}

}
