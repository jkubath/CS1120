/**
 * Name: Tower of Hanoi Recursion
 * Author: Jonah Kubath
 * Date: January 24, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.HanoiTower;

public class HanoiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(3, 1, 2, 3);

	}

	/**
	 * Moves all the discs to the third peg with the lowest disc always on top
	 * Only one disc can be moved at once.
	 * 
	 * @param disc
	 *            Amount of discs
	 * @param peg1
	 *            First Peg
	 * @param peg2
	 *            Second Peg
	 * @param peg3
	 *            Third Peg
	 */
	public static void hanoi(int disc, int peg1, int peg2, int peg3) {
		if (disc == 1) {
			System.out.println("Move " + peg1 + " to " + peg3);

		} else {
			hanoi(disc - 1, peg1, peg3, peg2);
			System.out.println("Move " + peg1 + " to " + peg3);

			hanoi(disc - 1, peg2, peg1, peg3);
		}

	}

}
