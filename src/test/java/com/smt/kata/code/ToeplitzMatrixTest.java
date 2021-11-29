package com.smt.kata.code;

// Junit 5
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: ToeplitzMatrixTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Unit test for the Toeplitz Matrix kata
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 29, 2021
 * @updates:
 ****************************************************************************/
class ToeplitzMatrixTest {

	// Members
	private ToeplitzMatrix tm = new ToeplitzMatrix();
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzNull() throws Exception {
		int[][] matrix = null;
		
		assertFalse(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzEmpty() throws Exception {
		int[][] matrix = new int[0][];
		
		assertFalse(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzNullInside() throws Exception {
		int[][] matrix = new int[][] {
			 { 1, 2, 3, 4, 8 },
			 { 5, 1, 2, 3, 4 },
			 null,
			 { 7, 4, 5, 1, 2 }
		};
		
		assertFalse(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzValid() throws Exception {
		int[][] matrix = new int[][] {
			 { 1, 2, 3, 4, 8 },
			 { 5, 1, 2, 3, 4 },
			 { 4, 5, 1, 2, 3 },
			 { 7, 4, 5, 1, 2 }
		};
		
		assertTrue(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzValidSingle() throws Exception {
		int[][] matrix = new int[][] {
			 { 1 }
		};
		
		assertTrue(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzValidSingleColumn() throws Exception {
		int[][] matrix = new int[][] {
			 { 1 },
			 { 1 },
			 { 1 },
			 { 1 },
			 { 1 }
		};
		
		assertTrue(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzValidDoubleColumn() throws Exception {
		int[][] matrix = new int[][] {
			 { 1, 0 },
			 { 2, 1 },
			 { 3, 2 },
			 { 4, 3 },
			 { 5, 4 }
		};
		
		assertTrue(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzValidSingleRow() throws Exception {
		int[][] matrix = new int[][] {
			 { 1, 2, 3, 4, 5, 6 }
		};
		
		assertTrue(tm.isToeplitz(matrix));
	}
	
	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzValidDoubleRow() throws Exception {
		int[][] matrix = new int[][] {
			 { 1, 2, 3, 4, 5, 6 },
			 { 0, 1, 2, 3, 4, 5 }
		};
		
		assertTrue(tm.isToeplitz(matrix));
	}

	/**
	 * Test method for {@link com.smt.kata.code.ToeplitzMatrix#isToeplitz(int[][])}.
	 */
	@Test
	void testIsToeplitzNotValid() throws Exception {
		int[][] matrix = new int[][] {
			 { 1, 2, 3, 4, 8 },
			 { 5, 1, 3, 3, 4 },
			 { 4, 5, 1, 2, 3 },
			 { 7, 4, 5, 1, 2 }
		};
		
		assertFalse(tm.isToeplitz(matrix));
	}
	
}
