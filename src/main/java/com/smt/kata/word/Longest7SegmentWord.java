package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: Longest7SegmentWord.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Longest 7 segment word
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * A seven segment display as a digital representation of numbers and some letters
 * as illustrated below
 *  _  _    _  _
 * |_||_|  |_||_|
 * |_||_|  |_||_|
 * 
 * Find the longest word that can be represented inside stringing multiple seven 
 * segment letters together.  Not all letters can be displyed in this manner
 * 
 * Notes
 * 	All words will be given in lower case and upper case.
 * 	Return an empty string if no words are eligible (see example #3).
 * 	If multiple valid words have the same length, return the first word that appears.
 * 
 * Examples:
 * calculate(["knighthood", "parental", "fridge", "clingfilm"]) ➞ "parental"
 * calculate(["coding", "crackers", "edabit", "celebration"]) ➞ "celebration"
 * calculate(["velocity", "mackerel", "woven", "kingsmen"]) ➞ ""
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
public class Longest7SegmentWord {

	/**
	 * Finds the longest word that can be displayed in a seven segment display
	 * @param words Collection of words to evaluate
	 * @return Longest word.  Empty string if none can be displayed
	 */
	public String calculate(String[] words) {
		return words[0];
	}
}
