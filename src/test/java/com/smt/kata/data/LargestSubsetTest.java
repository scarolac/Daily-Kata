package com.smt.kata.data;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: LargestSubsetTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Test for the Largest Subset Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 27, 2022
 * @updates:
 ****************************************************************************/
class LargestSubsetTest {
	
	// Members
	private LargestSubset ls = new LargestSubset();
	
	/**
	 * Test method for {@link com.smt.kata.data.LargestSubset#find(java.util.List)}.
	 */
	@Test
	void testFindEmpty() throws Exception {
		List<Integer> results = ls.find(new ArrayList<>());
		assertEquals(0, results.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LargestSubset#find(java.util.List)}.
	 */
	@Test
	void testFindNull() throws Exception {
		List<Integer> results = ls.find(null);
		assertEquals(0, results.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LargestSubset#find(java.util.List)}.
	 */
	@Test
	void testFindSingle() throws Exception {
		List<Integer> results = ls.find(new ArrayList<>(Arrays.asList(3)));
		assertEquals(0, results.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LargestSubset#find(java.util.List)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		List<Integer> results = ls.find(new ArrayList<>(Arrays.asList(3, 5, 10, 20, 21)));
		assertEquals(3, results.size());
		assertTrue(results.contains(5));
		assertTrue(results.contains(10));
		assertTrue(results.contains(20));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LargestSubset#find(java.util.List)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		List<Integer> results = ls.find(new ArrayList<>(Arrays.asList(1, 3, 6, 24)));
		assertEquals(4, results.size());
		assertTrue(results.contains(1));
		assertTrue(results.contains(3));
		assertTrue(results.contains(6));
		assertTrue(results.contains(24));
	}

}
