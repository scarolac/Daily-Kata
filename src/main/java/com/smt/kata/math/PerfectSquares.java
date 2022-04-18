package com.smt.kata.math;

/****************************************************************************
 * <b>Title</b>: PerfectSquares.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Write a program that determines the smallest number of 
 * perfect squares that sum up to N.
 * 
 * Here are a few examples:
 * 
 * Given N = 4, return 1 (4)
 * Given N = 17, return 2 (16 + 1)
 * Given N = 18, return 2 (9 + 9)
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 15, 2022
 * @updates:
 ****************************************************************************/
public class PerfectSquares {

	/**
	 * Finds the smallest number of squares that add to the total "n"
	 * @param n Number to match the squares
	 * @return Number of squares to solve the matches
	 */
	public int findSmallestNumber(int n) {
		if (isSquare(n)) 
			return 1;
		
	    for (int i = 1; i <= (int)Math.sqrt(n); i++) 
	        if (isSquare(n - (i * i))) 
	            return 2;
	        
	    while (n % 4 == 0) {
	        n >>= 2;
	    }
	    
	    if (n % 8 == 7) 
	        return 4;
	    
	    return 3;
	}
	
	private boolean isSquare(int n) {
		var sq = (int)Math.sqrt(n);
		return sq * sq == n;
	}
}
