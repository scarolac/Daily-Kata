package com.smt.kata.code;

import java.util.Arrays;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: FlippingMatrix.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Score After Flipping Matrix Kata
 * 
 * You are given an m x n binary matrix grid.
 * 
 * A move consists of choosing any row or column and toggling each value in that 
 * row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
 * 
 * Every row of the matrix is interpreted as a binary number, and the score of 
 * the matrix is the sum of these numbers.
 * 
 * Return the highest possible score after making any number of moves (including zero moves).
 * 
 * https://assets.leetcode.com/uploads/2021/07/23/lc-toogle1.jpg
 * 
 * Example 1:
 * Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * Output: 39
 * Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * 
 * Example 2:
 * Input: grid = [[0]]
 * Output: 1
 * 
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 20
 * grid[i][j] is either 0 or 1.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 30, 2021
 * @updates:
 ****************************************************************************/
public class FlippingMatrix {

	/**
	 * Calculates the sum of the binaries for the matrix with as many moves as needed
	 * @param matrix Matrix to calculate against
	 * @return Sum of the binary values for each row
	 */
	public int calculate(int[][] matrix) {
		if (badInput(matrix))
			return 0;
		
		for (var row = 0; row < matrix.length; ++row)
			if (matrix[row][0] == 0)
				flipRow(matrix, row);
		
		for (var col = 0; col < matrix[0].length; ++col)
			if (colHasMoreZeroes(matrix, col))
				flipCol(matrix, col);

		return sumRows(matrix);
	}
	
	private boolean badInput(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return true;
		var size = matrix[0] != null ? matrix[0].length : 0;
		for (var row : matrix) {
			if (row == null || row.length != size)
				return true;
			size = row.length;
			for (var num : row)
				if (num < 0 || num > 1)
					return true;
		}
		return false;
	}
	
	private int sumRows(int[][] matrix) {
		var sum = 0;
		for (var row : matrix)
			sum += Integer.parseInt(Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining()), 2);
		return sum;
	}
	
	private void flipRow(int[][] matrix, int row) {
		if (row < 0 || row > matrix.length) return;
		
		for (var i = 0; i < matrix[row].length; ++i)
			matrix[row][i] = matrix[row][i] != 0 ? 0 : 1;
	}
	
	private void flipCol(int[][] matrix, int col) {
		if (col < 0 || col > matrix[0].length) return;
		
		for (var i = 0; i < matrix.length; ++i)
			matrix[i][col] = matrix[i][col] != 0 ? 0 : 1;
	}
	
	private boolean colHasMoreZeroes(int[][] matrix, int col) {
		if (col < 0 || col > matrix[0].length) return false;
		
		var zeroes = 0;
		for (var row = 0; row < matrix.length; ++row)
			if (matrix[row][col] == 0) 
				++zeroes;
		
		return zeroes > matrix.length / 2;
	}
}
