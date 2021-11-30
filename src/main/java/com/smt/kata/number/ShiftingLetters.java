package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: ShiftingLetters.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Shifting Letters Kata
 * 
 * You are given a string s of lowercase English letters and an integer array shifts 
 * of the same length.
 * 
 * Call the shift() of a letter, the next letter in the alphabet, 
 * (wrapping around so that 'z' becomes 'a').
 * 
 * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 * Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
 * 
 * Return the final string after all such shifts to s are applied.
 * 
 * Example 1:
 * Input: s = "abc", shifts = [3,5,9]
 * Output: "rpl"
 * Explanation: We start with "abc".
 * After shifting the first 1 letters of s by 3, we have "dbc".
 * After shifting the first 2 letters of s by 5, we have "igc".
 * After shifting the first 3 letters of s by 9, we have "rpl", the answer.
 * 
 * Example 2:
 * Input: s = "aaa", shifts = [1,2,3]
 * Output: "gfd"
 * 
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of upper or lowercase English letters.  Upper case letters must be
 * converted to lower case
 * shifts.length == s.length
 * 0 <= shifts[i] <= 109
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
public class ShiftingLetters {

	/**
	 * Transform the provided source string by shifting each letter using the shifts
	 * array
	 * @param source Source string to shift
	 * @param shifts Number of shifts for eeach location
	 * @return Transformed string.  Returns source if data is invalid
	 */
	public String transform(String source, int[] shifts) {
		return source;
		
	}

}
