/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

public class LowArea extends Area {
	private double energy_cost;

	/**
	 * Takes in the cost from the file and multiplies it by 2
	 * 
	 * @param cost
	 *            Taken from the file
	 */
	public void setBasicEnergyCost(double cost) {
		energy_cost = cost * 2;
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
