package com.smt.kata.data;

// JDK 11.x
import java.io.InvalidObjectException;
import java.util.Map;

/****************************************************************************
 * <b>Title:</b> CharacterMapping.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Character Mapping
 * Given a mapping of digits to letters (as in a phone number), and a digit 
 * character, return all possible letters the number could represent. You can assume 
 * each valid number in the mapping is a single digit.
 * 
 * For example if {2: ['a', 'b', 'c'], 3: ['d', 'e', 'f'], …} then '23' 
 * should return ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * You may use java.util.Map and any of it's implementing classes.  No other 
 * collections may be used or anything other than the standard java imports
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 29, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class CharacterMapping {
	
	protected Map<Integer, char[]> digitMap;

	/**
	 * Constructor assigns amp
	 * @param digitMap The digit make to work against
	 */
	public CharacterMapping(Map<Integer, char[]> digitMap) throws InvalidObjectException {
		super();
		throw new InvalidObjectException("Change Me");
	}

	/**
	 * Adds (concatenates) the elements in the provided locations
	 * @param locations Locations to concatenate
	 * @return concatenated string array
	 */
	public String[] add(int[] locations) {
		return new String[0];
	}
}
