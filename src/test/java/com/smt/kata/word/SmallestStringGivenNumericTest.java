package com.smt.kata.word;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SmallestStringGivenNumericTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Smallest String Given Numeric Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 29, 2022
 * @updates:
 ****************************************************************************/
class SmallestStringGivenNumericTest {
	
	// Member
	private SmallestStringGivenNumeric ssgn = new SmallestStringGivenNumeric();

	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringNegCount() throws Exception {
		assertEquals("", ssgn.getSmallestString(-3, 27));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringNegValue() throws Exception {
		assertEquals("", ssgn.getSmallestString(3, -27));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringSmallValue() throws Exception {
		assertEquals("", ssgn.getSmallestString(5, 4));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringExampleOne() throws Exception {
		assertEquals("aay", ssgn.getSmallestString(3, 27));
	}

	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringExampleTwo() throws Exception {
		assertEquals("aaszz", ssgn.getSmallestString(5, 73));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringExampleThree() throws Exception {
		assertEquals("aaszz", ssgn.getSmallestString(5, 73));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SmallestStringGivenNumeric#getSmallestString(int, int)}.
	 */
	@Test
	void testGetSmallestStringExampleFour() throws Exception {
		assertEquals("aaf", ssgn.getSmallestString(3, 8));
	}
}
