package com.smt.kata.game;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: HouseRobberTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the House Robber Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 17, 2021
 * @updates:
 ****************************************************************************/
class HouseRobberTest {
	
	// Members
	private HouseRobber hr = new HouseRobber();
	
	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateNull() throws Exception {
		assertEquals(0, hr.calculate(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateEmpty() throws Exception {
		assertEquals(0, hr.calculate(new int[0]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateSingle() throws Exception {
		assertEquals(5, hr.calculate(new int[] { 5 } ));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateDouble() throws Exception {
		assertEquals(5, hr.calculate(new int[] { 5, 1 } ));
	}

	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		assertEquals(4, hr.calculate(new int[] {1, 2, 3, 1} ));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleOne2() throws Exception {
		assertEquals(4, hr.calculate(new int[] {1, 0, 1, 3} ));
	}

	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		assertEquals(12, hr.calculate(new int[] {2, 7, 9, 3 , 1} ));
	}
	
	/**
	 * Test method for {@link com.smt.kata.game.HouseRobber#calculate(int[])}.
	 */
	@Test
	void testCalculateExampleStarttwo() throws Exception {
		assertEquals(16, hr.calculate(new int[] {2, 7, 3, 9, 1} ));
	}

}
