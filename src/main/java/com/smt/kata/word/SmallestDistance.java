package com.smt.kata.word;

import org.apache.commons.lang3.StringUtils;

import com.siliconmtn.data.text.StringUtil;

/****************************************************************************
 * <b>Title</b>: SmallestDistance.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Smallest Distance Kata
 * Find an efficient algorithm to find the smallest distance (measured in number 
 * of words) between any two given words in a string.
 * 
 * For example, given words "hello", and "world" and a text content of 
 * "dog cat hello cat dog dog hello cat world", return 1 because there's only one 
 * word "cat" in between the two words.  As in the example above, if the first
 * word is restarted, the counter resets.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 18, 2021
 * @updates:
 ****************************************************************************/
public class SmallestDistance {

	/**
	 * Calculates the number of words between the start and end word in the phrase
	 * The case of the phrase and words is irrelevant to the calculation
	 * @param phrase Phrase to be calculated
	 * @param startWord The start word in the sequence of calculation
	 * @param endWord The end word in the sequence
	 * @return Number of words between the start and end.  0 if none found
	 */
	public int calculate(String phrase, String startWord, String endWord) {
		if (StringUtil.isEmpty(phrase) || StringUtil.isEmpty(startWord)) return 0;
		if (! StringUtils.containsIgnoreCase(phrase, startWord)) return 0;
		
		var count = 0;
		for (var word : phrase.split(" ")) {
			if (word.equalsIgnoreCase(endWord)) return count;
			if (word.equalsIgnoreCase(startWord)) count = 0;
			else count++;
		}		
		return 0;
	}

}
