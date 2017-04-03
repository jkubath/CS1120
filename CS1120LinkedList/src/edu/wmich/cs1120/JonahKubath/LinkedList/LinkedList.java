package edu.wmich.cs1120.JonahKubath.LinkedList;

public class LinkedList {
	Node head;
	Node tail;
	Node ref;

	private class Node {
		String value;
		Node next;

		// Two parameter
		Node(String val, Node n) {
			this.value = val;
			next = n;
		}

		// One Parameter
		Node(String val) {
			this.value = val;
			next = null;
		}

	}

	public LinkedList(String val) {
		Node first = new Node(val);
		head = first;
		tail = first;

	}

	public void add(String val) {
		Node newNode = new Node(val);
		// Make the previous end point to the new end
		tail.next = newNode;
		// Make the tail the new end point
		tail = newNode;

	}

	public void add(int index, String val) {

		ref = head;
		int count = 0;
		while (count < index - 1) {
			ref = ref.next;
			count++;
		}
		// Point is now at the object previous to the one you want to add
		// Point to the object after the created one
		Node newNode = new Node(val, ref.next);
		// newNode.next = ref.next;
		// Point the predecessor to the new object
		ref.next = newNode;

	}

	public void remove(int index) {
		ref = head;
		int count = 0;
		while (count < index - 1) {
			ref = ref.next;
			count++;
		}
		// ref is just before the removed object
		ref.next = ref.next.next;

	}

	public void printData() {
		ref = head;
		String data = "";
		while (ref.next != null) {
			data += ref.value + " ";
			ref = ref.next;
		}

		data += ref.value + " ";

		System.out.println(data);

	}
}
