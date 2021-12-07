package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: XORMania.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> XORMania Kata
 * 
 * Given integers M and N, write a program that counts how many positive 
 * integer pairs (a, b) satisfy the following conditions:
 * 
 * a + b = M
 * a XOR b = N
 * 
 * Example One
 * Input (5,5)
 * Output: 
 * (0,5)
 * (1,4)
 * (4,1)
 * (5,0)
 * 
 * Example Two
 * Input (20,20)
 * Output: 
 * (0,20)
 * (4,16)
 * (16,4)
 * (20,0)
 * 
 * Constraints:
 * 0 > M < 1025
 * 0 > N < 1025
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 6, 2021
 * @updates:
 ****************************************************************************/
public class XORMania {

	/**
	 * Finds the number of matching integer
	 * @param m First integer to match (additive)
	 * @param n Second integer to match (exclusive or)
	 * @return Number of matching positive integers.  ) if invalid data
	 */
	public int findMatches(int m, int n) {
		return m + n;
	}

}
