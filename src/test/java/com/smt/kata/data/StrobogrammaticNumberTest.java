package com.smt.kata.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: StrobogrammaticNumberTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Strobogrammatic Number Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 22, 2022
 * @updates:
 ****************************************************************************/
class StrobogrammaticNumberTest {
	/**
	 * Members
	 */
	private StrobogrammaticNumber sn = new StrobogrammaticNumber();
	
	/**
	 * Test method for {@link com.smt.kata.data.StrobogrammaticNumber#isStrobogrammaticNumber(int)}.
	 */
	@Test
	void testIsStrobogrammaticNumberNegative() throws Exception {
		assertFalse(sn.isStrobogrammaticNumber(-16891));
	}

	/**
	 * Test method for {@link com.smt.kata.data.StrobogrammaticNumber#isStrobogrammaticNumber(int)}.
	 */
	@Test
	void testIsStrobogrammaticNumberExampleOne() throws Exception {
		assertTrue(sn.isStrobogrammaticNumber(16891));
	}

	/**
	 * Test method for {@link com.smt.kata.data.StrobogrammaticNumber#isStrobogrammaticNumber(int)}.
	 */
	@Test
	void testIsStrobogrammaticNumberExampleTwo() throws Exception {
		assertFalse(sn.isStrobogrammaticNumber(99999));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.StrobogrammaticNumber#isStrobogrammaticNumber(int)}.
	 */
	@Test
	void testIsStrobogrammaticNumberExampleThree() throws Exception {
		assertTrue(sn.isStrobogrammaticNumber(8888));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.StrobogrammaticNumber#isStrobogrammaticNumber(int)}.
	 */
	@Test
	void testIsStrobogrammaticNumberExampleFour() throws Exception {
		assertTrue(sn.isStrobogrammaticNumber(101010101));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.StrobogrammaticNumber#isStrobogrammaticNumber(int)}.
	 */
	@Test
	void testIsStrobogrammaticNumberExampleFive() throws Exception {
		assertFalse(sn.isStrobogrammaticNumber(12345));
	}
}
