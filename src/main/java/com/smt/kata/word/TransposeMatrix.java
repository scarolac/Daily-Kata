package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: TransposeMatrix.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Enter the Matrix
 * In this challenge, you have to obtain a sentence from the elements of a given 
 * matrix. In the matrix, each word of the sentence follows a columnar order from 
 * the top to the bottom, instead of the usual left-to-right order: 
 * it's time for transposition! 
 * 
 * Given a matrix mtx, implement a function that returns the complete sentence as 
 * a string, with the words separated by a space between them.
 * 
 * Notes
 * All given matrices are regular, as to say that each column has the same length.
 * Punctuation is already given.
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 1, 2021
 * @updates:
 ****************************************************************************/
public class TransposeMatrix {

	/**
	 * 
	 */
	public TransposeMatrix() {
		super();
	}

	/**
	 * Performs the transposing of the array into a String
	 * @param matrix
	 * @return
	 */
	public String parse(String[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return "";

		var result = new StringBuilder();
		for (var col = 0; col < matrix[0].length; ++col)
			for (var row = 0; row < matrix.length; ++row)
				result.append(matrix[row][col]).append(" ");

		return result.toString().strip();
	}
}
