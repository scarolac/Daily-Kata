package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: MinimumAsciiDelete.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Minimum ASCII Delete Sum for Two Strings
 * 
 * Given two strings s1 and s2, return the lowest ASCII sum of deleted characters 
 * to across 2 string.  In other words, identify all of the characters that are NOT
 * in both strings and add up the ascii values of those characters.  If characters
 * are duplicated in one string (but are not in the other), only use the ascii value 
 * for each element.  If there is one character in the first word and 3 of the same 
 * in the second, all of the characters in bith strings will be removed.  For example:
 * 
 * loop -> for
 * 
 * "lpfr" would be the characters that are NOT in the other.  All instances of 'o' 
 * are removed
 * 
 * You MUST only use collections and streams to solve this kata.  No imports from 
 * space libs, apache commons, etc ...
 * 
 * Example 1:
 * Input: s1 = "sea", s2 = "eat"
 * Output: 231
 * Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
 * Deleting "t" from "eat" adds 116 to the sum.
 * 
 * Example 2:
 * Input: s1 = "balloon", s2 = "creed"
 * Output: 1258
 * Explanation: There are no common characters between the 2 strings, so the ascii 
 * values of the removed characters is added to make 1258
 * 
 * Constraints:
 * 1 <= s1.length, s2.length <= 1000
 * s1 and s2 consist of lowercase English letters.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 19, 2021
 * @updates:
 ****************************************************************************/
public class MinimumAsciiDelete {

	/**
	 * Gets the characters that need to be removed and adds their ascii values
	 * @param s1 First word to evaluate
	 * @param s2 Second word to evaluate
	 * @return Total of the removed ascii values
	 */
	public int getMinumumValue(String s1, String s2) {
		return s1.length() + s2.length();
	}
}
