package edu.wmich.cs1120.JonahKubath.Exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) throws SubException {
		// TODO Auto-generated method stub
		boolean cont = true;
		System.out.println("Enter 1 through 3 to output that number");
		Scanner scan = new Scanner(System.in);
		int number;
		while (cont) {
			try {
				String input = scan.nextLine();
				number = Integer.parseInt(input);
				// Throws my exception
				if (number < 1 || number > 3) {
					throw new SubException(number);
				}
				// Choose option
				switch (number) {
				case (1):
					System.out.println("The first choice");
					break;
				case (2):
					System.out.println("The second choice");
					break;
				case (3):
					System.out.println("The second choice");
					break;
				default:
					break;
				}
				// Stop looping
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Number is invalid. Enter an integer. 1 - 3");
			} catch (SubException ex) {
				System.out.println("Number is out of bounds. Enter 1 - 3");
			}
		}
		scan.close();
	}

}
