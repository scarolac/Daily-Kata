package com.smt.kata.code;

// Junit 5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/****************************************************************************
 * <b>Title</b>: FlippingMatrixTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit tests for the Flipping Matrix Kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
class FlippingMatrixTest {

	// Members
	private FlippingMatrix fm = new FlippingMatrix();
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateNullMatrix() throws Exception {
		assertEquals(0, fm.calculate(null));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateEmptyMatrix() throws Exception {
		int[][] matrix = new int[0][];		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateNullFirstRow() throws Exception {
		int[][] matrix = new int[][] {
			null,
			{1,0,1,0},
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateNullRow() throws Exception {
		int[][] matrix = new int[][] {
			{1,0,1,0},
			null,
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateEmptyRow() throws Exception {
		int[][] matrix = new int[][] {
			{},
			{0,0,1,1},
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateEmptyFirstRow() throws Exception {
		int[][] matrix = new int[][] {
			{0,0,1,1},
			{},
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateMissSized() throws Exception {
		int[][] matrix = new int[][] {
			{0,0,1,1},
			{1,0,1,0,1},
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateInvalidData() throws Exception {
		int[][] matrix = new int[][] {
			{0,0,1,1},
			{1,2,1,0},
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateInvalidDataNegative() throws Exception {
		int[][] matrix = new int[][] {
			{0,0,1,1},
			{1,-2,1,0},
			{1,1,0,0}
		};
		
		assertEquals(0, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateExampleOne() throws Exception {
		int[][] matrix = new int[][] {
			{0,0,1,1},
			{1,0,1,0},
			{1,1,0,0}
		};
		
		assertEquals(39, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateExampleTwo() throws Exception {
		int[][] matrix = new int[][] {
			{0}
		};
		
		assertEquals(1, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateAllOnes() throws Exception {
		int[][] matrix = new int[][] {
			{1,1,1,1},
			{1,1,1,1},
			{1,1,1,1}
		};
		
		assertEquals(45, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateAllZeros() throws Exception {
		int[][] matrix = new int[][] {
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}
		};
		
		assertEquals(45, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateAlternating() throws Exception {
		int[][] matrix = new int[][] {
			{0,1,0,1},
			{0,1,0,1},
			{0,1,0,1}
		};
		
		assertEquals(45, fm.calculate(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.FlippingMatrix#calculate(int[][])}.
	 */
	@Test
	void testCalculateLarge() throws Exception {
		int[][] matrix = new int[][] {
			{1,0,1,1,1,0,0,0},
			{0,1,0,1,0,1,0,1},
			{0,1,0,1,0,1,0,1},
			{1,1,1,1,0,1,0,1},
			{0,1,1,1,1,1,0,1},
			{0,1,0,1,1,1,1,1}
		};
		
		assertEquals(1367, fm.calculate(matrix));
	}
}
