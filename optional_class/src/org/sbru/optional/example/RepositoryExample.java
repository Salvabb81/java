package org.sbru.optional.example;

import org.sbru.optional.example.models.Computer;
import org.sbru.optional.example.repository.ComputerRepository;
import org.sbru.optional.example.repository.Repository;

public class RepositoryExample {

	public static void main(String[] args) {
		Repository<Computer> repository = new ComputerRepository();

		repository.filter("rog").ifPresentOrElse(System.out::println, 
				() -> System.out.println("Not found"));

//		Optional<Computer> pc = repository.filter("asus rog");

//		if (pc.isPresent()) {
//			System.out.println(pc.get());
//		} else {
//			System.out.println("Not found.");
//		}

	}

}
