package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	// This class is responsible for providing the “average elevation”
	// of the path.

	private ArrayList<IArea> path; // holds place for an area array list to be
									// referenced

	private String analysis; // holds place for a string representing the path
								// analysis.

	/**
	 * This method analyzes a path by taking the elevation of each area,
	 * totaling them and dividing the total by the path length to obtain the
	 * average elevation encountered in the path. The method also stores the
	 * analysis with the analysis setter.
	 */
	@Override
	public void analyzePath() {

		double totElevation = 0; // accumulator for the total of area
									// elevations, initialized to 0.
		String elevAnalysis = ""; // initializes the local analysis variable
									// with empty
									// space.

		// for loop obtains a sum of the elevations encountered in the path.
		for (int index = 0; index < path.size(); index++) {
			totElevation += path.get(index).getElevation();
		}

		// gets the avg. elevation in the path, converts it to a String and puts
		// in a temporary storage.
		elevAnalysis += (totElevation / path.size());

		// sets the analysis with the average path elevation and analyzer name.
		this.setAnalysis(this.toString() + elevAnalysis.trim());

	}

	/**
	 * This method gets the String representative of the analysis of this
	 * analyzer.
	 * 
	 * @return the String of the analysis.
	 */
	@Override
	public String getAnalysis() {

		return analysis;
	}

	/**
	 * This method sets the String value of the analysis obtained by this
	 * analyzer.
	 * 
	 * @param analysis
	 *            the String representation of the average path elevation.
	 */
	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}

	/**
	 * This method retrieves the pointer to the stored path.
	 * 
	 * @return the location of the path object referenced.
	 */
	@Override
	public ArrayList<IArea> getPath() {

		return path;
	}

	/**
	 * This method sets the path field by passing the pointer passed into the
	 * parameter during the method call, into the path variable.
	 * 
	 * @param path
	 *            the variable holding the path pointer passed to it.
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;

	}

	/**
	 * This method returns the name of this analyzer.
	 * 
	 * @return the String object of the name of the analyzer.
	 */
	@Override
	public String toString() {

		return "Elevation Analyzer: ";

	}

}
