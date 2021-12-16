package com.smt.kata.code;

import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: StringWindow.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> String Window Kata
 * 
 * Given a string, find the length of the smallest window that contains every 
 * distinct character. Characters may appear more than once in the window.
 * 
 * For example, given "jiujitsu", you should return 5, corresponding to the final 
 * five letters.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
public class StringWindow {

	/**
	 * Find the length of the smallest window
	 * @param word Word to find the window
	 * @return Smallest Window.  0 is returned if invalid data.
	 */
	public int find(String word) {
		if (word == null || word.length() == 0)
			return 0;

		word = word.toLowerCase();
		var distinct = word.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList());

		var min = Integer.MAX_VALUE;
		for (var i = 0; i < word.length(); ++i)
			for (var j = i + 1; j <= word.length(); ++j)
				if (word.substring(i, j)
						.chars().mapToObj(c -> (char) c)
						.collect(Collectors.toList())
						.containsAll(distinct))
					min = Math.min(min, word.substring(i, j).length());

		return min;
	}

}
