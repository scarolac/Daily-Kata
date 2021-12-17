package com.smt.kata.number;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: ConsecutiveDifferences.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Numbers With Same Consecutive Differences Kata
 * 
 * Return all non-negative integers of length n such that the absolute difference 
 * between every two consecutive digits is k.
 * 
 * Note that every number in the answer must not have leading zeros. For example, 
 * 01 has one leading zero and is invalid.
 * 
 * You may return the answer in any order.
 * 
 * Example 1:
 * Input: n = 3, k = 7
 * Output: [181,292,707,818,929]
 * Explanation: Note that 070 is not a valid number, because it has leading zeroes.
 * 
 * Example 2:
 * Input: n = 2, k = 1
 * Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 * 
 * Example 3:
 * Input: n = 2, k = 0
 * Output: [11,22,33,44,55,66,77,88,99]
 * 
 * Example 4:
 * Input: n = 2, k = 2
 * Output: [13,20,24,31,35,42,46,53,57,64,68,75,79,86,97]
 * 
 * Constraints:
 * 2 <= n <= 9
 * 0 <= k <= 9
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 1, 2021
 * @updates:
 ****************************************************************************/
public class ConsecutiveDifferences {

	/**
	 * Finds the consecutive differences in the provided n/k values
	 * @param n number of digits to search against
	 * @param k differences between values
	 * @return collection of the consecutive differences.  Empty collection if invalid
	 * data or none found
	 */
	public List<Integer> find(int n, int k) {
		if (n < 2 || n > 9 || k < 0 || k > 9) 		
			return new ArrayList<>();
		
		var list = new ArrayList<Integer>();
		var start = (int) Math.pow(10, n - 1.0);
		var end = (int) Math.pow(10, n);
		var temp = start;
		var next = 0;
		while (temp < end) {
			var first = temp / (int) Math.pow(10, n - 1.0);
			
			var res = new StringBuilder();
			res.append(first);
			if (first - k >= 0) {
				next = first - k;
				res.append(next);
				first = next;
			}
			if (first + k <= 9) {
				next = first + k;
				res.append(next);
				first = next;
			}
			
			temp += start;
		}
		
		
		return list;
	}
	
	private void append(int first, int k, int length) {
		var str = "";
		
	}
	

}
