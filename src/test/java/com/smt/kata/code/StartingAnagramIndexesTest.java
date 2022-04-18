package com.smt.kata.code;

//Junit 5
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: StartingAnagramIndexesTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Starting Anagram Indexes Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 17, 2022
 * @updates:
 ****************************************************************************/
class StartingAnagramIndexesTest {
	
	// Members
	private StartingAnagramIndexes sai = new StartingAnagramIndexes();
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindNullWord() throws Exception {
		List<Integer> vals = sai.find(null, "abxaba");
		assertEquals(0, vals.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindEmptyWord() throws Exception {
		List<Integer> vals = sai.find("", "abxaba");
		assertEquals(0, vals.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindNullPhrase() throws Exception {
		List<Integer> vals = sai.find("ab", null);
		assertEquals(0, vals.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindEmptyPhrase() throws Exception {
		List<Integer> vals = sai.find("ab", "");
		assertEquals(0, vals.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindWordBiggerPhrase() throws Exception {
		List<Integer> vals = sai.find("absolute", "ab");
		assertEquals(0, vals.size());
	}

	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		List<Integer> vals = sai.find("ab", "abxaba");
		assertEquals(3, vals.size());
		assertTrue(vals.contains(0));
		assertTrue(vals.contains(3));
		assertTrue(vals.contains(4));
	}

	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		List<Integer> vals = sai.find("cat", "Catch the cat in the act of tactical retreat");
		assertEquals(6, vals.size());
		assertTrue(vals.contains(0));
		assertTrue(vals.contains(10));
		assertTrue(vals.contains(21));
		assertTrue(vals.contains(29));
		assertTrue(vals.contains(1));
		assertTrue(vals.contains(28));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		List<Integer> vals = sai.find("abc", "There are many cables in the back of the unit");
		assertEquals(2, vals.size());
		assertTrue(vals.contains(15));
		assertTrue(vals.contains(29));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StartingAnagramIndexes#find(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFindWordExample4() throws Exception {
		List<Integer> vals = sai.find("hello", "there is no way this will match anything");
		assertEquals(0, vals.size());
	}
}
