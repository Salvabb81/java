package org.sbru.optional.example.repository;

import java.util.Optional;

import org.sbru.optional.example.models.Computer;

public interface Repository<T> {
	Optional<Computer> filter(String name);

}
