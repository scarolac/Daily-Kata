package com.smt.kata.letters;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: ReorderLetters.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Reorder Letters Kata
 * 
 * Given a string, sort it in decreasing order based on the frequency of characters. 
 * If there are multiple characters with the same count, the letters should be
 * sorted alphabetically.  Same letter with different case should be consider as 
 * 2 different characters
 * 
 * Example One
 * Input: tweet
 * Output: eettw
 * 
 * Example Two
 * Input: TwEet
 * Output: ETetw
 * 
 * Empty/Null
 * Input: null or ""
 * Output: ""
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 31, 2022
 * @updates:
 ****************************************************************************/
public class ReorderLetters {

	/**
	 * Reorders the letters based upon the total number each character is present and 
	 * then ordered alphabetically.
	 * @param word Word to reorder it's letters
	 * @return Reordered word
	 */
	public String process(String word) {		
		return (word == null) 
				? "" 
				: word.chars()
					.mapToObj(Character::toString)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					.entrySet().stream()
					.sorted(Map.Entry.comparingByKey())
					.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
					.map(entry -> entry.getKey().repeat(entry.getValue().intValue()))
					.collect(Collectors.joining());
	}
}
