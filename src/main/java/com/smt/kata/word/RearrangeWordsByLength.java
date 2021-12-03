package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: RearrangeWordsByLength.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Rearrange Words in a Sentence Kata
 * 
 * Given a sentence text (A sentence is a string of space-separated words) in the following format:
 * 
 * First letter is in upper case.
 * Each word in text are separated by a single space.
 * Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.
 * 
 * Return the new text following the format shown above.
 * 
 * Example 1:
 * Input: text = "Leetcode is cool"
 * Output: "Is cool leetcode"
 * Explanation: There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
 * Output is ordered by length and the new first word starts with capital letter.
 * 
 * Example 2:
 * Input: text = "Keep calm and code on"
 * Output: "On and keep calm code"
 * Explanation: Output is ordered as follows:
 * "On" 2 letters.
 * "and" 3 letters.
 * "keep" 4 letters in case of tie order by position in original text.
 * "calm" 4 letters.
 * "code" 4 letters.
 * 
 * Example 3:
 * Input: text = "To be or not to be"
 * Output: "To be or to be not"
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 2, 2021
 * @updates:
 ****************************************************************************/
public class RearrangeWordsByLength {

	/**
	 * Sorts the phrase by the length of it's words
	 * @param phrase Phrase to sort
	 * @return Sorted phrase.  Empty string if invalid data
	 */
	public String sort(String phrase) {
		return phrase;
	}

}
