package com.smt.kata.number;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: XORManiaTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the XOR Mania Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 6, 2021
 * @updates:
 ****************************************************************************/
class XORManiaTest {
	
	// Members
	private XORMania xm = new XORMania();

	/**
	 * Test method for {@link com.smt.kata.number.XORMania#findMatches(int, int)}.
	 */
	@Test
	void testFindMatchesExampleOne() throws Exception {
		assertEquals(4, xm.findMatches(5,5));
	}

	/**
	 * Test method for {@link com.smt.kata.number.XORMania#findMatches(int, int)}.
	 */
	@Test
	void testFindMatchesExampleTwo() throws Exception {
		assertEquals(4, xm.findMatches(20, 20));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.XORMania#findMatches(int, int)}.
	 */
	@Test
	void testFindMatchesExampleThree() throws Exception {
		assertEquals(16, xm.findMatches(77,77));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.XORMania#findMatches(int, int)}.
	 */
	@Test
	void testFindMatchesExampleFour() throws Exception {
		assertEquals(0, xm.findMatches(100, 10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.XORMania#findMatches(int, int)}.
	 */
	@Test
	void testFindMatchesExampleFive() throws Exception {
		assertEquals(4, xm.findMatches(20, 18));
	}
}
