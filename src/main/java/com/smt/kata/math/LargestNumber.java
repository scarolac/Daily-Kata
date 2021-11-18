package com.smt.kata.math;

// JDK 11.x
import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: LargestNumber.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Largest Number
 * 
 * Given a list of non-negative integers nums, arrange them such that they form the largest number.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * 
 * Example 1:
 * Input: nums = [10,2]
 * Output: "210"
 * 
 * Example 2:
 * Input: nums = [3,30,34,5,9]
 * Output: "9534330"
 * 
 * Example 3:
 * Input: nums = [1]
 * Output: "1"
 * 
 * Example 4:
 * Input: nums = [10]
 * Output: "10"
 * 
 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
public class LargestNumber {

	/**
	 * Finds the largest number from the array of integers supplied
	 * @param values int array of the values to calculate against
	 * @return Number in string format of the largest value.  0 if array is 
	 * empty or null
	 */
	public String find(int[] values) {
		return Arrays.toString(values);
	}
}
