package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: MaxVowelSubstring.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Maximum Number of Vowels in a Substring of Given Length Kata
 * 
 * Given a string s and an integer k.
 * 
 * Return the maximum number of vowel letters in any substring of s with length k.
 * 
 * Vowel letters in English are (a, e, i, o, u).
 * 
 * Example 1:
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * 
 * Example 2:
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * 
 * Example 3:
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 * 
 * Example 4:
 * Input: s = "rhythms", k = 4
 * Output: 0
 * Explanation: We can see that s doesn't have any vowel letters.
 * 
 * Example 5:
 * Input: s = "tryhard", k = 4
 * Output: 1
 * 
 * Constraints:
 * 1 <= s.length <= 10^5
 * s consists of lowercase English letters.
 * 1 <= k <= s.length
 * 
 * Note: **** No imports allowed with the exception of String utils for data validation.
 * This means NO Collections or other helpers
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 2, 2021
 * @updates:
 ****************************************************************************/
public class MaxVowelSubstring {
	
	// Assign the vowels that can be counted
	String vowels = "aeiou";
	
	/**
	 * counts all of the vowels in each substring
	 * @param word word to substring and count vowels
	 * @param k Size of the substring
	 * @return max number of vowels found.  0 otherwise
	 */
	public int find(String word, int k) {
		return k;
	}

}
