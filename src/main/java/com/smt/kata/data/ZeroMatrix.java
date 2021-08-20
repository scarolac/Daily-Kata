package com.smt.kata.data;

import java.util.Arrays;
import java.util.HashSet;

/****************************************************************************
 * <b>Title</b>: ZeroMatrix.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Zero Matrix
 * 
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row 
 * and column to 0's, and return the matrix.
 * 
 * You must do it in place.
 * 
 * Example 1:
 * https://assets.leetcode.com/uploads/2020/08/17/mat1.jpg
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Example 2:
 * https://assets.leetcode.com/uploads/2020/08/17/mat2.jpg
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 *  
 * Constraints:
 * m == matrix.length
 * n == matrix[0].length
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 18, 2021
 * @updates:
 ****************************************************************************/
public class ZeroMatrix {

	/**
	 * Assigns the columns and rows to all zeros when a cell is 0
	 * @param matrix Matrix to assign
	 * @return Matrix with the rows and columns updated
	 */
	public int[][] assign(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0] == null)
			return new int[0][];

		var row = new HashSet<Integer>();
		var col = new HashSet<Integer>();

		for (var m = 0; m < matrix.length; ++m)
			for (var n = 0; n < matrix[0].length; ++n)
				if (matrix[m][n] == 0) {
					row.add(m);
					col.add(n);
				}

		for (var m = 0; m < matrix.length; ++m)
			for (var n = 0; n < matrix[0].length; ++n)
				if (row.contains(m) || col.contains(n))
					matrix[m][n] = 0;

		return matrix;
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }    
	private static void pA(int[] array) { System.out.println(Arrays.toString(array));}
	private static void pM(int[][] matrix) { p(matrix.length + "x" + matrix[0].length); for (var row : matrix) pA(row); }
}
