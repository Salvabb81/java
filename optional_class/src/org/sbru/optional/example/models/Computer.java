package org.sbru.optional.example.models;

public class Computer {
	private String name;
	private String model;

	public Computer(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return name + ", " + model;
	}

}
