package org.sbru.api.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> person = new HashMap<>();
		System.out.println("Has elements: " + !person.isEmpty());

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

//		String slnValue = person.remove("secondlastname");
		boolean b = person.remove("secondlastname", "Poe");
		System.out.println("Deleted: " + b);
		System.out.println("persona = " + person);

		boolean b2 = person.containsKey("secondlastname");
		System.out.println("b2 = " + b2);

		b2 = person.containsValue("Roe");
		System.out.println("b2 = " + b2);

		System.out.println("=============================");
		Collection<String> valores = person.values();
		for (String v : valores) {
			System.out.println("v: " + v);
		}

		System.out.println("=============================");
		Set<String> keys = person.keySet();
		for (String k : keys) {
			System.out.println("k: " + k);
		}

		System.out.println("=============================");
		for (Map.Entry<String, String> pair : person.entrySet()) {
			System.out.println(pair.getKey() + "=>" + pair.getValue());
		}

		System.out.println("=============================");
		for (String key : person.keySet()) {
			String value = person.get(key);
			System.out.println(key + "=>" + value);
		}

		System.out.println("=============================");
		person.forEach((key, value) -> {
			System.out.println(key + "=>" + value);
		});

		System.out.println("total: " + person.size());
		System.out.println("Has elements: " + !person.isEmpty());
//		person.replace("firstname", "Salvador");
		boolean b3 = person.replace("firstname", "John", "Salvador");
		System.out.println("b3 = " + b3);
		System.out.println("person = " + person);
	}

}
