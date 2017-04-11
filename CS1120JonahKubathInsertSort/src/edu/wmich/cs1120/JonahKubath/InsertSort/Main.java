package edu.wmich.cs1120.JonahKubath.InsertSort;

public class Main {

	public static void main(String[] args) {

		// Sorting strings
		String array[] = { "4", "1", "2", "3" };
		ObjectInsertionSorter<String> sort = new ObjectInsertionSorter<String>(array);

		// Sorting integers
		Integer array2[] = { 2, 4, 7, 1, 5, 9, 4, 2, 5, 3 };
		ObjectInsertionSorter<Integer> sort1 = new ObjectInsertionSorter<Integer>(array2);

		sort.sortArray();

		for (int i = 0; i < sort.array.length; i++) {
			System.out.print(sort.array[i] + " ");
		}
	}

}
