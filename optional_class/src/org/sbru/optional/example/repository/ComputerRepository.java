package org.sbru.optional.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.sbru.optional.example.models.Computer;

public class ComputerRepository implements Repository<Computer> {

	private List<Computer> dataSource;

	public ComputerRepository() {
		dataSource = new ArrayList<>();
		dataSource.add(new Computer("Asus ROG", "Strix G512"));
		dataSource.add(new Computer("MacBook Pro", "MVVK2CI"));
	}

	@Override
	public Optional<Computer> filter(String name) {
		
		return dataSource.stream().filter(c -> c.getName().toLowerCase().contains(name.toLowerCase())).findFirst();
//		for (Computer c : dataSource) {
//			if (c.getName().equalsIgnoreCase(name)) {
//				return Optional.of(c);
//			}
//		}
//		return Optional.empty();
	}

}
