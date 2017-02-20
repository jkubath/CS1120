/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

import java.io.IOException;

public interface IMapCreator {
	public void scanTerrain(String fileName, int threshold) throws IOException;

	public TerrainScanner getScanner();

	public void setScanner(TerrainScanner scanner);
}
