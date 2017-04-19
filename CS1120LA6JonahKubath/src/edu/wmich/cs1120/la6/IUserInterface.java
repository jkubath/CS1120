package edu.wmich.cs1120.la6;

import java.io.FileNotFoundException;

public interface IUserInterface {
	// Calls the necessary methods to: display a greeting, ask the user what
	// s/he wants to do; update the
	// courpus file name and the text to be translated based on the user’s input
	// and uses these to initialize
	// a Translator object; loops until the user no longer wants to translate
	// any sentences.
	void runProgram() throws FileNotFoundException;

	// Displays a greeting to the user and indicates briefly what the program
	// does.
	void greeting();

	// Displays the translation options to the user and, after reading in the
	// option selected by the user, sets
	// the name of the corpus file.
	// Uses try-catch block(s) to enforce correct input.
	void getCorpusFileName();

	// Requests the text the user wants to translate (i.e. the source text) and
	// sets the name of the source text.
	void getSourceText();

	// Uses the Translator object to translate the source text and displays the
	// translated text to the user.
	void translate() throws FileNotFoundException;
}
