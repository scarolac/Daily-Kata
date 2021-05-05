package com.smt.kata.code;

import java.util.ArrayList;
import java.util.Arrays;
// JDK 11.x
import java.util.Collection;

import com.siliconmtn.data.text.StringUtil;

/****************************************************************************
 * <b>Title:</b> AnagramIndicese.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Anagram Indicie
 * 
 * Given a word W and a string S, find all starting indices in S which are anagrams of W.
 * 
 * For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 28, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class AnagramIndices {

	/**
	 * Finds the location of each indices of w in s
	 * @param w characters to find
	 * @param s String to locate w
	 * @return Collection of indices locations.  Empty collection if none found
	 */
	public Collection<Integer> find(String w, String s) {
		Collection<Integer> result = new ArrayList<>();
		if (StringUtil.isEmpty(w) || StringUtil.isEmpty(s)) return result;
						
		for (int i = 0; i <= s.length() - w.length(); ++i) 
			if(sortChars(s.substring(i, i + w.length())).equals(sortChars(w)))
				result.add(i);
		return result;
	}
	
	private String sortChars(String s) {
		var result = s.toLowerCase().toCharArray();
		Arrays.sort(result);
		return new String(result);
	}
}
