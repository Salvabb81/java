package org.sbru.api.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Object> person = new HashMap<>();
		System.out.println("Has elements: " + !person.isEmpty());

		person.put(null, "1234");
		person.put(null, "12345");
		person.put("firstname", "John");
		person.put("lastname", "Doe");
		person.put("lastname", "Roe");
		person.put("secondlastname", "Poe");
		person.put("email", "johndoe@email.com");
		person.put("age", "30");

		Map<String, String> address = new HashMap<>();
		address.put("country", "Spain");
		address.put("province", "Valencia");
		address.put("city", "Valencia");
		address.put("street", "calle de la paz");
		address.put("number", "1");

		person.put("address", address);

		System.out.println("person = " + person);
		String name = (String) person.get("firstname");
		System.out.println("nombre = " + name);
		String lastname = (String) person.get("lastname");
		System.out.println("apellido = " + lastname);

		Map<String, String> personAddress = (Map<String, String>) person.get("address");
		String country = personAddress.get("country");
		String city = personAddress.get("city");
		String district = personAddress.getOrDefault("district", "Barrio del Carmen");

		System.out.println(name + "'s country is = " + country);
		System.out.println(name + "'s city is = " + city);
		System.out.println(name + "'s district is = " + district);

//		String slnValue = person.remove("secondlastname");
		boolean b = person.remove("secondlastname", "Poe");
		System.out.println("Deleted: " + b);
		System.out.println("persona = " + person);

		boolean b2 = person.containsKey("secondlastname");
		System.out.println("b2 = " + b2);

		b2 = person.containsValue("Roe");
		System.out.println("b2 = " + b2);

		System.out.println("=============================");
		Collection<Object> valores = person.values();
		for (Object v : valores) {
			System.out.println("v: " + v);
		}

		System.out.println("=============================");
		Set<String> keys = person.keySet();
		for (String k : keys) {
			System.out.println("k: " + k);
		}

		System.out.println("=============================");
		for (Map.Entry<String, Object> pair : person.entrySet()) {
			System.out.println(pair.getKey() + "=>" + pair.getValue());
		}

		System.out.println("=============================");
		for (String key : person.keySet()) {
			Object value = person.get(key);
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
