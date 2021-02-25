package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: AscendingNumbers.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Ascending Consecutive Numbers
 * Write a method that returns true if a string consists of ascending or ascending 
 * AND consecutive numbers.
 * 
 * Examples
 * ascending("232425") ➞ true
 * // Consecutive numbers 23, 24, 25
 * 
 * ascending("2324256") ➞ false
 * No matter how this string is divided, the numbers are not consecutive.
 * 
 * ascending("444445") ➞ true
 * Consecutive numbers 444 and 445.
 * Notes:
 * A number can consist of any number of digits, so long as the numbers are adjacent 
 * to each other,and the string has at least two of them.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 12, 2021
 * @updates:
 ****************************************************************************/
public class AscendingNumbers {

	/**
	 * 
	 */
	public AscendingNumbers() {
		super();
	}

	public static void main(String[] args) {
		isAscending("1213");
	}

	/**
	 * Determines if the provided value has sequential numbers
	 * @param sequence
	 * @return
	 */
	public static boolean isAscending(String sequence) {
		if (sequence.length() == 0) return true;

		int halfLength = sequence.length() / 2;
		
		String firstHalf = sequence.substring(0, (halfLength));
		String secondHalf = sequence.substring(halfLength);

		System.out.println(firstHalf);
		System.out.println(secondHalf);

		if (Integer.parseInt(firstHalf) + 1 == Integer.parseInt(secondHalf)) 
			return true;
		else if (halfLength == 2) 
			return false;
		else 
			return isAscending(firstHalf) && isAscending(secondHalf);
	}
}
