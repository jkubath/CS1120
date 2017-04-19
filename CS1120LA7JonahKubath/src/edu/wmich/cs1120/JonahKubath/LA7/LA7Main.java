/**
 * Name: Post Fix Expression Decoder
 * Author: Jonah Kubath
 * Date: April 19, 2017
 */
package edu.wmich.cs1120.JonahKubath.LA7;

import java.io.IOException;

public class LA7Main {

	public static void main(String[] args) throws IOException {
		IDecoder decoder = new Decoder();
		decoder.processExpressions("Expression1.dat");
		decoder.printResults();
	}

}
