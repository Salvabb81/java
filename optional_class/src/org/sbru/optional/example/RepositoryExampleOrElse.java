package org.sbru.optional.example;

import org.sbru.optional.example.models.Computer;
import org.sbru.optional.example.repository.ComputerRepository;
import org.sbru.optional.example.repository.Repository;

public class RepositoryExampleOrElse {

	public static void main(String[] args) {
		Repository<Computer> repository = new ComputerRepository();

//		Computer defaultPC = new Computer("HP Omen", "LA001");

		Computer pc = repository.filter("rog").orElse(defaultValue());

		System.out.println(pc);

		pc = repository.filter("macbook").orElseGet(RepositoryExampleOrElse::defaultValue);
		System.out.println(pc);

	}
	
	public static Computer defaultValue() {
		System.out.println("Getting default value...");
		return new Computer("HP Omen", "LA001");
	}

}
