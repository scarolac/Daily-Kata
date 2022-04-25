package com.smt.kata.distance;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: CountMatrixPathsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> unit tests for the Count Matrix Paths Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 18, 2022
 * @updates:
 ****************************************************************************/
class CountMatrixPathsTest {
	
	// Members
	private CountMatrixPaths cmp = new CountMatrixPaths();
	
	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountNegativeRows() throws Exception {
		assertEquals(0, cmp.count(-2, 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountNegativeColumns() throws Exception {
		assertEquals(0, cmp.count(2, -2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountOneByOne() throws Exception {
		assertEquals(1, cmp.count(1,1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountZeroByZero() throws Exception {
		assertEquals(0, cmp.count(0, 0));
	}

	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountExampleOne() throws Exception {
		assertEquals(2, cmp.count(2, 2));
	}

	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountExampleTwo() throws Exception {
		assertEquals(70, cmp.count(5, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.distance.CountMatrixPaths#count(int, int)}.
	 */
	@Test
	void testCountExampleThree() throws Exception {
		assertEquals(48620, cmp.count(10, 10));
	}
}
