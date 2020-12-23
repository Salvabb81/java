package org.sbru.optional.example;

import org.sbru.optional.example.models.Computer;
import org.sbru.optional.example.models.Processor;
import org.sbru.optional.example.models.Producer;
import org.sbru.optional.example.repository.ComputerRepository;
import org.sbru.optional.example.repository.Repository;

public class RepositoryExampleMapFilter {

	public static void main(String[] args) {
		Repository<Computer> repository = new ComputerRepository();

		String pc = repository.filter("asus").map(Computer::getProcessor).map(Processor::getProducer)
				.filter(prod -> "intel".equalsIgnoreCase(prod.getName()))
				.map(Producer::getName).orElse("Unknown");

		System.out.println(pc);

	}

}
