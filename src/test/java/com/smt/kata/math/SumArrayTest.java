package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SumArrayTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Sum Array Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 24, 2022
 * @updates:
 ****************************************************************************/
class SumArrayTest {
	
	// Members
	private SumArray sa;

	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumExampleOne() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(5, sa.sum(1, 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumExampleTwo() throws Exception {
		sa = new SumArray(new int[] {-2, 5, 24, 37, -12, 1,2,3,4,5,6});
		assertEquals(52, sa.sum(0, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumExampleThree() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(2, sa.sum(1, 2));
	}

	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumExampleFour() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(0, sa.sum(2, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumEndBeforeStart() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(0, sa.sum(4, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumStartLessThanZero() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(0, sa.sum(-4, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumStartTooBig() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(0, sa.sum(14, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumEndTooSmall() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(0, sa.sum(4, -2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumEndTooBig() throws Exception {
		sa = new SumArray(new int[] {1, 2, 3, 4, 5});
		assertEquals(0, sa.sum(4, 12));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumValsNull() throws Exception {
		sa = new SumArray(null);
		assertEquals(0, sa.sum(1,3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.SumArray#sum(int, int)}.
	 */
	@Test
	void testSumValsEmpty() throws Exception {
		sa = new SumArray(new int[] {});
		assertEquals(0, sa.sum(1, 3));
	}
}
