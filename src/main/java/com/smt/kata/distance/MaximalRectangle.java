package com.smt.kata.distance;

/****************************************************************************
 * <b>Title</b>: MaximalRectangle.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Maximal Rectangle
 * 
 * Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 * https://assets.leetcode.com/uploads/2020/09/14/maximal.jpg
 * 
 * Example 1:
 * Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * Output: 6
 * Explanation: The maximal rectangle is shown in the above picture.
 * 
 * Example 2:
 * Input: matrix = []
 * Output: 0

 * Example 3:
 * Input: matrix = [["0"]]
 * Output: 0
 * 
 * Example 4:
 * Input: matrix = [["1"]]
 * Output: 1
 * 
 * Example 5:
 * Input: matrix = [["0","0"]]
 * Output: 0
 * 
 * Constraints:
 * rows == matrix.length
 * cols == matrix[i].length
 * 0 <= row, cols <= 200
 * matrix[i][j] is '0' or '1'.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 28, 2021
 * @updates:
 ****************************************************************************/
public class MaximalRectangle {

	/**
	 * Calculates the largest rectangle of all ones
	 * @param matrix Matrix to calculate against
	 * @return Count of all of the "1"s in the rectangle
	 */
	public int calculate(int[][] matrix) {
		return matrix.length;
	}
}
