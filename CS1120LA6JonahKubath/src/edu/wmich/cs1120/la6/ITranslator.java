package edu.wmich.cs1120.la6;

import java.io.FileNotFoundException;

public interface ITranslator {
	// Reads in the data from the input file and stores the data in a two
	// dimensional array for easy retrieval
	// during the translation process.
	void readCorpus() throws FileNotFoundException;

	// Calls the necessary methods to perform the translation and returns the
	// translated text.
	String translate();

	// Uses a private method: “private String lookup(String key);” to look up an
	// English word in the source
	// text, and sets the attribute for the translated word (in French).
	void englishToFrench();

	// Uses a private method: “private String lookup(String key);” to look up a
	// French word in the source text,
	// and sets the attribute for the translated word (in English).
	void frenchToEnglish();
}
