package com.smt.kata.math;

import java.math.BigInteger;

/****************************************************************************
 * <b>Title</b>: FactorialTrailingZeros.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Factorial Trailing Zeroes
 * 
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 * 
 * Example 1:
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * 
 * Example 2:
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * 
 * Example 3:
 * Input: n = 0
 * Output: 0
  * 
 * Constraints:
 * 0 <= n <= 104
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
public class FactorialTrailingZeros {

	/**
	 * Calculates the number of trailing zeros in the factorial value of n
	 * @param n Value to calculate the factorial
	 * @return Number of trailing zeros.
	 */
	public int calculate(int n) {
		if (n > 104) return 0;		
		var factorial = factorial(n, BigInteger.ONE).toString();
		var count = 0;
		for (var i = factorial.length() - 1; i > 0; --i)
			if (factorial.charAt(i) != '0') return count;
			else ++count;
		return count;
	}
	
	private static final BigInteger factorial(long n, BigInteger acc) {
		if (n <= 1) return acc;
		return factorial(n - 1, acc.multiply(BigInteger.valueOf(n)));
	}
}
