package com.smt.kata.distance;

/****************************************************************************
 * <b>Title:</b> QueenAttack.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Queen Attack Kata
 * 
 * Given the position of two queens on a chess board, indicate whether or not 
 * they are positioned so that they can attack each other. In the game of chess, 
 * a queen can attack pieces which are on the same row, column, or diagonal.  A 
 * chess board can be represented by an 8 by 8 array.  You must initialize the board to 
 * have the '-' character to simulate the board as shown below.
 * 
 * So if you're told the white queen is at (2, 3) and the black queen at (5, 6), 
 * then you'd know you've got a set-up like so:
 * 
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ W _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ B _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * 
 * You'd also be able to answer whether the queens can attack each other. In 
 * this case, that answer would be yes, they can, because both pieces share a diagonal.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 22, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class QueenAttack {
	
	// Members
	protected char[][] chessboard;

	/**
	 * Initialize the chess board
	 * @param chessboard 2d array that expresses the chess board
	 */
	public QueenAttack(char[][] chessboard) {
		super();
		
		this.chessboard = chessboard;
	}

	/**
	 * Determines if the black and white queen can attach each other in any direction
	 * @param white coordinate for the white queen
	 * @param black coordinate for the black queen
	 * @return true if they can attack in any direction.  False otherwise
	 */
	public boolean canAttack(int[] white, int[] black) {
		return white[0] == black[0];
	}
}
