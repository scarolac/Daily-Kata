package com.smt.kata.code;

//JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: PhoneNumberCombos.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Phone Number Combos Kata
 * 
 * A phone number keypad has a series of characters that are associated with 
 * each number (except 1 and 0) as shown in this image 
 * https://i.insider.com/5aa8433b3be59f1f008b4651?width=1200
 * 
 * In this kata, you will be provided a set of digits.  You must create all of 
 * the possible permutations from each set of numbers provided
 * 
 * Example 1
 * input "5"
 * output: [ "j", "k","l" ]
 * 
 * Example 2
 * input "23"
 * output: [ "ad","ae","af","bd","be","bf","cd","ce","cf" ]
 * 
 * Example 3
 * input ""
 * output: [ ]
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 2, 2021
 * @updates:
 ****************************************************************************/
public class PhoneNumberCombos {
	
	/**
	 * Map with the digits to it's character options.  Array location matches the digit value
	 */
	protected static final String[] DIGIT_MAP = new String[] {
		"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" 
	};

	/**
	 * Calculates all of the possible permutations for a phone number to letter mapping
	 * @param digits Digits to transcribe 
	 * @return Collection of all of the permutations
	 */
	public List<String> calculate(String digits) {
		return new ArrayList<>();
	}
}
