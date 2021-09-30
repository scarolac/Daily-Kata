package com.smt.kata.word;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/****************************************************************************
 * <b>Title</b>: CircularArray.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Circular Array Kata
 * 
 * Given a list of words, determine whether the words can be chained to form a circle. 
 * A word X can be placed in front of another word Y in a circle if the last 
 * character of X is same as the first character of Y.
 * 
 * For example, the words ['chair', 'height', 'racket', touch', 'tunic'] can 
 * form the following circle: chair --> racket --> touch --> height --> tunic --> chair.

 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 13, 2021
 * @updates:
 ****************************************************************************/
public class CircularArray {

	/**
	 * Creates the circular array from the array of words
	 * @param words Words to reorder in a circular pattern
	 * @return Collection of words reordered.  Empty list if not possible
	 */
	public List<String> create(String[] words) {
		if (ArrayUtils.isEmpty(words) || words.length < 2)
			return new ArrayList<>();
		
		var result = new LinkedList<>(Arrays.asList(words));
		
		var first = 0;
		var second = 0;
		var word = result.pollFirst();
		var firstLetter = word.charAt(0);
		var lastLetter = word.charAt(word.length() - 1);
		for (var i = 1; i < result.size(); ++i) {
			var check = result.get(i);
			if (check.charAt(0) == firstLetter)
				first = result.indexOf(check);
		}
		
		for (var j = 1; j < result.size(); ++j) {
			var check = result.get(j);
			if (j != first && check.charAt(check.length() - 1) == lastLetter)
				second = result.indexOf(check);
		}
		
		
		return result;
	}
	
	
	
	private List<String> findLastChar(char letter, List<String> words) {
		var result = new ArrayList<String>();
		for (var word : words)
			if (word.charAt(word.length() - 1) == letter)
				result.add(word);
			
		return result;
	}
	
	private List<String> findFirstChar(char letter, List<String> words) {
		var result = new ArrayList<String>();
		for (var word : words)
			if (word.charAt(0) == letter)
				result.add(word);
			
		return result;
	}
}
