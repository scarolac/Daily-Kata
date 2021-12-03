package com.smt.kata.word;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: RearrangeWordsByLengthTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Rearrange Words By Length Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 2, 2021
 * @updates:
 ****************************************************************************/
class RearrangeWordsByLengthTest {

	// Members
	private RearrangeWordsByLength rwbl = new RearrangeWordsByLength();
	
	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortNullPhrase() throws Exception {
		assertEquals("", rwbl.sort(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortEmptyPhrase() throws Exception {
		assertEquals("", rwbl.sort(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortExampleOne() throws Exception {
		assertEquals("Is cool leetcode", rwbl.sort("Leetcode is cool"));
	}

	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortExampleTwo() throws Exception {
		assertEquals("On and keep calm code", rwbl.sort("Keep calm and code on"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortExampleThree() throws Exception {
		assertEquals("To be or to be not", rwbl.sort("To be or not to be"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortSingleWord() throws Exception {
		assertEquals("Technology", rwbl.sort("Technology"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.RearrangeWordsByLength#sort(java.lang.String)}.
	 */
	@Test
	void testSortRepeatedWords() throws Exception {
		assertEquals("One two one two three three", rwbl.sort("One two three One two three"));
	}
}
