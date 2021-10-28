package com.smt.kata.math;

import java.util.Arrays;
import java.util.HashSet;

/****************************************************************************
 * <b>Title</b>: KaprekarsConstant.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Kaprekar's Constant Kata
 * 
 * The number 6174 is known as Kaprekar's constant, after the mathematician who 
 * discovered an associated property: for all four-digit numbers with at least 
 * two distinct digits, repeatedly applying a simple procedure eventually results 
 * in this value. The procedure is as follows:
 * 
 * For a given input x, create two new numbers that consist of the digits in x in 
 * ascending and descending order.
 * 
 * Subtract the smaller number from the larger number.
 * For example, this algorithm terminates in three steps when starting from 1234:
 * 
 * 4321 - 1234 = 3087
 * 8730 - 0378 = 8352
 * 8532 - 2358 = 6174
 * 
 * Write a function that returns how many steps this will take for a given input N.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Oct 25, 2021
 * @updates:
 ****************************************************************************/
public class KaprekarsConstant {
	
	private static final int KAPREKARS_CONSTANT = 6174;

	/**
	 * Calculates the number of steps until Kaprekar's Constant is achieved
	 * @param num Number to evaluate
	 * @return the number of steps to acheive the number
	 */
	public int calculateSteps(int num) {
		if (badInput(num)) 
			return 0;
		
		var count = 0;		
		for (; num != KAPREKARS_CONSTANT; ++count)
			num = Math.abs(descending(num) - ascending(num));
		
		return count;
	}
	
	private boolean badInput(int num) {
		return num < 0 || Integer.toString(num).length() != 4 || checkDigits(num);
	}
	
	private boolean checkDigits(int num) {
		var set = new HashSet<Character>();
		for (var letter : Integer.toString(num).toCharArray())
			set.add(letter);
		return set.size() < 2;
	}
	
	private int ascending(int num) {
		var array = Integer.toString(num).toCharArray();
		Arrays.sort(array);
		return Integer.parseInt(new String(array));
	}
	
	private int descending(int num) {
		var array = Integer.toString(num).toCharArray();
		Arrays.sort(array);
		return Integer.parseInt(new StringBuilder(new String(array)).reverse().toString());
	}
}
