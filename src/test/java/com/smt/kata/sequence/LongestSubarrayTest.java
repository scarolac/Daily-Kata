package com.smt.kata.sequence;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: LongestSubarrayTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Longest Subarray Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 18, 2022
 * @updates:
 ****************************************************************************/
class LongestSubarrayTest {
	
	// Members
	private LongestSubarray ls = new LongestSubarray();

	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindNullData() throws Exception {
		assertEquals(0, ls.find(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindEmptyData() throws Exception {
		assertEquals(0, ls.find(new int[] {}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(5, ls.find(new int[]{5, 1, 3, 5, 2, 3, 4, 1}));
	}

	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(10, ls.find(new int[]{1,2,3,4,5,6,7,8,9,10}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(1, ls.find(new int[]{1}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		assertEquals(1, ls.find(new int[]{1, 1, 1, 1, 1}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindExampleFive() throws Exception {
		assertEquals(2, ls.find(new int[]{1, 2}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.sequence.LongestSubarray#find(int[])}.
	 */
	@Test
	void testFindExampleSix() throws Exception {
		assertEquals(2, ls.find(new int[]{1, 1,2,2,3,3,4,4,5,5,5,5,6,6,7,7,8,8,8,8,8}));
	}
}
