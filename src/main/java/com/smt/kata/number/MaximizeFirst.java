package com.smt.kata.number;

/****************************************************************************
 * <b>Title:</b> MaximizeFirst.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Maximize the First Number
 * 
 * Write a function that makes the first number as large as possible by 
 * swapping out its digits for digits in the second number.
 * 
 * To illustrate:
 * 
 * maxPossible(9328, 456) ➞ 9658
 * // 9658 is the largest possible number built from swaps from 456.
 * // 3 replaced with 6 and 2 replaced with 5.
 * 
 * Examples
 * maxPossible(523, 76) ➞ 763
 * maxPossible(9132, 5564) ➞ 9655
 * maxPossible(8732, 91255) ➞ 9755
 * 
 * Notes
 * Each digit in the second number can only be used once.
 * Zero to all digits in the second number may be used.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 23, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class MaximizeFirst {

	/**
	 * Creates the max number possible by swapping digits in the first with the second
	 * @param first First number, or number to be compared
	 * @param second Number to use it's digits to improve the first
	 * @return Largest swapped number possible
	 */
	public int maxPossible(int first, int second) {
		return first + second;
	}

}
