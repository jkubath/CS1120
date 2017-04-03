package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public interface IRover {

	/**
	 * This method returns the reference of a path held by the analyzer.
	 * 
	 * @return the address of the referenced path.
	 */
	ArrayList<IArea> getPath();

	/**
	 * Set the path reference to be the given parameter's reference.
	 * 
	 * @param path
	 *            a reference to a generated path object.
	 */
	void setPath(ArrayList<IArea> path);

	/**
	 * Analyze the path according to the type of the analyzer.
	 */
	void analyzePath();

	/**
	 * Get the result of the analysis according to the type of the analyzer
	 * 
	 * @return the String of the analysis.
	 */
	String getAnalysis();

	/**
	 * This method sets the analysis of the analyzer with the parameter's
	 * String.
	 * 
	 * @param analysis
	 *            String representation of the performed path analysis.
	 */
	void setAnalysis(String analysis);

	/**
	 * Return the name of the analyzer in String format accordingly.
	 * 
	 * @return the String of the name of an implementing analyzer.
	 */
	String toString();
}
