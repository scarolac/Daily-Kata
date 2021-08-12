package com.smt.kata.code;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/****************************************************************************
 * <b>Title</b>: RecurringPatterns.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Recurring Patterns Kata
 * 
 * Given a string and a pattern, find the starting indices of all occurrences of 
 * the pattern in the string. For example, given the string "abracadabra" and 
 * the pattern "abr", you should return [0, 7]
 * 
 * Any spaces in the word or the should be ignored
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 10, 2021
 * @updates:
 ****************************************************************************/
public class RecurringPatterns {

	/**
	 * Gets the number of occurrences of a pattern in a word
	 * @param pattern Pattern to evaluate
	 * @param word word to search against
	 * @return starting location of all patterns
	 */
	public List<Integer> count(String word, String pattern) {
		var result = new ArrayList<Integer>();
		if (StringUtils.isEmpty(word) || StringUtils.isEmpty(pattern)) return result;

		word = word.replace(" ", "");
		for (var index = 0; (index = word.indexOf(pattern, index)) > -1; ++index)
			result.add(index);

		return result;
	}

}
