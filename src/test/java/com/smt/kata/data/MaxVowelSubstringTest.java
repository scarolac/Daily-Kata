package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MaxVowelSubstringTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Unit test for Max Vowel Substring Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 2, 2021
 * @updates:
 ****************************************************************************/
class MaxVowelSubstringTest {
	
	// Members
	private MaxVowelSubstring mvs = new MaxVowelSubstring();
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindEmptyWord() throws Exception {
		assertEquals(0, mvs.find("", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindNullWord() throws Exception {
		assertEquals(0, mvs.find(null, 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindSmallK() throws Exception {
		assertEquals(0, mvs.find("hello", -1));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindLargeK() throws Exception {
		assertEquals(0, mvs.find("hello", 24));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(3, mvs.find("abciiidef", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(2, mvs.find("aeiou", 2));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(2, mvs.find("leetcode", 3));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		assertEquals(0, mvs.find("rhythms", 4));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxVowelSubstring#find(java.lang.String, int)}.
	 */
	@Test
	void testFindExampleFive() throws Exception {
		assertEquals(1, mvs.find("tryhard", 4));
	}

}
