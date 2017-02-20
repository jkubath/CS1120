/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

public class HighArea extends Area {
	private double energy_cost;

	/**
	 * Takes in the cost from the file and multiplies it by 4
	 * 
	 * @param cost
	 *            Taken from the file
	 */
	public void setBasicEnergyCost(double cost) {
		energy_cost = cost * 4;
	}

	/**
	 * Returns the energy_cost
	 * 
	 * @return energy_cost
	 */
	public double getBasicEnergyCost() {
		return energy_cost;
	}

}
