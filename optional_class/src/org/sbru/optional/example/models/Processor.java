package org.sbru.optional.example.models;

public class Processor {

	private String name;
	private Producer producer;

	public Processor(String name, Producer producer) {
		this.name = name;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}
}
