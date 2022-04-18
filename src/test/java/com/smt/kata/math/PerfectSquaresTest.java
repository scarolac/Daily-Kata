package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: PerfectSquaresTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Test for the Perfect Squares Kate
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 15, 2022
 * @updates:
 ****************************************************************************/
class PerfectSquaresTest {

	// Members
	private PerfectSquares ps = new PerfectSquares();
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleOne() throws Exception {
		assertEquals(1, ps.findSmallestNumber(4));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleTwo() throws Exception {
		assertEquals(2, ps.findSmallestNumber(17));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleThree() throws Exception {
		assertEquals(2, ps.findSmallestNumber(18));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleFour() throws Exception {
		assertEquals(2, ps.findSmallestNumber(45));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleFive() throws Exception {
		assertEquals(4, ps.findSmallestNumber(47));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleSix() throws Exception {
		assertEquals(4, ps.findSmallestNumber(43));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleSeven() throws Exception {
		assertEquals(3, ps.findSmallestNumber(48));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleComplex() throws Exception {
		assertEquals(4, ps.findSmallestNumber(1223));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.PerfectSquares#findSmallestNumber(int)}.
	 */
	@Test
	void testFindSmallestNumberExampleAll9s() throws Exception {
		assertEquals(4, ps.findSmallestNumber(999));
	}
}
