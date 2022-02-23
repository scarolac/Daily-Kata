package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: PairsDivisibleByKTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the PairsDivisibleByK kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 3, 2022
 * @updates:
 ****************************************************************************/
class PairsDivisibleByKTest {

	// Members
	private PairsDivisibleByK mdbk = new PairsDivisibleByK();
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateNullValues() throws Exception {
		assertEquals(0, mdbk.calculate(null, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateEmptyValues() throws Exception {
		assertEquals(0, mdbk.calculate(new int[0], 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateSmallK() throws Exception {
		assertEquals(0, mdbk.calculate(new int[] { 1,2,3,4,5,10,6,7,8,9}, -5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateLargelK() throws Exception {
		assertEquals(0, mdbk.calculate(new int[] { 1,2,3,4,5,10,6,7,8,9}, 205));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateOddNumValues() throws Exception {
		assertEquals(0, mdbk.calculate(new int[] { 1,2,3,4,5,10,6,7,8,9,11}, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(5, mdbk.calculate(new int[] { 1,2,3,4,5,10,6,7,8,9}, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(3, mdbk.calculate(new int[] { 1,2,3,4,5,6}, 7));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		assertEquals(0, mdbk.calculate(new int[] { 1,2,3,4,5,6}, 10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.PairsDivisibleByK#calculate(int[], int)}.
	 */
	@Test
	void testCalculateNegativeValues() throws Exception {
		assertEquals(4, mdbk.calculate(new int[] { 1,-2,3,4,-5,6}, 2));
	}

}
