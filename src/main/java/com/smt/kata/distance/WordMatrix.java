package com.smt.kata.distance;

/****************************************************************************
 * <b>Title</b>: WordMatrix.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Word Matrix
 * Given a 2D matrix of characters and a target word, write a function that returns 
 * whether the word can be found in the matrix by going left-to-right, right to Left, 
 * up-to-down or down to up.
 * 
 * For example, given the following matrix:

 * [['F', 'A', 'C', 'I'],
 * ['O', 'B', 'Q', 'P'],
 * ['A', 'N', 'O', 'B'],
 * ['M', 'A', 'S', 'S']]
 * 
 * and the target word 'FOAM', you should return true, since it's the leftmost 
 * column. Similarly, given the target word 'MASS', you should return true, 
 * since it's the last row.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 10, 2021
 * @updates:
 ****************************************************************************/
public class WordMatrix {
	
	// Members
	protected char[][] matrix = new char[][] {
		{ 'F', 'A', 'C', 'I' },
		{ 'O', 'B', 'Q', 'P' },
		{ 'A', 'N', 'O', 'B' },
		{ 'M', 'A', 'S', 'S' }
	};

	/**
	 * 
	 */
	public WordMatrix() {
		super();
	}

	/**
	 * Determines if the provided phrase is in the matrix
	 * either horizontally or vertically
	 * @return
	 */
	public boolean contains(String phrase) {
		return false;
	}
}
