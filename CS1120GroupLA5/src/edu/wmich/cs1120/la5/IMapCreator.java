package edu.wmich.cs1120.la5;

import java.io.*;

public interface IMapCreator {

	/**
	 * Read from the file, set up the IArea[10][10] and set the terrain for the
	 * object of TerrainScanner
	 * 
	 * @param fileName
	 *            the String of the name of a file to be accessed.
	 * @param threshold
	 *            the threshold value provided by the user in the GUI.
	 * @throws IOException
	 *             in case if there is an IO type exception involving the access
	 *             to the file.
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;

	/**
	 * This method accesses the reference to a TerrainScanner object.
	 * 
	 * @return the reference to the TerrainScanner object.
	 */
	TerrainScanner getScanner();

	/**
	 * This method sets the location of a TerrainScanner object by passing the
	 * address fed into the parameter from its associated argument from the
	 * method call.
	 * 
	 * @param scanner
	 *            a reference variable to a TerrainScanner object.
	 */
	void setScanner(TerrainScanner scanner);
}
