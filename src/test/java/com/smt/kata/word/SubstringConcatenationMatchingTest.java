package com.smt.kata.word;

// Junit 5
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: SubstringConcatenationMatchingTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for Substring with Concatenation of All Words Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 4, 2021
 * @updates:
 ****************************************************************************/
class SubstringConcatenationMatchingTest {
	
	// Members
	private SubstringConcatenationMatching scm = new SubstringConcatenationMatching();
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindNullPhrase() throws Exception {
		List<Integer> values = scm.find(null, new String[] {"foo","bar"});
		assertEquals(0, values.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindNullPhraseAndWords() throws Exception {
		List<Integer> values = scm.find(null, null);
		assertEquals(0, values.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindNullWords() throws Exception {
		List<Integer> values = scm.find("somethinggoeshere", null);
		assertEquals(0, values.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindEmptyPhrase() throws Exception {
		List<Integer> values = scm.find("", new String[] {"foo","bar"});
		assertEquals(0, values.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindEmptyPhraseAndWords() throws Exception {
		List<Integer> values = scm.find("", new String[0]);
		assertEquals(0, values.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindEmptyWords() throws Exception {
		List<Integer> values = scm.find("somethinggoeshere", new String[0]);
		assertEquals(0, values.size());
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		List<Integer> values = scm.find("barfoothefoobarman", new String[] {"foo","bar"});
		assertEquals(2, values.size());
		assertTrue(values.contains(0));
		assertTrue(values.contains(9));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		List<Integer> values = scm.find("wordgoodgoodgoodbestword", new String[] {"word","good","best","word"});
		assertEquals(0, values.size());
	}

	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		List<Integer> values = scm.find("barfoofoobarthefoobarman", new String[] {"bar","foo","the"});
		assertEquals(3, values.size());
		assertTrue(values.contains(6));
		assertTrue(values.contains(12));
		assertTrue(values.contains(9));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindMixedCase() throws Exception {
		List<Integer> values = scm.find("barfooFOObarthefoobarman", new String[] {"BAR","foo","tHe"});
		assertEquals(3, values.size());
		assertTrue(values.contains(6));
		assertTrue(values.contains(12));
		assertTrue(values.contains(9));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.SubstringConcatenationMatching#find(java.lang.String[])}.
	 */
	@Test
	void testFindMixedCaseNull() throws Exception {
		List<Integer> values = scm.find("barfooFOObarthefoobarman", new String[] {"BAR",null, "foo","tHe"});
		assertEquals(3, values.size());
		assertTrue(values.contains(6));
		assertTrue(values.contains(12));
		assertTrue(values.contains(9));
	}
}
