package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: MaxPointsOnLineTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Max Points on a Line Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 12, 2021
 * @updates:
 ****************************************************************************/
class MaxPointsOnLineTest {
	
	// Members
	private MaxPointsOnLine mpol = new MaxPointsOnLine();

	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxNull() throws Exception {
		assertEquals(0, mpol.findMax(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxEmpty() throws Exception {
		assertEquals(0, mpol.findMax(new int[0][]));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxVerticalWithNull() throws Exception {
		assertEquals(3, mpol.findMax(new int[][] {{0,2}, {1,2}, {2,2}, null, {0,0}}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxVerticalWithAndDuplicates() throws Exception {
		assertEquals(3, mpol.findMax(new int[][] {{0,2}, {1,2}, {2,2}, null, {0,2}, {1,2}, {2,2}, {0,0}}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxVertical() throws Exception {
		assertEquals(3, mpol.findMax(new int[][] {{0,2}, {1,2}, {2,2}, {0,0}}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxHorizontal() throws Exception {
		assertEquals(4, mpol.findMax(new int[][] {{2, 2}, {2, 3}, {2, 4}, {2, 5}, {0,0}}));
	}

	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxExampleOne() throws Exception {
		assertEquals(3, mpol.findMax(new int[][] {{1,1}, {2, 2}, {3,3}}));
	}
	
	/**
	 * Test method for {@link com.smt.kata.data.MaxPointsOnLine#findMax(int[][])}.
	 */
	@Test
	void testFindMaxExampleTwo() throws Exception {
		assertEquals(4, mpol.findMax(new int[][] {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));
	}
}
