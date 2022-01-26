package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: MaxSequenceLength.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Max Sequence Length Kata
 * 
 * Given a list of integers L, find the maximum length of a sequence of consecutive 
 * numbers that can be formed using elements from L.  A sequence is defined by 
 * the steps between.  For example, 1,3,5 is a sequence if the step value = 2
 * 
 * For example, given L = [5, 2, 99, 3, 4, 1, 100] and a step value of 1, return 
 * 5 as we can build a sequence [1, 2, 3, 4, 5] which has length 5.

 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 25, 2022
 * @updates:
 ****************************************************************************/
public class MaxSequenceLength {

	/**
	 * Calculates the max sequence for the given array of values and steps
	 * @param values Array of values to calculate against
	 * @param step Step value between each number to create a sequence
	 * @return Longest sequence
	 */
	public int calculate(int[] values, int step) {
		return values.length;
	}

}
