package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SplitBinaryStringTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Split Binary String Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 3, 2022
 * @updates:
 ****************************************************************************/
class SplitBinaryStringTest {
	
	// Members
	private SplitBinaryString sbs = new SplitBinaryString();
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitNull() throws Exception {
		assertEquals(0, sbs.split(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitEmpty() throws Exception {
		assertEquals(0, sbs.split(""));
	}

	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleOne() throws Exception {
		assertEquals(4, sbs.split("10101"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleShort() throws Exception {
		assertEquals(0, sbs.split("10"));
	}

	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleTwo() throws Exception {
		assertEquals(0, sbs.split("1001"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleNumber() throws Exception {
		assertEquals(0, sbs.split("101021"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleLetters() throws Exception {
		assertEquals(0, sbs.split("101L01"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleThree() throws Exception {
		assertEquals(0, sbs.split("0000"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.SplitBinaryString#split(java.lang.String)}.
	 */
	@Test
	void testSplitExampleFour() throws Exception {
		assertEquals(1, sbs.split("111"));
	}
}
