package com.smt.kata.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: UglyNumberTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
class UglyNumberTest {
	
	// Members
	private UglyNumber um = new UglyNumber();
	
	/**
	 * Test method for {@link com.smt.kata.number.UglyNumber#find(int)}.
	 */
	@Test
	void testFindExampleZero() throws Exception {
		assertEquals(0, um.find(0));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UglyNumber#find(int)}.
	 */
	@Test
	void testFindExampleSingle() throws Exception {
		assertEquals(1, um.find(1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UglyNumber#find(int)}.
	 */
	@Test
	void testFindExampleSecond() throws Exception {
		assertEquals(2, um.find(2));
	}

	/**
	 * Test method for {@link com.smt.kata.number.UglyNumber#find(int)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(12, um.find(10));
	}

	/**
	 * Test method for {@link com.smt.kata.number.UglyNumber#find(int)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(135, um.find(100));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UglyNumber#find(int)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(2304, um.find(1690));
	}
}
