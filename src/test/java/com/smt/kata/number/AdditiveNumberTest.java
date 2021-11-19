package com.smt.kata.number;

// Junit 5
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: AdditiveNumberTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 18, 2021
 * @updates:
 ****************************************************************************/
class AdditiveNumberTest {
	
	// Members
	private AdditiveNumber an = new AdditiveNumber();

	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveNull() throws Exception {
		assertFalse(an.isAdditive(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveEmpty() throws Exception {
		assertFalse(an.isAdditive(""));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveInvalidChars() throws Exception {
		assertFalse(an.isAdditive("12345t56y8"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveTooSmall() throws Exception {
		assertFalse(an.isAdditive("12"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveSmall() throws Exception {
		assertTrue(an.isAdditive("123"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveExampleOne() throws Exception {
		assertTrue(an.isAdditive("112358"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveExampleTwo() throws Exception {
		assertTrue(an.isAdditive("199100199"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveExampleThree() throws Exception {
		assertTrue(an.isAdditive("991100101"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveExampleFour() throws Exception {
		assertTrue(an.isAdditive("101020305080"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveInvalid() throws Exception {
		assertFalse(an.isAdditive("991100199"));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.AdditiveNumber#isAdditive(int[])}.
	 */
	@Test
	void testIsAdditiveInvalidAgain() throws Exception {
		assertFalse(an.isAdditive("1235812"));
	}
}
