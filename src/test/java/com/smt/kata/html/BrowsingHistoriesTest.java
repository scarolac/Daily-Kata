package com.smt.kata.html;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Jdk 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: BrowsingHistoriesTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the BrowsingHistories Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 6, 2022
 * @updates:
 ****************************************************************************/
class BrowsingHistoriesTest {
	
	// Members
	BrowsingHistories bh = new BrowsingHistories();
	
	/**
	 * Test method for {@link com.smt.kata.html.BrowsingHistories#findLongest(java.util.List, java.util.List)}.
	 */
	@Test
	void testFindLongestNull() throws Exception {
		List<String> res = bh.findLongest(null, null);
		assertEquals(0, res.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.BrowsingHistories#findLongest(java.util.List, java.util.List)}.
	 */
	@Test
	void testFindLongestEmpty() throws Exception {
		List<String> res = bh.findLongest(
				new ArrayList<>(), 
				new ArrayList<>());
		
		assertEquals(0, res.size());
	}

	/**
	 * Test method for {@link com.smt.kata.html.BrowsingHistories#findLongest(java.util.List, java.util.List)}.
	 */
	@Test
	void testFindLongestExampleOne() throws Exception {
		List<String> res = bh.findLongest(
				new ArrayList<>(Arrays.asList("/home", "/register", "/login", "/user", "/one", "/two")), 
				new ArrayList<>(Arrays.asList("/home", "/red", "/login", "/user", "/one", "/pink")));
		
		assertEquals(3, res.size());
		assertTrue(res.contains("/login"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.BrowsingHistories#findLongest(java.util.List, java.util.List)}.
	 */
	@Test
	void testFindLongestNoMatch() throws Exception {
		List<String> res = bh.findLongest(
				new ArrayList<>(Arrays.asList("/home", "/register", "/login", "/user", "/one", "/two")), 
				new ArrayList<>(Arrays.asList("/home1", "/red", "/login1", "/user1", "/one1", "/pink")));
		
		assertEquals(0, res.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.BrowsingHistories#findLongest(java.util.List, java.util.List)}.
	 */
	@Test
	void testFindLongestSingleFirst() throws Exception {
		List<String> res = bh.findLongest(
				new ArrayList<>(Arrays.asList("/home", "/register", "/login", "/user", "/one", "/two")), 
				new ArrayList<>(Arrays.asList("/home", "/red", "/login1", "/user1", "/one1", "/pink")));
		
		assertEquals(1, res.size());
		assertTrue(res.contains("/home"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.BrowsingHistories#findLongest(java.util.List, java.util.List)}.
	 */
	@Test
	void testFindLongestSingleLast() throws Exception {
		List<String> res = bh.findLongest(
				new ArrayList<>(Arrays.asList("/home", "/register", "/login", "/user", "/one", "/two", "/pink")), 
				new ArrayList<>(Arrays.asList("/home1", "/red", "/login1", "/user1", "/one1", "/pink")));
		
		assertEquals(1, res.size());
		assertTrue(res.contains("/pink"));
	}
}