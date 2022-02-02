package com.smt.kata.html;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
// JDK 11.x
import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: EmboldenPhraseTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Unit tests for the Embolden Phrase Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 31, 2022
 * @updates:
 ****************************************************************************/
class EmboldenPhraseTest {
	
	// Members
	private EmboldenPhrase ep = new EmboldenPhrase();
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenNullPhrase() throws Exception {
		assertEquals("", ep.embolden(null, Arrays.asList("red")));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenEmptyPhrase() throws Exception {
		assertEquals("", ep.embolden("", Arrays.asList("red")));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenNullWords() throws Exception {
		assertEquals("helloworld", ep.embolden("helloworld", null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenEmptyWords() throws Exception {
		assertEquals("helloworld", ep.embolden("helloworld", new ArrayList<String>()));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenSimple() throws Exception {
		assertEquals("<b>red</b>", ep.embolden("red", Arrays.asList("red")));
	}

	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenExampleOne() throws Exception {
		assertEquals("a<b>bc</b>d<b>ef</b>g", ep.embolden("abcdefg", Arrays.asList("bc","ef")));
	}

	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenExampleTwo() throws Exception {
		assertEquals("a<b>bcdef</b>g", ep.embolden("abcdefg", Arrays.asList("bcd","def")));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenExampleThree() throws Exception {
		assertEquals("a<b>defcd</b>fg", ep.embolden("adefcdfg", Arrays.asList("fcd","def")));
	}
	
	/**
	 * Test method for {@link com.smt.kata.html.EmboldenPhrase#embolden(java.lang.String, java.util.List)}.
	 */
	@Test
	void testEmboldenExampleFour() throws Exception {
		assertEquals("<b>def</b><b>defcd</b>f<b>fcd</b>g", ep.embolden("defdefcdffcdg", Arrays.asList("fcd","def")));
	}
}
