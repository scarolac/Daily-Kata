package com.smt.kata.word;

import java.util.ArrayList;
// JDK 11.x
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/****************************************************************************
 * <b>Title</b>: RearrangeWords.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Rearrange Words Kata
 * 
 * Given a string with repeated characters, rearrange the string so that no two 
 * adjacent characters are the same. If this is not possible, return None.  Return a 
 * collection of all of the possible variations that can occur with no two
 * characters repeated
 * 
 * If the word passed in already has no repeating characters, return just that word
 * 
 * For example, given "aaabbc", you could return :
 * ababac, ababca, abacab, abacba, abcaba, acabab, acbaba, babaca, bacaba, cababa 
 * 
 * Given "aaab", return an empty collection.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 30, 2021
 * @updates:
 ****************************************************************************/
public class RearrangeWords {

	/**
	 * Rearranges the characters in a word such that there are no 2 adjacent characters
	 * @param word Word to rearrange
	 * @return All the possible ways the word can be rearranged to not have sequential characters
	 */
	public Collection<String> arrange(String word) {
		if (StringUtils.isEmpty(word) || word.length() < 2 || !word.chars().allMatch(Character::isLetter))
			return new ArrayList<>();

		var result = new HashSet<String>();
		if (check(word))
			return List.of(word);
		else
			mix("", word, result);

		return result;
	}

	/**
	 * Check the word is good
	 */
	private boolean check(String word) {
		for (var i = 0; i < word.length() - 1; ++i)
			if (word.charAt(i) == word.charAt(i + 1))
				return false;
		return true;
	}

	/**
	 * Make a bunch of words
	 */
	private void mix(String temp, String word, Set<String> result) {
		if (word.isEmpty() && check(temp))
			result.add(temp);
		else
			for (var i = 0; i < word.length(); ++i)
				mix(temp + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()), result);
	}

}
