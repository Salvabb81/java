package org.sbru.optional.example;

import java.util.Optional;

import org.sbru.optional.example.models.Computer;
import org.sbru.optional.example.repository.ComputerRepository;
import org.sbru.optional.example.repository.Repository;

public class RepositoryExampleOrElseThrow {

	public static void main(String[] args) {
		Repository<Computer> repository = new ComputerRepository();

		Computer pc = repository.filter("rog").orElseThrow(IllegalStateException::new);

		System.out.println(pc);

		String file = "document.pdf";

		String extension = Optional.ofNullable(file).filter(a -> a.contains("."))
				.map(f -> f.substring(file.lastIndexOf(".") + 1)).orElseThrow();
		
		System.out.println(extension);

	}

}
