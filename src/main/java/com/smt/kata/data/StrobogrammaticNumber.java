package com.smt.kata.data;

import java.util.HashMap;
import java.util.Map;

/****************************************************************************
 * <b>Title</b>: StrobogrammaticNumber.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Strobogrammatic Number Kata
 * 
 * A strobogrammatic number is a positive number that appears the same after 
 * being rotated 180 degrees. For example, 16891 is strobogrammatic.
 * 
 * Create a program that finds all strobogrammatic numbers with N digits.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 22, 2022
 * @updates:
 ****************************************************************************/
public class StrobogrammaticNumber {
	
	private static Map<Character, Character> map = new HashMap<>();
	static {
		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('8', '8');
		map.put('9', '6');
	}
	
	/**
	 * Determines if a number is strobomatic
	 * @param source Number to evaluate
	 * @return True if stobomatic.  False otherwise
	 */
	public boolean isStrobogrammaticNumber(int source) {
		if (source < 0) return false;
		
		var str = Integer.toString(source);
		var reverse = new StringBuilder(str.length());
		
		for (var letter : str.toCharArray()) 
			if(! map.containsKey(letter)) 
				return false;
			else
				reverse.insert(0, map.get(letter));		
		
		return str.equals(reverse.toString());
	}

}
