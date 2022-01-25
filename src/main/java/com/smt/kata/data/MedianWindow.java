package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: MedianWindow.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Median Window kata
 * 
 * Given an array of numbers arr and a window of size k, print out the median of
 * each window of size k starting from the left and moving right by one position 
 * each time.
 * 
 * For example, given the following array and k = 3:
 * 
 * [-1, 5, 13, 8, 2, 3, 3, 1]
 * Your function should create the following for each window:
 * 
 * 5 <- median of [-1, 5, 13]
 * 8 <- median of [5, 13, 8]
 * 8 <- median of [13, 8, 2]
 * 3 <- median of [8, 2, 3]
 * 3 <- median of [2, 3, 3]
 * 3 <- median of [3, 3, 1]
 * 
 * Recall that the median of an even-sized list is the average of the two middle numbers.
 * 
 * with the median values of 5,8,8,3,3,3, return 4, which is the median value of 
 * the medians of each integer window
 * 
 * NOTE: You are not allowed to use collections or any other import for this solution
 * with one exception "java.util.Arrays".
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 24, 2022
 * @updates:
 ****************************************************************************/
public class MedianWindow {

	/**
	 * Calculates the median value for each number window and then calculates 
	 * the overall median form the median of each window
	 * @param values Values to utilize when evaluating
	 * @param k Size of the window
	 * @return Overall median valu of the medians of each window
	 */
	public int calculateMedianFromWindow(int[] values, int k) {
		return values.length;
	}
}
