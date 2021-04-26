package com.smt.kata.number;

/****************************************************************************
 * <b>Title:</b> HappyNumber.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Happy Number
 * 
 * A happy number is a number which yields a 1 by repeatedly summing up the square 
 * of its digit. If such a process results in an endless cycle of numbers 
 * containing 4, the number is said to be an unhappy number.
 * 
 * Create a function that accepts a number and determines whether the number is a 
 * happy number or not. Return true if so, false otherwise.
 * 
 * Examples
 * isHappy(67) ➞ false
 * isHappy(89) ➞ false
 * isHappy(139) ➞ true
 * isHappy(1327) ➞ false
 * isHappy(2871) ➞ false
 * isHappy(3970) ➞ true
 * 
 * Notes
 * Hint: Your loop terminates if the value of n is either 1 or 4.
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
public class HappyNumber {

	/**
	 * Determines if the provided number is happy
	 * @param val Number to validate
	 * @return True if the number is happy.  False otherwise
	 */
	public boolean isHappy(int val) {
		return val == 0;
	}
}
