/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

public interface IArea {
	double getBasicEnergyCost();

	void setBasicEnergyCost(double basicEnergyCost);

	double getElevation();

	void setElevation(double elevation);

	double getRadiation();

	void setRadiation(double radiation);

	double calcConsumedEnergy();
}
