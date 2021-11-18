package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: LargestNumberTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Largest Number Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
class LargestNumberTest {

	// Members
	private LargestNumber ln = new LargestNumber();
	
	/**
	 * Test method for {@link com.smt.kata.math.LargestNumber#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleOne() throws Exception {
		assertEquals("210", ln.find(new int[] {10,2}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.LargestNumber#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals("9534330", ln.find(new int[] {3,30,34,5,9}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.LargestNumber#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals("10", ln.find(new int[] {10}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.LargestNumber#find(java.lang.String[])}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		assertEquals("9385433311", ln.find(new int[] {11,8,3,4,93,5,33}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.LargestNumber#find(java.lang.String[])}.
	 */
	@Test
	void testFindVeryLarge() throws Exception {
		assertEquals("5555544444333332222211111", ln.find(new int[] {11111,22222,33333,44444,55555}));
	}

}
