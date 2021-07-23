package com.smt.kata.distance;

// Kata libs
import com.smt.kata.distance.bean.CoordinateVO;

/****************************************************************************
 * <b>Title</b>: MatrixRange.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Matrix Range
 * 
 * Let A be an N by M matrix in which every row and every column is sorted.
 * 
 * Given i1, j1, i2, and j2, compute the number of elements of M smaller than 
 * M[i1, j1] and larger than M[i2, j2].
 * 
 * For example, given the following matrix:
 * 
 * [1, 3, 7, 10, 15, 20],
 * [2, 6, 9, 14, 22, 25],
 * [3, 8, 10, 15, 25, 30],
 * [10, 11, 12, 23, 30, 35],
 * [20, 25, 30, 35, 40, 45]
 * 
 * And i1 = 1, j1 = 1, i2 = 3, j2 = 3, return 14 as there are 14 numbers in the 
 * matrix smaller than the lowest number (6) or greater than the highest number (23).  
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 22, 2021
 * @updates:
 ****************************************************************************/
public class MatrixRange {

	/**
	 * Takes a matrix and finds the numbers outside of the values provided by the 
	 * coordinates
	 * @param matrix 2 dimensional int array
	 * @param start Start coordinates
	 * @param end End coordinates
	 * @return number of coordinates outside the range
	 */
	public int getNumberElements(int[][] matrix, CoordinateVO start, CoordinateVO end) {
		return matrix.length;
	}
}
