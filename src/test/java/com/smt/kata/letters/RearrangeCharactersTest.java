package com.smt.kata.letters;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Jdk 11.x
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: RearrangeCharactersTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Rearrange Characters Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 27, 2022
 * @updates:
 ****************************************************************************/
class RearrangeCharactersTest {
	
	// Members
	private RearrangeCharacters rc = new RearrangeCharacters();

	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeExampleOne() throws Exception {
		assertEquals("yzy", rc.arrange("yyz"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeExampleTwo() throws Exception {
		List<String> possible = Arrays.asList(new String[]{"lordewhlol", "lololrdewh"});
		String res = rc.arrange("helloworld");
		assertTrue(possible.contains(res));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeEmpty() throws Exception {
		assertEquals("", rc.arrange(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeNull() throws Exception {
		assertEquals("", rc.arrange(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeSingle() throws Exception {
		assertEquals("a", rc.arrange("a"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeAllSame() throws Exception {
		assertEquals("", rc.arrange("aaaaaaaa"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeLong() throws Exception {
		List<String> possible = Arrays.asList(new String[]{"ababababababababfgfgcde"});
		String res = rc.arrange("aabbaabbaabbaabbcdeffgg");
		assertTrue(possible.contains(res));
	}

	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeExamplethree() throws Exception {
		List<String> possible = Arrays.asList(new String[]{"lalrldewho"});
		String res = rc.arrange("hellaworld");
		assertTrue(possible.contains(res));
	}
	

	/**
	 * Test method for {@link com.smt.kata.letters.RearrangeCharacters#arrange(java.lang.String)}.
	 */
	@Test
	void testArrangeNoDups() throws Exception {
		List<String> possible = Arrays.asList(new String[]{"abcdefghijklmnopqrstuvwxyz"});
		String res = rc.arrange("abcdefghijklmnopqrstuvwxyz");
		assertTrue(possible.contains(res));
	}
}
