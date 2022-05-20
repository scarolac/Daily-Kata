package com.smt.kata.code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * 
 * Given a letter, print a diamond starting with ‘A’ with the supplied letter at the widest point.
 * 
 * For example: generateDiamond ‘C’ prints
 *   A
 *  B B
 * C   C
 *  B B
 *   A
 * 
 * Given character should be a printable letter in the range of [A-Z]
 * Lowercase character would be promoted to uppercase.
 * Non-Printable or non-letter characters would return empty.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author raptor
 * @version 3.0
 * @since May 17, 2022
 *
 */
public class DiamondGeneration {

	/**
	 * Generates List of Strings consisting of diamond pattern for given
	 * character 
	 * @param letter
	 * @return
	 */
	public List<String> generateDiamond(Character letter) {
		if (letter == null || !Character.isLetter(letter)) 
			return new ArrayList<>();
		
		var a = Character.toUpperCase('A');
		letter = Character.toUpperCase(letter);
		var diff = letter - a;
		
		if (diff == 0) 
			return Arrays.asList(letter.toString());
		
		var len = diff * 2 + 1;		
		var result = new ArrayList<String>();		
		for (var i = 0; letter >= a; ++i, letter--) {
			var arr = charArray(len);
			arr[i] = letter;
			arr[len - 1 - i] = letter;
			if (i != 0) 
				result.add(0, new String(arr));			
			result.add(new String(arr));
		}
		
		return result;
	}

	private char[] charArray(int len) {
		var arr = new char[len];
		for (var i = 0; i < len; ++i)
			arr[i] = ' ';
		return arr;
	}
}
