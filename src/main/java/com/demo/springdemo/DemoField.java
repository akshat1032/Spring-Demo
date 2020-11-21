package com.demo.springdemo;

public class DemoField {
	String name;
	int id;
	
	public DemoField() {}
	
	public DemoField(String name, int id) {
		this.name = name;
		this.id = id;
	}

// @return the name

	public String getName() {
		return name;
	}

// @return the id

	public int getId() {
		return id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
