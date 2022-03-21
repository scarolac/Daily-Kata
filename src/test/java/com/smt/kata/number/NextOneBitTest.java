package com.smt.kata.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: NextOneBitTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 21, 2022
 * @updates:
 ****************************************************************************/
class NextOneBitTest {
	
	// Members
	private NextOneBit nob = new NextOneBit();
	
	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateNull() throws Exception {
		assertEquals("", nob.calculate(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateEmpty() throws Exception {
		assertEquals("", nob.calculate(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateNotBinary() throws Exception {
		assertEquals("", nob.calculate("12345"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals("1001", nob.calculate("0110"));
	}
	
	
	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals("10111", nob.calculate("1111"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		assertEquals("1000000000000", nob.calculate("100000000000"));
	}

	/**
	 * Test method for {@link com.smt.kata.number.NextOneBit#calculate(java.lang.String)}.
	 */
	@Test
	void testCalculateExampleFour() throws Exception {
		assertEquals("1011111111111", nob.calculate("111111111111"));
	}
}
