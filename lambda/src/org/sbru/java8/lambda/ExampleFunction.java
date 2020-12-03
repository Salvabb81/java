package org.sbru.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExampleFunction {

	public static void main(String[] args) {

		Function<String, String> f1 = param -> "Hello how are you? " + param;
		String result = f1.apply("Salvador");
		System.out.println(result);

//		Function<String, String> f2 = param -> param.toUpperCase();
		Function<String, String> f2 = String::toUpperCase;
		System.out.println(f2.apply("Salvador"));

		BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
		String r2 = f3.apply("Salvador", "Angel");
		System.out.println(r2);

//		BiFunction<String, String, Integer> f4 = (a, b) -> a.compareTo(b);
		BiFunction<String, String, Integer> f4 = String::compareTo;
		System.out.println(f4.apply("Salvador", "Salvador"));

//		BiFunction<String, String, String> f5 = (a, b) -> a.concat(b);
		BiFunction<String, String, String> f5 = String::concat;
		System.out.println(f5.apply("Salvador", "Angel"));
	}

}
