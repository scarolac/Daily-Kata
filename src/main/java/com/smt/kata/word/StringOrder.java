package com.smt.kata.word;

/****************************************************************************
 * <b>Title:</b> StringOrder.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> StringOrder
 * Create a function that takes a string and returns true or false, depending on 
 * whether the characters are in order or not.
 * 
 * Examples
 * 
 * isInOrder("abc") ➞ true
 * isInOrder("edabit") ➞ false
 * isInOrder("123") ➞ true
 * isInOrder("xyzz") ➞ true
 * 
 * No extra imports are needed for this class
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
public class StringOrder {

	/**
	 * Checks to ensure the characters are in order
	 * @param val String to evaluate
	 * @return true if each character is in order.  False otherwise
	 */
	public boolean isInOrder(String val) {
		return val == null;
	}

}
