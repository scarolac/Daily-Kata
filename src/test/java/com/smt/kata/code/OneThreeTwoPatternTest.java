package com.smt.kata.code;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: OneThreeTwoPatternTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the 123 Pattern kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 19, 2021
 * @updates:
 ****************************************************************************/
class OneThreeTwoPatternTest {
	
	// Members
	private OneThreeTwoPattern ottp = new OneThreeTwoPattern();
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalNull() throws Exception {
		assertEquals(0, ottp.getTotal(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalEmpty() throws Exception {
		assertEquals(0, ottp.getTotal(new int[] {}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalTooShort() throws Exception {
		assertEquals(0, ottp.getTotal(new int[] {1,2}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalExampleOne() throws Exception {
		assertEquals(0, ottp.getTotal(new int[] {1,2,3,4}));
	}

	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalExampleTwo() throws Exception {
		assertEquals(2, ottp.getTotal(new int[] {3,1,4,2}));
	}

	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalExampleThree() throws Exception {
		assertEquals(3, ottp.getTotal(new int[] {-1,3,2,0}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalDesc() throws Exception {
		assertEquals(0, ottp.getTotal(new int[] {10,9,8,7,6,5,4,3,2,1,0}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalLong() throws Exception {
		assertEquals(4028, ottp.getTotal(new int[] {3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2,3,1,4,2}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.OneThreeTwoPattern#getTotal(int[])}.
	 */
	@Test
	void testGetTotalShort() throws Exception {
		assertEquals(1, ottp.getTotal(new int[] {8,9,7}));
	}
}
