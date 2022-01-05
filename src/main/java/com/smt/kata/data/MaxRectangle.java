package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: MaxRectangle.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Max rectangle Kata
 * 
 * You are given a histogram consisting of rectangles of different heights. These 
 * heights are represented in an input list, such that [1, 3, 2, 5] corresponds 
 * to the following diagram:
 * 
 *       x
 *       x  
 *   x   x
 *   x x x
 * x x x x
 * 
 * Determine the area of the largest rectangle that can be formed only from the 
 * bars of the histogram. For the diagram above, for example, this would be six, 
 * representing the 2 x 3 area at the bottom right.
 * 
 * Example Two:
 * input: [4, 4, 4, 4]
 * Results: 16
 *
 * x x x x  
 * x x x x
 * x x x x
 * x x x x
 * 
 * Constraints:
 * 	All rectangles MUST be fully populated
 * 	input must not be null
 * 	input must have at least one value
 * 	all values in the input must be >= 0
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 4, 2022
 * @updates:
 ****************************************************************************/
public class MaxRectangle {

	/**
	 * Finds the largest rectangle
	 * @param vals Histogram of values to utilize
	 * @return Max rectangle area
	 */
	public int find(int[] vals) {
		return vals.length;
	}

}
