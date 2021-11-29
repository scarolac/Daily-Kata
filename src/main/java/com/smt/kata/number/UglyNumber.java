package com.smt.kata.number;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: UglyNumber.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Ugly Number Kata
 * 
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * 
 * Given an integer n, return the nth ugly number.
 * 
 * Example 1:
 * Input: n = 10
 * Output: 12
 * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
 * 
 * Example 2:
 * Input: n = 1
 * Output: 1
 * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 * 
 * Constraints:
 * 1 <= n <= 1690
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
public class UglyNumber {

	/**
	 * Finds the nth Ugly Number
	 * @param n Nth ugly number to find
	 * @return nth ugly number.  Return 0 if n < 1 or greater than 1690
	 */
	public int find(int n) {
		if (n < 1 || n > 1690) return 0;
		
		var result = new ArrayList<Integer>();
		result.add(1);
		
		return primeitize(result, 1, 1, 1, n-1);
	}
	
	private int primeitize(List<Integer> result, int idx2, int idx3, int idx5, int max) {
		if (result.size() > max) return result.get(max);
		
		var two = 2 * idx2;
		var three = 3 * idx3;
		var five = 5 * idx5;
		
		var counter = Math.min(Math.min(two, three), five);
		result.add(counter);
		if (counter == two) ++idx2;
		if (counter == three) ++idx3;
		if (counter == five) ++idx5;
		
		return primeitize(result, idx2, idx3, idx5, max);
	}

}
