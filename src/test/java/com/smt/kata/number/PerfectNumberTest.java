package com.smt.kata.number;

// Junit 5.x
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: PerfectNumberTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Perfect Number kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 16, 2022
 * @updates:
 ****************************************************************************/
class PerfectNumberTest {
	
	// Members
	private PerfectNumber pn = new PerfectNumber();
	
	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindNegative() throws Exception {
		assertEquals(0, pn.find(-10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindZero() throws Exception {
		assertEquals(0, pn.find(0));
	}

	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(19, pn.find(1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(28, pn.find(2));
	}

	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(154, pn.find(15));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		assertEquals(5320, pn.find(245));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindExampleFive() throws Exception {
		assertEquals(222022, pn.find(2048));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.PerfectNumber#find(int)}.
	 */
	@Test
	void testFindETooBig() throws Exception {
		assertEquals(100121410, pn.find(20488));
	}
}
