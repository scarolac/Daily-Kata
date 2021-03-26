package com.smt.kata.distance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> LexigraphicOrdering.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Lexigraphic Ordering
 * 
 * You are given an N by M 2D matrix of lowercase letters. Determine the minimum 
 * number of columns that can be removed to ensure that each row is ordered from 
 * top to bottom lexicographically. That is, the letter at each column is 
 * lexicographically later as you go down each row. It does not matter whether 
 * each row itself is ordered lexicographically.
 * 
 * For example, given the following table:
 * 
 * cba
 * daf
 * ghi
 * 
 * This is not ordered because of the a in the center. We can remove the second 
 * column to make it ordered:
 * 
 * ca
 * df
 * gi
 * 
 * So your function should return the above updated Matrix, since we only needed to remove 1 column.
 * As another example, given the following table:
 * 
 * abcdef
 * 
 * Your function should return the original, since the rows are already ordered (there's only one row).
 * As another example, given the following table:
 * 
 * zyx
 * wvu
 * tsr
 * 
 * Your function should return an empty matrix, since we would need to remove all the columns to order it.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 23, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class LexigraphicOrdering {
	
	private static int count = 0;

	/**
	 * Reorders the columns based upon lexigraphic order
	 * @param data matrix data to process
	 * @return matrix of data that is properly ordered
	 */
	public char[][] orderData(char[][] data) {
		p("Testing " + count++);
		if (data == null || data.length == 0) {
			return new char[0][];
		}
		if (data.length == 1) {
			return data;
		}
		int rowCount = data.length;
		int colCount = data[0].length;
		List<Integer> columns = new ArrayList<>();
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < colCount - 1; col++) {
				if (data[col][row] > data[col + 1][row]) {
					columns.add(row);
					break;
				}
			}
		}

		return removeColumns(data, columns);
	}
	
	public char[][] removeColumns(char[][] data, List<Integer> columns) {
		if (columns.size() == data.length)
			return new char[0][];
		char[][] output = new char[data.length][data[0].length - columns.size()];
		int counter = 0;
		for (int row = 0; row < data.length; row++) {
			if (columns.contains(row)) {
				continue;
			}
			for (int col = 0; col < data[0].length; col++) {
				output[col][counter] = data[col][row];
			}
			counter++;

		}
		pM(output);
		return output;
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }	
	private static void pA(char[] array) { System.out.println(Arrays.toString(array));}
	private static void pM(char[][] matrix) { p(matrix.length + "x" + matrix[0].length); for (var row : matrix) pA(row); }
}
