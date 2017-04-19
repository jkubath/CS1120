package edu.wmich.cs1120.la6;

import java.io.FileNotFoundException;

public class LA6Main {

	public static void main(String[] args) {

		IUserInterface uI = new UserInterface();
		try {
			uI.runProgram();
		} catch (FileNotFoundException e) {
			System.out.println("FIle not found!");
		}
	}

}
