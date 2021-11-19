package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: OneThreeTwoPattern.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> 132 Pattern Kata
 * 
 * Given an array of n integers nums, a 132 pattern is a subsequence of three 
 * integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
 * 
 * Return the total number of 132 patterns in nums
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Explanation: There is no 132 pattern in the sequence.
 * 
 * Example 2:
 * Input: nums = [3,1,4,2]
 * Output: 2
 * Explanation: There is a 132 pattern in the sequence: [1, 4, 2], [3, 4, 2].
 * 
 * Example 3:
 * Input: nums = [-1,3,2,0]
 * Output: 3
 * Explanation: There are three 132 patterns in the sequence: 
 * [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
 * 
 * Constraints:
 * n == nums.length
 * 1 <= n <= 2 * 105
 * -109 <= nums[i] <= 109
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 19, 2021
 * @updates:
 ****************************************************************************/
public class OneThreeTwoPattern {

	/**
	 * Calculates the total number of 123 patterns in the provided array
	 * @param values Array of values to analyze
	 * @return Number of 123 patterns in the data
	 */
	public int getTotal(int[] values) {
		return values.length;
	}
}
