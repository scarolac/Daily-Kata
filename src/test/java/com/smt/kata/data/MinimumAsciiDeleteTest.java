package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MinimumAsciiDeleteTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 19, 2021
 * @updates:
 ****************************************************************************/
class MinimumAsciiDeleteTest {

	// Members
	private MinimumAsciiDelete mad = new MinimumAsciiDelete();
	
	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValueEmpty() throws Exception {
		assertEquals(0, mad.getMinumumValue("", ""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValueOneEmpty() throws Exception {
		assertEquals(532, mad.getMinumumValue("hello", ""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValueExampleOne() throws Exception {
		assertEquals(231, mad.getMinumumValue("sea", "eat"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValueExampleTwo() throws Exception {
		assertEquals(1258, mad.getMinumumValue("balloon", "creed"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValueAllSame() throws Exception {
		assertEquals(0, mad.getMinumumValue("balloon", "balloon"));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValuelong() throws Exception {
		assertEquals(1086, mad.getMinumumValue("for those about to rock", "we salute you"));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MinimumAsciiDelete#getMinumumValue(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGetMinumumValueSmall() throws Exception {
		assertEquals(198, mad.getMinumumValue("a", "e"));
	}
	
}
