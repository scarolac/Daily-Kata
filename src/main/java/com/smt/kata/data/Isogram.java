package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: Isogram.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Isograms
 *
 * Determine if a word or phrase is an isogram.
 * 
 * Use the Unit Test to determine the rules for an Isogram
 * 
 * You MAY not use collections or anything other than primitives and Strings for this exercise
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 17, 2021
 * @updates:
 ****************************************************************************/
public class Isogram {

	/**
	 * Validates whether or not the phrase is an isogram
	 * @param phrase Phrase to check against the Isogram rules
	 * @return true if an isogram.  False if empty or not an isogram
	 */
	public boolean isValidIsogram(String phrase) {
		if (phrase == null || phrase.isEmpty())
			return false;

		return distinct(phrase);
	}

	private boolean distinct(String phrase) {
		for (var letter : phrase.toLowerCase().toCharArray()) {
			if (letter == '-' || letter == ' ')
				continue;
			if (phrase.substring(phrase.indexOf(letter) + 1).contains((letter + "")))
				return false;
		}
		return true;
	}
}
