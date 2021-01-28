package org.sbru.api.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
//		Map<String, Object> person = new TreeMap<>((a, b) -> b.compareTo(a));
//		Map<String, Object> person = new TreeMap<>(Comparator.reverseOrder());
		Map<String, Object> person = new TreeMap<>(Comparator.comparing(String::length).reversed());


		person.put("firstname", "John");
		person.put("lastname", "Doe");
		person.put("lastname", "Roe");
		person.put("secondlastname", "Poe");
		person.put("email", "johndoe@email.com");
		person.put("age", "30");

		Map<String, String> address = new TreeMap<>();
		address.put("country", "Spain");
		address.put("province", "Valencia");
		address.put("city", "Valencia");
		address.put("street", "calle de la paz");
		address.put("number", "1");

		person.put("address", address);

		System.out.println("person = " + person);
	}

}
