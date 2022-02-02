package com.smt.kata.html;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: EmboldenPhrase.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Embolden a Phrase Kata
 * 
 * Implement the function embolden(s, lst) which takes in a string s and list of 
 * substrings lst, and wraps all substrings in s with an HTML bold tag <b> and </b>.
 * 
 * If two bold tags overlap or are contiguous, they should be merged.
 * 
 * For example, given s = abcdefg and lst = ["bc", "ef"], return the string 
 * a<b>bc</b>d<b>ef</b>g.
 * 
 * Given s = abcdefg and lst = ["bcd", "def"], return the string 
 * a<b>bcdef</b>g, since they overlap.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 31, 2022
 * @updates:
 ****************************************************************************/
public class EmboldenPhrase {

	public static final String OPEN_TAG = "<b>";
	public static final String CLOSED_TAG = "</b>";
	
	/**
	 * HTML bold the words and combos from the provided phrase and words
	 * @param phrase Phrase to bold words
	 * @param boldWords Words in the phrase to bold
	 * @return Bolded phrase
	 */
	public String embolden(String phrase, List<String> boldWords) {
		return phrase;
	}
}
