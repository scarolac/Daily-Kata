package com.smt.kata.data;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: PatternDecoder.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description:</b> 
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
 * count the number of ways it can be decoded. For example, the message '111'
 * would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'. You can
 * assume that the messages are decodable. For example, '001' is not allowed.
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class PatternDecoder {
	
	/**
	 * Decodes the given pattern
	 * 
	 * @param pattern Valid pattern to compare
	 * @return Collection of the matching patterns
	 */
	public static List<String> decodePattern(String pattern) {
		var result = new ArrayList<String>();	
		if (pattern == null || !pattern.matches("\\d+")) 
			return result;
		
		System.out.println(getLetter("" + pattern.charAt(0) + pattern.charAt(1)));
		result.add("ddd");
		return result;
	}
	
	private static char singleDigit(char letter) {
		return (char)(Integer.parseInt(letter + "") % 26 - 1 + 'a');
	}
	
	private static char getLetter(String letters) {
		return (char)(Integer.parseInt(letters) % 26 - 1 + 'a');
	}
}
