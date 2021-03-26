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
		List<Integer> columns = new ArrayList<>();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length-1; j++) {
				if (data[j][i] > data[j+1][i]) {
					columns.add(i);
					break;
				}
			}
		}
		
		return removeColumns(data,columns);
	}
	
	public char[][] removeColumns(char[][] data, List<Integer> columns) {
		char[][] output = new char[data.length][data[0].length-columns.size()];
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (columns.contains(i)) {
				continue;
			}
			for (int j = 0; j < data[0].length; j++) {
				output[j][counter] =  data[j][i];
			}
			counter ++;
			
		}
		pM(output);
		return (output.length == 0 || output[0].length == 0) ? new char[0][] : output;
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }	
	private static void pA(char[] array) { System.out.println(Arrays.toString(array));}
	private static void pM(char[][] matrix) { p(matrix.length + "x" + matrix[0].length); for (var row : matrix) pA(row); }
}
