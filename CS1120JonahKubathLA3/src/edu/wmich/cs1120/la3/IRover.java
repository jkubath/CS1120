/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

//import java.awt.geom.Area;
import java.util.ArrayList;

public interface IRover {
	public MapCreator getMapCreator();

	public void setMapCreator(MapCreator mc);

	public ArrayList<Area> getPath();

	public void setPath(int startRow, int startCol);

	public double calculateEnergy();
}
