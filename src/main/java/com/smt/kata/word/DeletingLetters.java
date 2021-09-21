package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: DeletingLetters.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Longest Word in Dictionary through Deleting
 * 
 * Given a string s and a string array dictionary, return the longest string in the 
 * dictionary that can be formed by deleting some of the given string characters. If 
 * there is more than one possible result, return the longest word with the smallest 
 * lexicographical order. If there is no possible result, return the empty string.
 * 
 * Example 1:
 * Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 * Output: "apple"
 * 
 * Example 2:
 * Input: s = "abpcplea", dictionary = ["a","b","c"]
 * Output: "a"
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 1000
 * 1 <= dictionary.length <= 1000
 * 1 <= dictionary[i].length <= 1000
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 17, 2021
 * @updates:
 ****************************************************************************/
public class DeletingLetters {

	/**
	 * Finds the longest word in the dictionary that can be created by removing 
	 * letters from the source in order
	 * @param source Source string to search
	 * @param dictionary Words to find a match
	 * @return Longest match.  Empty if no matches
	 */
	public String findLongest(String source, String[] dictionary) {
		return source;
	}
}
