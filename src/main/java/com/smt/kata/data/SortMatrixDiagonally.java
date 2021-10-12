package com.smt.kata.data;

import java.util.Collections;
import java.util.LinkedList;

import org.apache.commons.lang3.ArrayUtils;

/****************************************************************************
 * <b>Title</b>: SortMatrixDiagonally.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Sort the Matrix Diagonally Kata
 * 
 * A matrix diagonal is a diagonal line of cells starting from some cell in 
 * either the topmost row or leftmost column and going in the bottom-right direction 
 * until reaching the matrix's end. For example, the matrix diagonal starting 
 * from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].
 * 
 * Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
 * 
 * Example 1:
 * https://assets.leetcode.com/uploads/2020/01/21/1482_example_1_2.png
 * Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
 * Output: [
 * 	[1,1,1,1],
 * 	[1,2,2,2],
 * 	[1,2,3,3]
 * ]
 * 
 * Example 2:
 * Input: mat = [
 * 	[11, 25, 66, 1,  69, 7],
 * 	[23, 55, 17, 45, 15, 52],
 * 	[75, 31, 36, 44, 58, 8],
 * 	[22, 27, 33, 25, 68, 4],
 * 	[84, 28, 14, 11, 5,  50]
 * ]
 * Output: [
 * 	[8, 11, 11, 14, 15, 17]
 * 	[7, 25, 27, 28, 31, 33]
 * 	[5, 25, 45, 50, 52, 55]
 * 	[4, 23, 44, 66, 68, 69]
 * 	[1, 22, 36, 58, 75, 84]
 * ]
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 16, 2021
 * @updates:
 ****************************************************************************/
public class SortMatrixDiagonally {

	/**
	 * Sorts the matrix into diagonally ordered matrix
	 * @param matrix Matrix to be sorted
	 * @return A sorted matrix
	 */
	public int[][] sort(int[][] matrix) {
		if (ArrayUtils.isEmpty(matrix)) return new int[0][];
		
		return rebuild(flatten(matrix), matrix.length, matrix[0].length);
	}
	
	private LinkedList<Integer> flatten(int[][] matrix){
		var result = new LinkedList<Integer>();
		for (var row : matrix) 
			for (var num : row)
				result.add(num);		
		Collections.sort(result);
		return result;
	}
	
	private int[][] rebuild(LinkedList<Integer> list, int rowSize, int colSize){
		var matrix = new int[rowSize][colSize];
		for (var col = 0; col < colSize; ++col) {
			var row = rowSize - 1;
			for (; row >= 0; --row) {
				System.out.println("-----");
				System.out.println("row " + row);
				System.out.println("col " + col);
			}
			
			for (var col2 = col + 1; col2 < colSize; ++col2) {
				System.out.println("row " + row);
				System.out.println("col " + col2);
			}

		}
		
		return matrix;
	}
}
