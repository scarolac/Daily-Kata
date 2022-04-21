package com.smt.kata.code;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: StartingAnagramIndexes.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Starting Anagram Indexes Kata
 * 
 * Given a word W and a string S, find all starting indices in S which are anagrams of W.
 * 
 * For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 17, 2022
 * @updates:
 ****************************************************************************/
public class StartingAnagramIndexes {

	/**
	 * Finds the indexes of all of the matching permutations or anagrams of the word
	 * in the phrase
	 * @param word Word to find And its anagrams) in the phrase
	 * @param phrase Phrase to match against
	 * @return Collection of the matching indexes
	 */
	public List<Integer> find(String word, String phrase) {
		if (word == null || phrase == null || word.isEmpty() || phrase.isEmpty())
			return new ArrayList<>();
		
		var result = new ArrayList<Integer>();
		for (var i = 0; i <= phrase.length() - word.length(); ++i)
			if (isAnagram(phrase.substring(i, i + word.length()), word))
				result.add(i);
		
		return result;
	}
	
	private boolean isAnagram(String str1, String str2) {
		var temp1 = str1.toLowerCase().toCharArray();
		var temp2 = str2.toLowerCase().toCharArray();
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		return Arrays.equals(temp1, temp2);
	}
}
