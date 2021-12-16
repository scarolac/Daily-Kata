package com.smt.kata.math;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: CommonOneBitsTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Common One Bits Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Dec 14, 2021
 * @updates:
 ****************************************************************************/
class CommonOneBitsTest {
	
	// Members
	private CommonOneBits cob = new CommonOneBits();

	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindExample() throws Exception {
		assertEquals(9, cob.find(6));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindExampleTwo() throws Exception {
		assertEquals(16, cob.find(8));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindExampleThree() throws Exception {
		assertEquals(104, cob.find(100));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindExampleFour() throws Exception {
		assertEquals(1024, cob.find(512));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindExampleFive() throws Exception {
		assertEquals(767, cob.find(511));
	}


	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindNegative() throws Exception {
		assertEquals(0, cob.find(-9));
	}
	
	/**
	 * Test method for {@link com.smt.kata.math.CommonOneBits#find(int)}.
	 */
	@Test
	void testFindTooBig() throws Exception {
		assertEquals(0, cob.find(6000));
	}


}
