/*
 * Name: Exponent Recursion
 * Author: Jonah Kubath
 * Date: January 24, 2017
 * Reference: N/A 
 */
package edu.wmich.cs.JonahKubath.Power;

public class PowerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baseNumber = 3;
		int power = 3;
		System.out.println("Base Number: " + baseNumber);
		System.out.println("Power: " + power);
		System.out.println("Total: " + power(baseNumber, power));
	}

	/**
	 * Raises given base number to given power
	 * 
	 * @param baseNumber
	 *            Number to be raised
	 * @param power
	 *            Exponent
	 * @return total Final result of the problem
	 */
	public static int power(int baseNumber, int power) {
		if (power == 0) {
			return 1;
		}
		if (power == 1) {
			return baseNumber;
		}
		return baseNumber * power(baseNumber, power - 1);
	}

}
