package com.smt.kata.word;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: ShortestSubstring.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Shortest Substring Kata
 * 
 * Given a string and a set of characters, return the shortest substring 
 * containing all the characters in the set.  The characters in the set can be in 
 * any order.
 * 
 * For example, given the string "figehaeci" and the set of characters {a, e, i}, 
 * you should return "aeci".
 * 
 * Another example, given the string "figehaeci" and the set of characters {i, a, e }, 
 * you should return "aeci" as well.
 * 
 * If there is no substring containing all the characters in the set, return ""

 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 29, 2022
 * @updates:
 ****************************************************************************/
public class ShortestSubstring {

	/**
	 * Find the smallest substring for the given word and chatracters
	 * @param word Word to evaluate against
	 * @param sequence Characters to find in the smallest substring
	 * @return Smallest substring.  Empty if not found
	 */
	public String find(String word, char[] sequence) {
		if (word == null || word.isEmpty() || sequence == null || sequence.length == 0)
			return "";
		
		var wordList = stringToList(word);
		var sequenceList = stringToList(new String(sequence));
		if (!wordList.containsAll(sequenceList)) 
			return "";
		
		var temp = String.join("", wordList);
		for(var i = 0; i < word.length(); ++i) 
			for (var j = word.length(); j >= i; --j) {
				if (containsEach(wordList, sequenceList)) 
					temp = String.join("", wordList);				
				sequenceList = stringToList(new String(sequence));
				wordList = stringToList(word.substring(i, j));
			}
		
		return temp;
	}
	
	private boolean containsEach(List<String> wordList, List<String> sequenceList) {
		var temp = new ArrayList<>(wordList);
		while (!sequenceList.isEmpty()) {
			var letter = sequenceList.remove(0);
			if (!temp.contains(letter))
				return false;
			else 
				temp.remove(letter);
		}
		return true;
	}

	private List<String> stringToList(String input){
		return input.chars().mapToObj(Character::toString).collect(Collectors.toList());
	}
	
}
