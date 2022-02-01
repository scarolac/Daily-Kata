package com.smt.kata.letters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: ReorderLettersTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 31, 2022
 * @updates:
 ****************************************************************************/
class ReorderLettersTest {
	
	// Members
	private ReorderLetters rl = new ReorderLetters();

	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessNull() throws Exception {
		assertEquals("", rl.process(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessEmpty() throws Exception {
		assertEquals("", rl.process(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessExampleOne() throws Exception {
		assertEquals("eettw", rl.process("tweet"));
	}

	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessExampleTwo() throws Exception {
		assertEquals("llloodehrw", rl.process("helloworld"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessMixedCase() throws Exception {
		assertEquals("ETetw", rl.process("TwEet"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessSingleLetter() throws Exception {
		assertEquals("a", rl.process("a"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.letters.ReorderLetters#process(java.lang.String)}.
	 */
	@Test
	void testProcessLongWithSpaces() throws Exception {
		assertEquals("       ooooootttteeeuuuaarrss!,bcfhklwy", rl.process("for those about to rock, we salute you!"));
	}
}
