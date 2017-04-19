/**
 * Name: Post Fix Expression Decoder
 * Author: Jonah Kubath
 * Date: April 19, 2017
 */
package edu.wmich.cs1120.JonahKubath.LA7;

public class LinkedList<E> implements ILinkedList<E> {
	private Node head = null;
	private Node tail = null;
	private Node ref;

	/**
	 * Default Constructor
	 */
	public LinkedList() {

	}

	/**
	 * Constructor that create a new node
	 * 
	 * @param val
	 *            Data to be entered into the new Node
	 */
	public LinkedList(E val) {
		Node first = new Node(val);
		head = first;
		tail = first;

	}

	/**
	 * Individual node used in the linked list
	 * 
	 * @author Jonah Kubath
	 *
	 */
	private class Node implements INode<E> {
		private E value;
		private INode<E> next;

		// One Parameter
		Node(E val) {
			this.value = val;
			next = null;
		}

		@Override
		public E getData() {
			return value;
		}

		@Override
		public void setData(E data) {
			value = data;
		}

		@Override
		public INode<E> getNext() {
			return next;
		}

		@Override
		public void setNext(INode<E> next) {
			this.next = next;
		}

	}

	/**
	 * Creates and adds a new node to the linked list
	 * 
	 * @param E
	 *            The data to hold inside the Node
	 */
	@Override
	public void add(E e) {
		Node newNode = new Node(e);
		// Make the previous end point to the new end
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else
			tail.next = newNode;
		// Make the tail the new end point
		tail = newNode;
	}

	/**
	 * Removes the links between the nodes and ends with a blank list
	 */
	@Override
	public void clear() {
		head = null;
	}

	/**
	 * Returns the data held in the last node
	 */
	@Override
	public E getTail() {
		// TODO Auto-generated method stub
		return tail.getData();
	}

	/**
	 * Returns data at the given index
	 * 
	 * @return Data The data held in the last node
	 * @param index
	 *            The node that is needed to return data
	 */
	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		ref = head;
		int count = 0;
		while (count < index) {
			ref = (LinkedList<E>.Node) ref.next;
			count++;
		}

		return ref.getData();
	}

	/**
	 * Returns if the list is empty or not
	 * 
	 * @return boolean True if the list is empty
	 */
	@Override
	public boolean isEmpty() {
		if (head.next == null) {
			return true;
		} else
			return false;
	}

	/**
	 * Removes the node at the given index
	 * 
	 * @return Data Returns the data held in the last node
	 * @param index
	 *            The index to remove the node
	 */
	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		ref = head;
		// If 0 is entered then the head will point to Node 1
		int count = -1;
		while (count < index - 1) {
			ref = (LinkedList<E>.Node) ref.next;
			count++;
		}
		// The value to be removed
		E temp = ref.next.getData();
		// ref is just before the removed object
		ref.next = ref.next.getNext();

		return temp;
	}

	/**
	 * Returns the size of the linked list
	 * 
	 * @return int The size of the linked list
	 */
	@Override
	public int size() {
		ref = head;
		int count = 0;
		while (ref.next != null) {
			count++;
		}
		// Count that last node
		count++;

		return count;
	}

	/**
	 * Removes the last element
	 * 
	 * @return Data The data held in the last node
	 */
	public E remove() {
		ref = head;
		E temp = (E) tail.value;
		// If I only have one node and am removing it set head and tail to null
		if (ref == tail) {
			head = null;
			tail = null;
		} else {
			while (ref.next != tail) {
				ref = (LinkedList<E>.Node) ref.getNext();
			}
			// ref is now the node before the tail
			// Set the new tail to point to null
			ref.next = null;
			// Set the ref to the tail
			tail = ref;
		}
		// Return the value from the old tail
		return temp;
	}
}
