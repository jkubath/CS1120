/**
 * Name: In class exercise
 * Author: Jonah Kubath
 * Date: January 12, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Exercise;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ExerciseMain {

	public static void main(String[] args) {
				
				String userInput = getString();
				int[] wordArray;
				wordArray = Arrays.copyOf(convertStringToIntArray(userInput), userInput.length());
				
				System.out.println("Total :" + findSum(wordArray));
				System.out.println("Highest Number :" + findHighest(wordArray));
				System.out.println("Lowest Number :" + findLowest(wordArray));
				
				
	}
	
	public static String getString(){
		String input = JOptionPane.showInputDialog("Enter a string of numbers");
		return input;
	}
		
		
	public static int[] convertStringToIntArray(String str){
		char individualChar;
		String singleChar;
		int oneNumber = 0;
		int[] stringArray = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++){
			individualChar = str.charAt(i);
			singleChar ="" + individualChar;
			oneNumber = Integer.parseInt(singleChar);
			stringArray[i] = oneNumber;
		}
		
		return stringArray;

	}

	public static int findSum(int[] numbers) {
		int i = 0;
		int count = 0;
		while(i < numbers.length){
			count+=numbers[i];
			i++;
		}
		
		return count;
	}

	public static int findHighest(int[] numbers){
		int i = 0;
		int highest = Integer.MIN_VALUE;
		while(i < numbers.length){
			if(numbers[i] > highest)
				highest = numbers[i];
			i++;
		}
		
		return highest;
	}

	public static int findLowest(int[] numbers){
		int i = 0;
		int lowest = Integer.MAX_VALUE;
		while(i < numbers.length){
			if(numbers[i] < lowest)
				lowest = numbers[i];
			i++;
		}
		
		return lowest;
	}

}
