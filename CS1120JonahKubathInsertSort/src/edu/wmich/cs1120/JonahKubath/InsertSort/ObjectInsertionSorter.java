package edu.wmich.cs1120.JonahKubath.InsertSort;

public class ObjectInsertionSorter<T extends Comparable<T>> {
	boolean sorted = false;
	T array[];

	public ObjectInsertionSorter(T[] array) {
		this.array = array;
	}

	public void sortArray() {
		for (int i = 1; i < array.length; i++) {
			// Save the current object
			T temp = array[i];
			int j;
			// Haven't fallen off the array and j < i
			for (j = i; j > 0 && temp.compareTo(array[j - 1]) < 0; j--) {
				array[j] = array[j - 1];
			}
			// Save j to new position
			array[j] = temp;
		}
	}
}
