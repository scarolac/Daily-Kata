package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MedianSortedArraysTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for Median of Two Sorted Arrays Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 2, 2021
 * @updates:
 ****************************************************************************/
class MedianSortedArraysTest {

	// Members
	private MedianSortedArrays msa = new MedianSortedArrays();
	
	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateFirstNull() throws Exception {
		assertEquals(0, msa.calculate(null, new int[] { 2 }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateSecondNull() throws Exception {
		assertEquals(0, msa.calculate(new int[] { 2 }, null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(2, msa.calculate(new int[] { 1, 3 }, new int[] { 2 }));
	}

	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(2.5, msa.calculate(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateExampleThree() throws Exception {
		assertEquals(0, msa.calculate(new int[] { 0, 0 }, new int[] { 0, 0 }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateExampleFour() throws Exception {
		assertEquals(1, msa.calculate(new int[0], new int[] { 1 }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.MedianSortedArrays#calculate(int[], int[])}.
	 */
	@Test
	void testCalculateExampleFive() throws Exception {
		assertEquals(0, msa.calculate(new int[0], new int[0]));
	}
}
