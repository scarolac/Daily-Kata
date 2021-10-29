package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: LongestNonRepeatingSequenceTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Longest Non-Repeating Sequence Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Oct 29, 2021
 * @updates:
 ****************************************************************************/
class LongestNonRepeatingSequenceTest {

	// Members
	private LongestNonRepeatingSequence lnrcs = new LongestNonRepeatingSequence();
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindNull() throws Exception {
		assertEquals(0, lnrcs.find(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindEmpty() throws Exception {
		assertEquals(0, lnrcs.find(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(3, lnrcs.find("abcabcbb"));
	}

	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(1, lnrcs.find("bbbbb"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(3, lnrcs.find("pwwkew"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindLastMatch() throws Exception {
		assertEquals(4, lnrcs.find("pwwker"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindSingle() throws Exception {
		assertEquals(1, lnrcs.find("l"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.LongestNonRepeatingSequence#find(java.lang.String)}.
	 */
	@Test
	void testFindLong() throws Exception {
		assertEquals(6, lnrcs.find("This is the end of the world as we know it"));
	}
}
