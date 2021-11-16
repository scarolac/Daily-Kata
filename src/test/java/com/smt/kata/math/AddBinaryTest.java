package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: AddBinaryTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit Tests for the Add Binary Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 15, 2021
 * @updates:
 ****************************************************************************/
class AddBinaryTest {
	
	// Members
	private AddBinary ab = new AddBinary();
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryNullFirst() throws Exception {
		assertEquals("0", ab.addBinary(null, "1"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryNullSecond() throws Exception {
		assertEquals("0", ab.addBinary("1", null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryBothNull() throws Exception {
		assertEquals("0", ab.addBinary(null, null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryEmptyFirst() throws Exception {
		assertEquals("0", ab.addBinary("", "1"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryEmptySecond() throws Exception {
		assertEquals("0", ab.addBinary("1", ""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryBothEmpty() throws Exception {
		assertEquals("0", ab.addBinary("", ""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryLetters() throws Exception {
		assertEquals("0", ab.addBinary("10", "LL"));
	}

	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryExampleOne() throws Exception {
		assertEquals("100", ab.addBinary("11", "1"));
	}

	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryExampleTwo() throws Exception {
		assertEquals("10101", ab.addBinary("1010", "1011"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.AddBinary#addBinary(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testAddBinaryConvertDecimals() throws Exception {
		assertEquals("0", ab.addBinary("3", "4"));
	}
}
