package edu.wmich.cs1120.JonahKubath.HashMap;

public class Employee {
	String id = "";
	String name = "";

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getID() {
		return this.id;
	}

	public String getData() {
		String temp = id + " : " + name;
		return temp;
	}
}
