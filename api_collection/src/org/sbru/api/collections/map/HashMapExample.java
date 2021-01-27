package org.sbru.api.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> person = new HashMap<>();
		person.put(null, "1234");
		person.put(null, "12345");
		person.put("firstname", "John");
		person.put("lastname", "Doe");
		person.put("lastname", "Roe");
		person.put("secondlastname", "Poe");
		person.put("email", "johndoe@email.com");
		person.put("age", "30");

		System.out.println("person = " + person);
		String name = person.get("firstname");
		System.out.println("nombre = " + name);
		String lastname = person.get("lastname");
		System.out.println("apellido = " + lastname);
	}

}
