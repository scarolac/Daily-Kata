package com.smt.kata.html;

import java.util.ArrayList;
import java.util.HashMap;
// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: EmboldenPhrase.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Embolden a Phrase Kata
 * 
 * Implement the function embolden(s, lst) which takes in a string s and list of 
 * substrings lst, and wraps all substrings in s with an HTML bold tag <b> and </b>.
 * 
 * If two bold tags overlap or are contiguous, they should be merged.
 * 
 * For example, given s = abcdefg and lst = ["bc", "ef"], return the string 
 * a<b>bc</b>d<b>ef</b>g.
 * 
 * Given s = abcdefg and lst = ["bcd", "def"], return the string 
 * a<b>bcdef</b>g, since they overlap.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 31, 2022
 * @updates:
 ****************************************************************************/
public class EmboldenPhrase {

	public static final String OPEN_TAG = "<b>";
	public static final String CLOSED_TAG = "</b>";
	
	/**
	 * HTML bold the words and combos from the provided phrase and words
	 * @param phrase Phrase to bold words
	 * @param boldWords Words in the phrase to bold
	 * @return Bolded phrase
	 */
	public String embolden(String phrase, List<String> boldWords) {
		if (phrase == null || phrase.length() == 0)
			return "";
		if (boldWords == null || boldWords.isEmpty())
			return phrase;
		
		var map = new HashMap<Integer, String>();
		boldWords = comboMaker(boldWords);
		while(!boldWords.isEmpty()) {
			var combo = boldWords.remove(0);
			var taggedWord = OPEN_TAG + combo + CLOSED_TAG;
			var index = phrase.indexOf(combo);
			map.put(index, taggedWord);
			phrase = phrase.replace(combo, index + "");
		}
		
		for (var entry : map.entrySet())
			phrase = phrase.replace(entry.getKey() + "", entry.getValue());
		
		return phrase;
	}
	
	private List<String> comboMaker(List<String> boldWords) {
		var list = new ArrayList<String>();
		for (var i = 0; i < boldWords.size() - 1; ++i)
			for (var j = i + 1; j < boldWords.size(); ++j) {
				var first = boldWords.get(i);
				var second = boldWords.get(j);
				if (first.charAt(first.length() - 1) == second.charAt(0))
					list.add(first + second.substring(1));
				if (second.charAt(second.length() - 1) == first.charAt(0))
					list.add(second + first.substring(1));
			}
		for (var item : boldWords)
			list.add(item);
		return list;
	}
	
}
