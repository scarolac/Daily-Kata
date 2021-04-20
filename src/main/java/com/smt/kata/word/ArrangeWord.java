package com.smt.kata.word;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: ArrangeWord.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Find all permutations of a given string.  Use recursion
 * to iterate through the method and find all possible combinations
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 6, 2021
 * @updates:
 ****************************************************************************/
public class ArrangeWord {
	
	/**
	 * Holds the results of the permutation
	 */
	private static List<String> items;

	/**
	 * 
	 */
	public ArrangeWord() {
		super();
	}
	
	/**
	 * Loads and returns the possible permutations of a word
	 * @param word
	 * @return
	 */
	public List<String> getPermutations(String word) {
		items = new ArrayList<>();
		if (word == null) return items;		
		if (word.length() == 1) { items.add(word); return items; }
		
		permutate("","");
		
		return items;
	}
	
	private String permutate(String word, String addition) {
		// get letter at index
		// put at front
		// put all other letters in all other orders after it
		// two letters?
		// index = 0, put first letter first, other letter after
		// index = 1, put second
		for (int i = 0; i < word.length(); ++i) {
			
		}
		return "";
	}
}
