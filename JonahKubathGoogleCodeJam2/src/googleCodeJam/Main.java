/**
 * Google Code Jam Bathroom Stalls
 * Name: Jonah Kubath
 * Github: jkubath1@gmail.com
 */
package googleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static int numbers[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCase = 0;
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		testCase = Integer.parseInt(scan.nextLine());

		numbers = new int[testCase][2];
		int results[][] = new int[testCase][2];

		// Read data
		for (int i = 0; i < testCase; i++) {
			numbers[i][0] = scan.nextInt();
			numbers[i][1] = scan.nextInt();
			scan.hasNextLine();
		}

		for (int i = 0; i < testCase; i++) {
			int temp[] = new int[numbers[i][0] + 2];
			// initialize array
			for (int j = 0; j < temp.length; j++) {
				temp[j] = 0;
			}
			// Place guards at both ends of the array
			temp[0] = 1;
			temp[temp.length - 1] = 1;
			int people = numbers[i][1];
			placePeople(people, temp, (temp.length), 1);
			// Find min and max empty spots
			int max = temp.length - 2;
			int min = 0;
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + " ");
				max = temp.length - 2;
				min = 0;
				int tempSpace = 0;
				if (temp[j] == 1) {
					if (tempSpace > max) {
						max = tempSpace;
					}
					if (tempSpace < min) {
						min = tempSpace;
					}
					// Reset counter
					tempSpace = 0;

				} else
					tempSpace++;
			}
			results[i][0] = min;
			results[i][1] = max;
		}

		scan.close();
	}

	public static void placePeople(int people, int[] temp, int length, int divisor) {
		System.out.println("People : " + people);
		if (people == 0) {
			return;
		}
		int change = (int) Math.round((length / Math.pow(2, divisor)));
		System.out.println("change : " + change);
		boolean placed = false;
		int count = 1;
		while (!placed && count * change < length - 1) {
			if (temp[(change * count) - 1] != 1) {
				System.out.println("Placed at " + (change * count - 1));
				temp[change * count - 1] = 1;
				placed = true;
			}
			count += 2;
		}

		placePeople(people - 1, temp, length / 2, divisor++);
	}

}