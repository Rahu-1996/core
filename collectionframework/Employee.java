package com.rays.collectionframework;

public class Employee {

	private int id = 0;
	private String address = null;

	public Employee(int id, String address) {
		this.address = address;
		this.id = id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
}
