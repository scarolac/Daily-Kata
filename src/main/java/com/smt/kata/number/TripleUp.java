package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: TripleUp.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description: </b> Return true if the array contains, somewhere, three 
 * increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class TripleUp {

	/**
	 * Loops through the array and counts how many are in sequence in a row
	 * @param nums
	 * @return
	 */
	public boolean tripleUp(int[] nums) {

		return nums.length == 0;
	}

}
