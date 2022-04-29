package com.smt.kata.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SumDivisibleByPTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 28, 2022
 * @updates:
 ****************************************************************************/
class SumDivisibleByPTest {
	
	// Members
	private SumDivisibleByP sdp = new SumDivisibleByP();

	/**
	 * Test method for {@link com.smt.kata.math.SumDivisibleByP#calculate(int[], int)}.
	 */
	@Test
	void testCalculatePTooBig() throws Exception {
		assertEquals(-1, sdp.calculate(new int[] {1, 2, 3}, 10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumDivisibleByP#calculate(int[], int)}.
	 */
	@Test
	void testCalculateArrayNull() throws Exception {
		assertEquals(-1, sdp.calculate(null, 10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumDivisibleByP#calculate(int[], int)}.
	 */
	@Test
	void testCalculateArrayEmpty() throws Exception {
		assertEquals(-1, sdp.calculate(new int[] {}, 10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumDivisibleByP#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(1, sdp.calculate(new int[] {3,1,4,2}, 6));
	}

	/**
	 * Test method for {@link com.smt.kata.math.SumDivisibleByP#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(2, sdp.calculate(new int[] {6,3,5,2}, 9));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumDivisibleByP#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		assertEquals(0, sdp.calculate(new int[] {1, 2, 3}, 3));
	}
}
