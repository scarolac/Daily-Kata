package com.smt.kata.money;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MinimumChangeReceivedTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Test for the Minimum Change Received Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 3, 2022
 * @updates:
 ****************************************************************************/
class MinimumChangeReceivedTest {
	
	// Memebrs
	private MinimumChangeReceived mcr = new MinimumChangeReceived();
	
	/**
	 * Test method for {@link com.smt.kata.money.MinimumChangeReceived#calculate(double)}.
	 */
	@Test
	void testCalculateNegativeChange() throws Exception {
		assertEquals(0, mcr.calculate(-.16));
	}

	/**
	 * Test method for {@link com.smt.kata.money.MinimumChangeReceived#calculate(double)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(3, mcr.calculate(.16));
	}

	/**
	 * Test method for {@link com.smt.kata.money.MinimumChangeReceived#calculate(double)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(18, mcr.calculate(3.87));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.MinimumChangeReceived#calculate(double)}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		assertEquals(1, mcr.calculate(.01));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.MinimumChangeReceived#calculate(double)}.
	 */
	@Test
	void testCalculateExampleFour() throws Exception {
		assertEquals(0, mcr.calculate(.00));
	}
	
	/**
	 * Test method for {@link com.smt.kata.money.MinimumChangeReceived#calculate(double)}.
	 */
	@Test
	void testCalculateExtremelyLarge() throws Exception {
		assertEquals(617, mcr.calculate(153.33));
	}
}
