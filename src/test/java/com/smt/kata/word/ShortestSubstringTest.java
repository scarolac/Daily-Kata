package com.smt.kata.word;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: ShortestSubstringTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Shortest Substring Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 29, 2022
 * @updates:
 ****************************************************************************/
class ShortestSubstringTest {

	// Members
	private ShortestSubstring ss = new ShortestSubstring();
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindNullWord() throws Exception {
		assertEquals("", ss.find(null, new char[]{ 'j', 'k', 'l'}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindEmptyWord() throws Exception {
		assertEquals("", ss.find("", new char[]{ 'j', 'k', 'l'}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindNullSequence() throws Exception {
		assertEquals("", ss.find("hello world", null ));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindEmptySequence() throws Exception {
		assertEquals("", ss.find("hello world", new char[]{} ));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindNoMatch() throws Exception {
		assertEquals("", ss.find("figehaeci", new char[]{ 'j', 'k', 'l'}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals("aeci", ss.find("figehaeci", new char[]{ 'a', 'e', 'i'}));
	}

	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindExampleTwoMixed() throws Exception {
		assertEquals("aeci", ss.find("figehaeci", new char[]{ 'i', 'e', 'a'}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindAllMatch() throws Exception {
		assertEquals("figehaeci", ss.find("figehaeci", new char[]{ 'i', 'e', 'a', 'f', 'i', 'h', 'g', 'c', 'e'}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindSingleMatchFirst() throws Exception {
		assertEquals("f", ss.find("figehaeci", new char[]{'f'}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ShortestSubstring#find(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testFindSingleMatchLast() throws Exception {
		assertEquals("l", ss.find("figehaecil", new char[]{'l'}));
	}
}
