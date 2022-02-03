package com.smt.kata.number;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: UniqueIntegersTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Unique Integers Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 3, 2022
 * @updates:
 ****************************************************************************/
class UniqueIntegersTest {
	
	// Members
	private UniqueIntegers ui = new UniqueIntegers();
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateNullValues() throws Exception {
		assertTrue(ui.calculate(null, 1).isEmpty());
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateEmptyValues() throws Exception {
		assertTrue(ui.calculate(new int[]{}, 1).isEmpty());
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateNegativeK() throws Exception {
		assertTrue(ui.calculate(new int[]{ 1, 2, 3}, 10).isEmpty());
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateLargeK() throws Exception {
		assertTrue(ui.calculate(new int[]{ 1, 2, 3}, -1).isEmpty());
	}

	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		List<Integer> results = ui.calculate(new int[] { 5, 5, 4 }, 1);
		assertEquals(1, results.size());
		assertTrue(results.contains(5));
	}

	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		List<Integer> results = ui.calculate(new int[] { 4, 3, 1, 1, 3, 3, 2 }, 3);
		assertEquals(2, results.size());
		assertTrue(results.contains(1));
		assertTrue(results.contains(3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		List<Integer> results = ui.calculate(new int[] { 1, 2, 3, 4, 5 }, 3);
		assertEquals(2, results.size());
		assertTrue(results.contains(1));
		assertTrue(results.contains(2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleThreeReversed() throws Exception {
		List<Integer> results = ui.calculate(new int[] { 5, 4, 3, 2, 1 }, 3);
		assertEquals(2, results.size());
		assertTrue(results.contains(1));
		assertTrue(results.contains(2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.UniqueIntegers#calculate(int[], int)}.
	 */
	@Test
	void testCalculateExampleThreeReversedDuplicates() throws Exception {
		List<Integer> results = ui.calculate(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 1 }, 3);
		assertEquals(4, results.size());
		assertTrue(results.contains(1));
		assertTrue(results.contains(2));
		assertTrue(results.contains(3));
		assertTrue(results.contains(4));
	}
}
