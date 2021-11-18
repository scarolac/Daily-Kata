package com.smt.kata.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
		return getMaxString(quickPerm(values));
	}

	private List<int[]> quickPerm(int[] array) {
		var length = array.length;
		var indexes = IntStream.iterate(0, i -> i <= length, i -> i + 1).toArray();

		var result = new ArrayList<int[]>();
		result.add(Arrays.copyOf(array, array.length));
		var i = 1;
		while (i < length) {
			indexes[i]--;
			var j = i % 2 * indexes[i];
			swap(array, i, j);
			result.add(Arrays.copyOf(array, array.length));
			i = 1;
			while (indexes[i] == 0)
				indexes[i] = i++;
		}
		return result;
	}

	public static final void swap(int[] array, int i, int j) {
		var temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private String getMaxString(List<int[]> list) {
		var max = "";
		for (var item : list) {
			var str = arrayToString(item);
			if (str.compareTo(max) > 0)
				max = str;
		}
		return max;
	}

	private String arrayToString(int[] array) {
		var str = new StringBuilder();
		for (var item : array)
			str.append(item);
		return str.toString();
	}
}
