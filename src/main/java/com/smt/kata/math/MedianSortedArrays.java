package com.smt.kata.math;

/****************************************************************************
 * <b>Title</b>: MedianSortedArrays.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Median of Two Sorted Arrays
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * 
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 * Example 3:
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * 
 * Example 4:
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * 
 * Example 5:
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 * 
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * 
 * No collections of any kind or any other impots may be used for this kata
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 2, 2021
 * @updates:
 ****************************************************************************/
public class MedianSortedArrays {

	/**
	 * Calculates the median values for the sorted, combined arrays
	 * @param first First array of values
	 * @param second Second array of values
	 * @return median value.  0 if invalid data
	 */
	public double calculate(int[] first, int[] second) {
		if (first == null || second == null) return 0;
		
		var result = merge(first, second);
		if (result.length == 0) return 0;
		
		//median
		var len = result.length;
		if (len % 2 == 1)
			return result[len/2];
		else
			return average(result[len/2], result[len/2-1]);
	}
	
	private double average(int first, int second) {
		return (first + second) / 2.0;
	}
	
	private int[] merge(int[] first, int[] second) {
		var result = new int[first.length + second.length];
		
		var index = 0;
		var f = 0;
		var s = 0;
		while (f < first.length && s < second.length) {
			if (first[f] < second[s])
				result[index++] = first[f++];
			else
				result[index++] = second[s++];
		}
		
		while (f < first.length)
			result[index++] = first[f++];
		while (s < second.length)
			result[index++] = second[s++];
		
		return result;
	}
	
	
}
