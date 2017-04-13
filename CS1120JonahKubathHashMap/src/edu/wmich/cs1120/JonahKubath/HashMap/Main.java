package edu.wmich.cs1120.JonahKubath.HashMap;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		EmployeeMap data = new EmployeeMap();
		// Map<String, Employee> database = new EmployeeMap();

		Employee fred = new Employee("1234", "fred");
		Employee john = new Employee("1111", "John");
		Employee smith = new Employee("2222", "smith");

		data.database.put(fred.getID(), fred);
		data.database.put(john.getID(), john);
		data.database.put(smith.getID(), smith);

		Iterator<Map.Entry<String, Employee>> it = data.database.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Employee> temp = (Map.Entry<String, Employee>) it.next();
			System.out.println(temp.getValue().getData());
		}
	}

}
