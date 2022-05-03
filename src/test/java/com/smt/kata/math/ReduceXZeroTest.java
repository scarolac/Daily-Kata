package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: ReduceXZeroTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Reduce X Zero Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 29, 2022
 * @updates:
 ****************************************************************************/
class ReduceXZeroTest {

	// Members
	private ReduceXZero rxz = new ReduceXZero();
	
	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsNullArray() throws Exception {
		assertEquals(-1, rxz.minOperations(null, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsEmptyArray() throws Exception {
		assertEquals(-1, rxz.minOperations(new int[] { }, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsNegativeTotal() throws Exception {
		assertEquals(-1, rxz.minOperations(new int[] { 1,2,3,4,5,6}, -10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsExampleOne() throws Exception {
		assertEquals(2, rxz.minOperations(new int[] { 1,1,4,2,3 }, 5));
	}

	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsExampleTwo() throws Exception {
		assertEquals(-1, rxz.minOperations(new int[] { 5,6,7,8,9 }, 4));
	}

	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsExampleThree() throws Exception {
		assertEquals(5, rxz.minOperations(new int[] { 3,2,20,1,1,3 }, 10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.ReduceXZero#minOperations(int[], int)}.
	 */
	@Test
	void testMinOperationsSevenMatch() throws Exception {
		assertEquals(7, rxz.minOperations(new int[] { 1,1,1,1,22,22,22,1,1,1 }, 7));
	}
}
