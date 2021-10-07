package com.smt.kata.game;

/****************************************************************************
 * <b>Title</b>: KingCheck.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> King Check
 * 
 * You are presented with an 8 by 8 matrix representing the positions of pieces 
 * on a chess board. The only pieces on the board are the black king and various 
 * white pieces. Given this matrix, determine whether the king is in check.
 * 
 * For details on how each piece moves, see here.
 * 
 * For example, given the following matrix:
 * 
 * { 'O','O','O','K','O','O','O','O' },
 * { 'O','O','O','O','O','O','O','O' },
 * { 'O','B','O','O','O','O','O','O' },
 * { 'O','O','O','O','O','O','P','O' },
 * { 'O','O','O','O','O','O','O','R' },
 * { 'O','O','N','O','O','O','O','O' },
 * { 'O','O','O','O','O','O','O','O' },
 * { 'O','O','O','O','O','Q','O','O' }
 * 
 * You should return True, since the bishop is attacking the king diagonally.
 * 
 * 'K' = King
 * 'Q' = Queen
 * 'P' = Pawn
 * 'B' = Bishop
 * 'R' = Rook
 * 'N' = Knight
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Oct 6, 2021
 * @updates:
 ****************************************************************************/
public class KingCheck {
	char[][] board;
	
	/**
	 * Assigns the chess board to the class
	 * @param board Chess board
	 */
	public KingCheck(char[][] board) {
		this.board = board;
	}

	/**
	 * 
	 * @param board
	 * @return
	 */
	public boolean isKingCheck() {
		return board == null;
	}
}
