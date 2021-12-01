package com.smt.kata.code;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: StringWindowTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the String Window kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
class StringWindowTest {
	
	// Members
	private StringWindow sw = new StringWindow();
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindNull() throws Exception {
		assertEquals(0, sw.find(null));
	}

	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindEmpty() throws Exception {
		assertEquals(0, sw.find(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(5, sw.find("jiujitsu"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindExampleOneMixedCase() throws Exception {
		assertEquals(5, sw.find("JiujItsu"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindAllUnique() throws Exception {
		assertEquals(6, sw.find("bedlam"));
	}

	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindSameSize() throws Exception {
		assertEquals(8, sw.find("bettered"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindSmall() throws Exception {
		assertEquals(2, sw.find("hahaha"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindSingle() throws Exception {
		assertEquals(1, sw.find("aa"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindSentence() throws Exception {
		assertEquals(36, sw.find("for those about to rock, we salute you"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.StringWindow#find(java.lang.String)}.
	 */
	@Test
	void testFindMixedChars() throws Exception {
		assertEquals(14, sw.find("j4m3s&m4ryc4m1r3"));
	}
}
