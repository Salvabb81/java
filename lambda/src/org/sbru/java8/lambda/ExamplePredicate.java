package org.sbru.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.sbru.java8.lambda.models.User;

public class ExamplePredicate {

	public static void main(String[] args) {

		Predicate<Integer> test = num -> num > 10;
		boolean r = test.test(11);
		System.out.println("r = " + r);

		Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
		System.out.println(test2.test("ROLE_USER"));

		BiPredicate<String, String> test3 = String::equals;// (a, b) -> a.equals(b);
		System.out.println(test3.test("salvador", "john"));

		BiPredicate<Integer, Integer> test4 = (i, j) -> j > i;
		boolean r2 = test4.test(5, 10);
		System.err.println(r2);

		User a = new User();
		User b = new User();
		a.setName("Maria");
		b.setName("Lucy");
		BiPredicate<User, User> test5 = (ua, ub) -> ua.getName().equals(ub.getName());
		System.out.println(test5.test(a, b));
	}

}
