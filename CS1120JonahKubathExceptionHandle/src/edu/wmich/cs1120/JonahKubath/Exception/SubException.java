package edu.wmich.cs1120.JonahKubath.Exception;

public class SubException extends Exception {
	public SubException(int number) {
	}

	public SubException(String message) {
		super.getMessage();
	}

}
