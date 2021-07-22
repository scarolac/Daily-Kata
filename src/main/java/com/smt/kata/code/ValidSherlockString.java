package com.smt.kata.code;

import java.util.HashMap;

/****************************************************************************
 * <b>Title</b>: ValidSherlockString.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Sherlock considers a string to be valid if all characters of the string appear 
 * the same number of times. It is also valid if he can remove just 1 character at 
 * 1 index in the string, and the remaining characters will occur the same number of times. 
 * Given a string str, determine if it is valid. If so, return "YES", otherwise return "NO".
 * 
 * For example, If str = "abc", the string is valid because the frequencies of characters 
 * are all the same. If str = "abcc", the string is also valid, because we can 
 * remove 1 "c" and have one of each character remaining in the string. However, 
 * if str = "abccc", the string is not valid, because removing one character does not 
 * result in the same frequency of characters.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class ValidSherlockString {

	/**
	 * Reverse the number and compare to the original
	 * @param startNumber
	 * @return
	 */
	public boolean isValid(String sequence) {		
		var counts = new HashMap<Character, Integer>();
		
		for (var letter : sequence.toLowerCase().toCharArray())
			counts.put(letter, counts.getOrDefault(letter, 0) + 1);
		
		int min = Integer.MAX_VALUE;
		for (var value : counts.values())
			min = Math.min(min, value);
		
		var removed = 0;
		for (var value : counts.values())
			removed += value - min;
		
		return removed < 2;
	}
}
