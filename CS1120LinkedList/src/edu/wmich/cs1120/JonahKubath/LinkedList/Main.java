package edu.wmich.cs1120.JonahKubath.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList("Jane");

		list.add("Jen");
		list.add("John");

		list.printData();

		list.add(1, "Janet");

		list.printData();

		list.remove(3);

		list.printData();

	}

}
