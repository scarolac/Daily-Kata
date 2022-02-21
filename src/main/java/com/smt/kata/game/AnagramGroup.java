package com.smt.kata.game;

import java.util.ArrayList;
// JDK 11.x
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: AnagramGroup.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Anagram Group Kata
 * 
 * Given an array of strings, group anagrams together.
 * 
 * For example, given the following array:
 * 
 * ['eat', 'ate', 'apt', 'pat', 'tea', 'now']
 * 
 * Return:
 * 
 * [['eat', 'ate', 'tea'],
 *  ['apt', 'pat'],
 *  ['now']]
 *  
 *  Constraints
 *  All words must be lower case or converted to lower case if not.
 *  Return empty collection if source array is empty or null
 *  Skip all null words in the array
 *  
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 21, 2022
 * @updates:
 ****************************************************************************/
public class AnagramGroup {

	/**
	 * Groups all of the words into anagrams
	 * @param words Array of words to group
	 * @return A collection of lists grouping the 
	 */
	public Collection<List<String>> findGroups(String[] words) {
		var result = new HashMap<String, List<String>>();
		if (words == null)
			return result.values();

		for (var word : words)
			if (word != null) {
				word = word.toLowerCase();
				result.computeIfAbsent(
						word.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining()),
						k -> new ArrayList<>()).add(word);
			}

		return result.values();
	}
}
