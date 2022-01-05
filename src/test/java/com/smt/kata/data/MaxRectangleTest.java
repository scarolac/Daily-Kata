package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MaxRectangleTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Max Rectangle Kata
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 4, 2022
 * @updates:
 ****************************************************************************/
class MaxRectangleTest {
	
	// Members
	private MaxRectangle mr = new MaxRectangle();
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindNull() throws Exception {
		assertEquals(0, mr.find(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindEmpty() throws Exception {
		assertEquals(0, mr.find(new int[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindNegative() throws Exception {
		assertEquals(6, mr.find(new int[]{1 ,-3, 2, 5}));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals(6, mr.find(new int[]{1 ,3, 2, 5}));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(16, mr.find(new int[]{4, 4, 4, 4}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(15, mr.find(new int[]{10, 1, 13, 1, 14, 1, 15}));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindAllOnes() throws Exception {
		assertEquals(5, mr.find(new int[]{1, 1, 1, 1, 1}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxRectangle#find(int[])}.
	 */
	@Test
	void testFindSingle() throws Exception {
		assertEquals(5, mr.find(new int[]{5}));
	}
}
