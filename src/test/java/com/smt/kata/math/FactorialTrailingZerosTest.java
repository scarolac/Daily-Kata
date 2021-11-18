package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: FactorialTrailingZerosTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Unit Tests for the Factorial Trailing Zeros kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
class FactorialTrailingZerosTest {
	
	// Members
	private FactorialTrailingZeros ftz = new FactorialTrailingZeros();
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateNegative() throws Exception {
		assertEquals(0, ftz.calculate(-3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateTooLarge() throws Exception {
		assertEquals(0, ftz.calculate(110));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(0, ftz.calculate(3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(1, ftz.calculate(5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		assertEquals(2, ftz.calculate(10));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateExampleFour() throws Exception {
		assertEquals(3, ftz.calculate(16));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateExampleFive() throws Exception {
		assertEquals(4, ftz.calculate(20));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.FactorialTrailingZeros#calculate(int)}.
	 */
	@Test
	void testCalculateMassive() throws Exception {
		assertEquals(24, ftz.calculate(104));
	}
}
