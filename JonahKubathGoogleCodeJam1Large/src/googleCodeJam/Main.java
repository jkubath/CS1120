/**
 * Google Code Jam Tidy Numbers
 * Name: Jonah Kubath
 * Github: jkubath1@gmail.com
 */
package googleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCase = 0;
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		testCase = Integer.parseInt(scan.nextLine());

		String numbers[] = new String[testCase];

		// Read data
		for (int i = 0; i < testCase; i++) {
			numbers[i] = scan.nextLine();
		}
		int single[];
		// run through data
		for (int i = 0; i < testCase; i++) {
			single = new int[numbers[i].length()];
			// fill temp array
			for (int j = 0; j < numbers[i].length(); j++) {
				single[j] = Integer.parseInt(numbers[i].charAt(j) + "");
			}

			for (int j = single.length - 1; j >= 1; j--) {
				if (single[j - 1] > single[j] || single[j] == 0) {
					for (int k = j; k < single.length; k++) {
						single[k] = 9;
					}
					single[j - 1] = single[j - 1] - 1;
				}
			}

			// If the first digits is larger than the second
			if (single.length > 1) {
				if (single[0] > single[1]) {
					single[0] = single[1];
				}
			}

			String temp = "";
			for (int j = 0; j < single.length; j++) {
				temp += single[j];
			}

			temp = temp.replaceAll("0", "");
			numbers[i] = temp;

		}

		for (int i = 0; i < testCase; i++) {
			System.out.println("Case #" + (i + 1) + ": " + numbers[i]);
		}

		scan.close();
	}

}
