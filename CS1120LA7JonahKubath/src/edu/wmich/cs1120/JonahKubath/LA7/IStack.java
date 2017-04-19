package edu.wmich.cs1120.JonahKubath.LA7;

public interface IStack<E> {
	// Implemented by class Stack
	/**
	 * adds the parameter s to the top of the stack.
	 * 
	 * @param s
	 *            the string to be added
	 */
	void push(E s);

	/**
	 * Removes the top element from the stack
	 */
	E pop();

	/**
	 * Returns the top element without removing it.
	 * 
	 * @return the top element in the stack
	 */
	E peek();

	/**
	 *
	 * @return the number of elements in the stack
	 */
	int size();

	/**
	 *
	 * @return true if the stack contains no elements, false otherwise.
	 */
	boolean isEmpty();
}
