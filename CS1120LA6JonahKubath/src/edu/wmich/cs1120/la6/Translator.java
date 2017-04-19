package edu.wmich.cs1120.la6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Translator implements ITranslator {
	private String[][] data;
	private String fileName;
	private String[] sentence;
	private char endPunctuation = ' ';
	private boolean uppercaseFirst = false;
	private String translated = "";

	/**
	 * Default constructor
	 */
	public Translator() {

	}

	/**
	 * Translator constructor that is called
	 * 
	 * @param f
	 *            Filename to read data from Corpus file
	 * @param s
	 *            The sentence entered by the user
	 */
	public Translator(String f, String[] s) {
		// Set fileName and Sentence variables
		this.fileName = f;
		this.sentence = s;
	}

	/**
	 * Reads the Corpus file and saves the data in an array
	 */
	@Override
	public void readCorpus() throws FileNotFoundException {
		FileReader file = new FileReader(fileName);
		Scanner scan = new Scanner(file);
		// First line of the file
		int length = Integer.parseInt(scan.nextLine().trim());
		// Read file
		int count = 0;
		// Create data array
		data = new String[length][2];

		while (count < length) {

			data[count] = scan.nextLine().split(",");
			data[count][0] = data[count][0].trim();
			data[count][1] = data[count][1].trim();
			count++;
		}
		scan.close();
	}

	/**
	 * Translates the sentence using the saved Corpus data
	 * 
	 * @return translated The translated sentence
	 */
	@Override
	public String translate() {
		// Choose which translation to call
		if (fileName.compareTo("EnglishToFrench.txt") == 0) {
			englishToFrench();
		} else if (fileName.compareTo("FrenchToEnglish.txt") == 0) {
			frenchToEnglish();
		}
		// Return the translated sentence
		return translated.trim();
	}

	/**
	 * Calls lookup() and sets the translated sentence for English to French
	 * translation
	 */
	@Override
	public void englishToFrench() {
		for (int i = 0; i < sentence.length; i++) {
			// Is the first letter uppercase?
			if (i == 0) {
				if ((int) sentence[i].charAt(0) < 97) {
					uppercaseFirst = true;
				}
				if (uppercaseFirst) {

					String temp = lookup(sentence[i]);
					String firstChar = "";
					for (int j = 0; j < temp.length(); j++) {
						if (j == 0) {
							firstChar = "" + temp.charAt(0);
							translated += firstChar.toUpperCase();
						} else
							translated += temp.charAt(j);

					}
				} else
					translated += lookup(sentence[i]);
				// Add the space after the word
				translated += " ";
			}
			// Is it the last word in the sentence?
			else if (i == sentence.length - 1) {
				if ((int) sentence[i].charAt(sentence[i].length() - 1) < 65) {
					// Get the last character
					endPunctuation = sentence[i].charAt(sentence[i].length() - 1);
					// get rid of the special characters in the last word
					sentence[i] = sentence[i].replaceAll("[^A-Za-z0-9]", "");
					translated += lookup(sentence[i]);
					// Add the punctuation if any
					if (endPunctuation != 0) {
						translated += endPunctuation;
					}
				} else
					translated += lookup(sentence[i]);
			} else
				translated += lookup(sentence[i]) + " ";
		}
	}

	/**
	 * Calls lookup() and sets the translated sentence for French to English
	 * translation
	 */
	@Override
	public void frenchToEnglish() {
		for (int i = 0; i < sentence.length; i++) {
			// Is the first letter uppercase?
			if (i == 0) {
				if ((int) sentence[i].charAt(0) < 97) {
					uppercaseFirst = true;
				}
				if (uppercaseFirst) {

					String temp = lookup(sentence[i]);
					String firstChar = "";
					for (int j = 0; j < temp.length(); j++) {
						if (j == 0) {
							firstChar = "" + temp.charAt(0);
							translated += firstChar.toUpperCase();
						} else
							translated += temp.charAt(j);

					}
				} else
					translated += lookup(sentence[i]);
				// Add the space after the word
				translated += " ";
			}
			// Is it the last word in the sentence?
			else if (i == sentence.length - 1) {
				if ((int) sentence[i].charAt(sentence[i].length() - 1) < 65) {
					// Get the last character
					endPunctuation = sentence[i].charAt(sentence[i].length() - 1);
					// get rid of the special characters in the last word
					sentence[i] = sentence[i].replaceAll("[^A-Za-z0-9]", "");
					translated += lookup(sentence[i]);
					// Add the punctuation if any
					if (endPunctuation != 0) {
						translated += endPunctuation;
					}
				} else
					translated += lookup(sentence[i]);
			} else
				translated += lookup(sentence[i]) + " ";
		}
	}

	/**
	 * Searches the known translation data and returns the translated word
	 * 
	 * @param word
	 *            The word to translate
	 * @return String The translated word
	 */
	private String lookup(String word) {
		boolean found = false;
		int temp = 0;
		String translated = "";
		while (!found && temp < data.length) {
			// If the word matches
			if (data[temp][0].compareToIgnoreCase(word) == 0) {
				translated = data[temp][1];
				// Exit condition
				found = true;
			}
			// Move to the next word in the dictionary
			temp++;
		}
		// If no word is found return the untranslated word
		if (!found) {
			translated = word;
		}

		return translated;
	}

}
