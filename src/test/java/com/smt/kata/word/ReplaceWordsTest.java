package com.smt.kata.word;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: ReplaceWordsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Replace Words Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 29, 2021
 * @updates:
 ****************************************************************************/
class ReplaceWordsTest {
	
	// Members
	private ReplaceWords rw = new ReplaceWords();
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateNullPhrase() throws Exception {
		assertEquals("", rw.update(null, new String[] { "cat","bat","rat" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateEmptyPhrase() throws Exception {
		assertEquals("", rw.update("", new String[] { "cat","bat","rat" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateNullRoot() throws Exception {
		assertEquals("", rw.update("hello world", null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateNullEntryRoot() throws Exception {
		assertEquals("the bat cat rat when shook", rw.update("the battery catalog rattled when shook ", new String[] { "cat","bat",null,"rat" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateEmptyRoot() throws Exception {
		assertEquals("", rw.update("hello world", new String[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateNullBoth() throws Exception {
		assertEquals("", rw.update(null, null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateEmptyBoth() throws Exception {
		assertEquals("", rw.update("", new String[0]));
	}

	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateExampleOne() throws Exception {
		assertEquals("the cat was rat by the bat", rw.update("the cattle was rattled by the battery", new String[] { "cat","bat","rat" }));
	}

	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateExampleTwo() throws Exception {
		assertEquals("a a b c", rw.update("aadsfasf absbs bbab cadsfafs", new String[] { "a","b","c" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateExampleThree() throws Exception {
		assertEquals("a a a a a a a a bbb baba a", rw.update("a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa", new String[] { "a", "aa", "aaa", "aaaa" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateExampleThreeReversed() throws Exception {
		assertEquals("a a a a a a a a bbb baba a", rw.update("a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa", new String[] { "aaaa", "aaa", "aa", "a" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateExampleFour() throws Exception {
		assertEquals("the cat was rat by the bat", rw.update("the cattle was rattled by the battery", new String[] { "catt","cat","bat","rat" }));
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.ReplaceWords#update(java.lang.String, java.lang.String[])}.
	 */
	@Test
	void testUpdateExampleFive() throws Exception {
		assertEquals("it is ab that this solution is ac", rw.update("it is abnormal that this solution is accepted", new String[] { "ac","ab" }));
	}
}
