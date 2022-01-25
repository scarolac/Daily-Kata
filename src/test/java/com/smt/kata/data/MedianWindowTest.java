package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MedianWindowTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Median Window Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 24, 2022
 * @updates:
 ****************************************************************************/
class MedianWindowTest {
	
	// Members
	private MedianWindow mw = new MedianWindow();
	
	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowNull() throws Exception {
		assertEquals(0, mw.calculateMedianFromWindow(null, 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowEmpty() throws Exception {
		assertEquals(0, mw.calculateMedianFromWindow(new int[] {}, 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowWindowLarger() throws Exception {
		assertEquals(0, mw.calculateMedianFromWindow(new int[] {-1, 5, 13, 8, 2, 3, 3, 1}, 13));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowWindowNegative() throws Exception {
		assertEquals(0, mw.calculateMedianFromWindow(new int[] {-1, 5, 13, 8, 2, 3, 3, 1}, -3));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowExampleOne() throws Exception {
		assertEquals(4, mw.calculateMedianFromWindow(new int[] {-1, 5, 13, 8, 2, 3, 3, 1}, 3));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowExampleTwo() throws Exception {
		assertEquals(6, mw.calculateMedianFromWindow(new int[] {1, 2,3,4,5,6,7,8,9,11,12,13}, 5));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MedianWindow#calculateMedianFromWindow(int[], int)}.
	 */
	@Test
	void testCalculateMedianFromWindowExampleThree() throws Exception {
		assertEquals(2, mw.calculateMedianFromWindow(new int[] {1,2,3,1,2,3,1,2,3,1,2,3}, 3));
	}

}
