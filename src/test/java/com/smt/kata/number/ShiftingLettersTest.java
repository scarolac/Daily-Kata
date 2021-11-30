package com.smt.kata.number;

//Junit 5
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

/****************************************************************************
 * <b>Title</b>: ShiftingLettersTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
class ShiftingLettersTest {

	// Members
	private ShiftingLetters sl = new ShiftingLetters();
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformnNullSource() throws Exception {
		assertNull(sl.transform(null, new int[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformnNullShift() throws Exception {
		assertEquals("abc", sl.transform("abc", null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformEmptySource() throws Exception {
		assertEquals("", sl.transform("", new int[]{1,2,3}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformInvalid() throws Exception {
		assertEquals("123abc", sl.transform("123abc", new int[]{1,2,3}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformNoShifts() throws Exception {
		assertEquals("abc", sl.transform("abc", new int[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformExampleOne() throws Exception {
		assertEquals("rpl", sl.transform("abc", new int[]{ 3,5,9}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformExampleTwo() throws Exception {
		assertEquals("gfd", sl.transform("aaa", new int[]{ 1,2,3}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformExampleThree() throws Exception {
		assertEquals("jif", sl.transform("xyz", new int[]{ 2, 4, 6}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.number.ShiftingLetters#transform(java.lang.String, int[])}.
	 */
	@Test
	void testTransformMixedCase() throws Exception {
		assertEquals("jif", sl.transform("XyZ", new int[]{ 2, 4, 6}));
	}

}
