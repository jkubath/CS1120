/**
 * Name: Post Fix Expression Decoder
 * Author: Jonah Kubath
 * Date: April 19, 2017
 */
package edu.wmich.cs1120.JonahKubath.LA7;

public class Stack<E> implements IStack<E> {
	private LinkedList<E> list = new LinkedList<E>();

	/**
	 * Adds the given value to the linked list
	 * 
	 * @param s
	 *            The node to be added
	 */
	@Override
	public void push(E s) {
		list.add(s);
	}

	/**
	 * Removes the top item from the linked list
	 * 
	 * @return E Data held in the last node
	 */
	@Override
	public E pop() {
		// Removes the last element in the stack
		E temp = list.remove();
		return temp;
	}

	/**
	 * Returns the data held in the last node without removing it
	 * 
	 * @return E data held in the last node
	 */
	@Override
	public E peek() {
		// Returns the value in the tail
		return list.getTail();
	}

	/**
	 * Returns the size of the list
	 * 
	 * @return int The size of the linked list
	 */
	@Override
	public int size() {
		// Return the size of the list
		return list.size();
	}

	/**
	 * Returns true if the list is empty
	 * 
	 * @return boolean True if the list is empty
	 */
	@Override
	public boolean isEmpty() {
		// Return true if the list is empty
		return list.isEmpty();
	}

}
