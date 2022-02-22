package com.smt.kata.data;

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
	
	/**
	 * Determines if a number is strobomatic
	 * @param source Number to evaluate
	 * @return True if stobomatic.  False otherwise
	 */
	public boolean isStrobogrammaticNumber(int source) {
		return source == 0;
	}

}
