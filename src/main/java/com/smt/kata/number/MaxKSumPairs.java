package com.smt.kata.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;

/****************************************************************************
 * <b>Title</b>: MaxKSumPairs.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Max Number of K-Sum Pairs
 * 
 * You are given an integer array nums and an integer k.
 * 
 * In one operation, you can pick two numbers from the array whose sum equals k 
 * and remove them from the array.
 * 
 * Return the maximum number of operations you can perform on the array.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.
 * 
 * Example 2:
 * Input: nums = [3,1,3,4,3], k = 6
 * Output: 1
 * Explanation: Starting with nums = [3,1,3,4,3]:
 * - Remove the first two 3's, then nums = [1,4,3]
 * There are no more pairs that sum up to 6, hence a total of 1 operation.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 24, 2021
 * @updates:
 ****************************************************************************/
public class MaxKSumPairs {
	
	/**
	 * In one operation, you can pick two numbers from the array whose sum equals k 
 	 * and remove them from the array.
	 * @param source Source array of numbers
	 * @param target Target number to calculate against
	 * @return Number of operations
	 */
	public int calculate(int[] source, int target) {
		// Validate the data
		if (ArrayUtils.isEmpty(source) || source.length < 2) return 0;
			
		var numbers = (ArrayList<Integer>) Arrays.stream(source).boxed().sorted().collect(Collectors.toList());
		
		return find(numbers, target, target, 0, numbers.size() - 1);
	}
	
	private int find(ArrayList<Integer> source, int target, int sum, int count, int index) {
		if (source.isEmpty() || index < 0)
			return count;
		
		if (sum == source.get(index)) {
			source.remove(index);
			return find(source, target, target, ++count, source.size() - 1);
		}
		else if (sum - source.get(index) > 0) {
			return find(source, target, sum - source.get(index), count, --index);
		}
		else
			return find(source, target, target, count, --index);
		
		
		
		
		
//
//		var reset = 0;
//		var same = 0;
//		for (var i = 0; i < source.size(); ++i) {
//			if (sum - source.get(i) >= 0) {
//				sum -= source.remove(i);
//				if (sum == 0) {
//					reset = find(source, target, target, ++count, 0);
//				}
//				else
//					same = find(source, target, sum, count, 0);
//			}
//		}
//		
//		
//		if (sum - source.get(index) >= 0) {
//			sum -= source.remove(index);
//			if (sum == 0) {
//				++count;
//				reset = find(source, target, target, count, ++index);
//			} else
//				same = find(source, target, sum, count, index);
//		}
//		return Math.max(reset, same);
	}
}
