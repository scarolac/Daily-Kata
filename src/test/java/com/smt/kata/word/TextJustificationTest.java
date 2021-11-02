package com.smt.kata.word;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: TextJustificationTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Unit test for the Text Justification Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Oct 29, 2021
 * @updates:
 ****************************************************************************/
class TextJustificationTest {

	// Members
	private TextJustification tj = new TextJustification();
	
	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseNull() throws Exception {
		String phrase = tj.formatPhrase(null, 16);
		assertEquals("", phrase);
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseEmpty() throws Exception {
		String phrase = tj.formatPhrase("", 16);
		assertEquals("", phrase);
	}

	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseTooLargeWord() throws Exception {
		String phrase = tj.formatPhrase("supercalifragilisticexpialidocius is the way to go", 16);
		assertEquals("", phrase);
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseExampleOne() throws Exception {
		String phrase = tj.formatPhrase("This is an example of text justification", 16);
		assertEquals("This    is    an\nexample  of text\njustification   ", phrase);
	}

	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseExampleTwo() throws Exception {
		String phrase = tj.formatPhrase("What must be acknowledgment shall be", 16);
		assertEquals("What   must   be\nacknowledgment  \nshall be        ", phrase);
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseExampleThree() throws Exception {
		String phrase = tj.formatPhrase("Science is what we understand well enough to explain to a computer. Art is everything else we do", 20);
		assertEquals("Science  is  what we\nunderstand      well\nenough to explain to\na  computer.  Art is\neverything  else  we\ndo                  ", phrase);
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseAllSingle() throws Exception {
		String phrase = tj.formatPhrase("hello world is common in code", 6);
		assertEquals("hello \nworld \nis    \ncommon\nin    \ncode  ", phrase);
	}
	
	/**
	 * Test method for {@link com.smt.kata.word.TextJustification#formatPhrase(java.lang.String, int)}.
	 */
	@Test
	void testFormatPhraseOneLine() throws Exception {
		String phrase = tj.formatPhrase("hello world is common in code", 40);
		assertEquals("hello world is common in code           ", phrase);
	}
}
