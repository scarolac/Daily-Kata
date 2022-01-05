package com.smt.kata.code;

// junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: SoundexConverterTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Soundex Converter kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 3, 2022
 * @updates:
 ****************************************************************************/
class SoundexConverterTest {
	
	// Members
	private SoundexConverter sc = new SoundexConverter();
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertNull() throws Exception {
		assertEquals("", sc.convert(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertEmpty() throws Exception {
		assertEquals("", sc.convert(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertNumbers() throws Exception {
		assertEquals("", sc.convert("hello56"));
	}

	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertExampleOne() throws Exception {
		assertEquals("H252", sc.convert("higgins"));
	}

	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertExampleTwo() throws Exception {
		assertEquals("W252", sc.convert("washington"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertExampleThree() throws Exception {
		assertEquals("G410", sc.convert("GOLF"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertExampleFour() throws Exception {
		assertEquals("C560", sc.convert("camire"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertAllVowels() throws Exception {
		assertEquals("A000", sc.convert("away"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertNoVowels() throws Exception {
		assertEquals("B423", sc.convert("blktnr"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertShort() throws Exception {
		assertEquals("I000", sc.convert("I"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.SoundexConverter#convert(java.lang.String)}.
	 */
	@Test
	void testConvertAllSame() throws Exception {
		assertEquals("G400", sc.convert("GLLLLLLLLLLLLLLLLLLL"));
	}
}
