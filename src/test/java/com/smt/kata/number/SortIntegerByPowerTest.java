package com.smt.kata.number;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SortIntegerByPowerTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Sort Integer By Power Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 2, 2021
 * @updates:
 ****************************************************************************/
class SortIntegerByPowerTest {
	
	// Members
	private SortIntegerByPower sibp = new SortIntegerByPower();
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindNegative() throws Exception {
		assertEquals(0, sibp.find(-1, 15, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindNegativeHigh() throws Exception {
		assertEquals(0, sibp.find(10, -1, 2));
	}

	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(13, sibp.find(12, 15, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindHighLessLow() throws Exception {
		assertEquals(0, sibp.find(20, 15, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindKTooLarge() throws Exception {
		assertEquals(0, sibp.find(10, 15, 20));
	}

	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(1, sibp.find(1, 1, 1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(7, sibp.find(7, 11, 4));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		assertEquals(13, sibp.find(10, 20, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.SortIntegerByPower#find(int, int, int)}.
	 */
	@Test
	void testFindExampleFive() throws Exception {
		assertEquals(570, sibp.find(1, 1000, 777));
	}
}
