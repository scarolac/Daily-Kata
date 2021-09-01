package com.smt.kata.distance;

/****************************************************************************
 * <b>Title</b>: MinimumMovesEqual.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Minimum Moves to Equal Array Elements
 * 
 * Given an integer array nums of size n, return the minimum number of moves 
 * required to make all array elements equal.
 * 
 * In one move, you can increment or decrement an element of the array by 1.
 * Test cases are designed so that the answer will fit in a 32-bit integer.
 * 
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: 2
 * Explanation:
 * Only two moves are needed (remember each move increments or decrements one element):
 * [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
 * 
 * Example 2:
 * Input: nums = [1,10,2,9]
 * Output: 16
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 30, 2021
 * @updates:
 ****************************************************************************/
public class MinimumMovesEqual {

	/**
	 * Calculates the number of moves to make each item in the array the equal
	 * @param elements Array to make equal
	 * @return Number of moves to make equal
	 */
	public int calculate(int[] elements) {
		return elements.length;
	}
}
