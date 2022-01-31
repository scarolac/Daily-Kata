package com.smt.kata.letters;

import java.util.Collections;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: RearrangeCharacters.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Rearrange Charcters Kata
 * 
 * Given a string s, rearrange the characters so that any two adjacent characters 
 * are not the same. If this is not possible, return null.
 * 
 * For example, if s = yyz then return yzy. If s = yyy then return ""

 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 27, 2022
 * @updates:
 ****************************************************************************/
public class RearrangeCharacters {

	/**
	 * Rearranges letters in the word such that no two letters of the same are 
	 * adjacent to each other
	 * @param word Word to rearrange the letters
	 * @return Rearranged word
	 */
	public String arrange(String word) {
		if (word == null || word.length() == 0) 
			return "";
		if (word.chars().distinct().count() == word.length()) 
			return word;
		if(word.chars().distinct().count() == 1)
			return "";
		var str = shuffle(word);
		System.out.println(str);
		return str;
	}
	
	private boolean isValid(String word) {
		for (var i = 0; i < word.length() - 1; ++i)
			if (word.charAt(i) == word.charAt(i + 1))
				return false;
		return true;
	}
	
	private String shuffle(String word) {
		var list = word.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		Collections.shuffle(list);
		var result = list.stream().map(e -> e.toString()).collect(Collectors.joining());
		while(! isValid(result)) {
			Collections.shuffle(list);
			result = list.stream().map(e -> e.toString()).collect(Collectors.joining());
		}
		return result;
	}
}
