package com.smt.kata.game;

import java.util.List;

import com.smt.kata.distance.bean.CoordinateVO;

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
		if (this.board == null || this.board[0] == null || this.board.length != 8 || this.board[0].length != 8) return false;
		
		// find king
		var king = findKing();
		if (king == null) return false;
		
		// look sideways
		var sideways = checkTheSides(king);
		
		// look up/down
		var flank = checkTheFlank(king);
		
		// look diagonal
		var crosscross = checkTheCrash(king);
		
		// suffer on the knight
		var knights = checkKnights(king);	
		
		return sideways || flank || crosscross || knights;
	}

	private CoordinateVO findKing() {
		for (var row = 0; row < this.board.length; ++row)
			for (var col = 0; col < this.board[0].length; ++col)
				if (this.board[row][col] == 'K')
					return new CoordinateVO(row, col);
		return null;
	}

	private boolean checkTheSides(CoordinateVO king) {
		var bad = List.of('R', 'Q');
		for (var col = 0; col < this.board[king.getRow()].length; ++col)
			if (bad.contains(this.board[king.getRow()][col]))
					return true;
		return false;
	}

	private boolean checkTheFlank(CoordinateVO king) {
		var blockers = List.of('B','P','N');
		var bad = List.of('R','Q');
		// up
		for (var row = king.getRow(); row > 0; --row) {
			if (blockers.contains(this.board[row][king.getColumn()])) 
				break;
			if (bad.contains(this.board[row][king.getColumn()]))
				return true;
		}
		// down
		for (var row = king.getRow(); row < this.board.length; ++row) {
			if (blockers.contains(this.board[row][king.getColumn()])) 
				break;
			if (bad.contains(this.board[row][king.getColumn()]))
				return true;
		}
		
		return false;
	}
	
	private boolean checkTheCrash(CoordinateVO king) {
		
		// pawn tho
		if (this.board[king.getRow() + 1][king.getColumn() - 1] == 'P' || 
			this.board[king.getRow() + 1][king.getColumn() - 1] == 'P')
				return true;
		
		var blockers = List.of('P','N','R');
		var bad = List.of('B', 'Q');
		
		
		var upRight = false;
		for (int row = king.getRow(), col = king.getColumn(); row >= 0 && col < this.board[0].length; --row, ++col) {
			if(blockers.contains(this.board[row][col])) {
				upRight = false;
				break;
			}
			if(bad.contains(this.board[row][col])) {
				upRight = true;
				break;
			}
		}
		var upLeft  = false;
		for (int row = king.getRow(), col = king.getColumn(); row >= 0 && col >= 0; --row, --col) {
			if(blockers.contains(this.board[row][col])) {
				upLeft = false;
				break;
			}
			if(bad.contains(this.board[row][col])) {
				upLeft = true;
				break;
			}
		}
		var downRight = false;
		for (int row = king.getRow(), col = king.getColumn(); row < this.board.length && col < this.board[0].length; ++row, ++col) {
			if(blockers.contains(this.board[row][col])) {
				downRight = false;
				break;
			}
			if(bad.contains(this.board[row][col])) {
				downRight = true;
				break;
			}
		}
		var downLeft =false;
		for (int row = king.getRow(), col = king.getColumn(); row < this.board.length && col > 0; ++row, --col) {
			if(blockers.contains(this.board[row][col])) {
				downLeft = false;
				break;
			}
			if(bad.contains(this.board[row][col])) {
				downLeft = true;
				break;
			}
		}			
				
		return upRight || upLeft || downRight || downLeft;
	}
	
	private boolean checkKnights(CoordinateVO king) {
		return this.board[king.getRow() + 2][king.getColumn() - 1] == 'N' ||
				this.board[king.getRow() + 2][king.getColumn() + 1] == 'N' ||
			   	this.board[king.getRow() - 2][king.getColumn() - 1] == 'N' ||
				this.board[king.getRow() - 2][king.getColumn() + 1] == 'N' ||
				this.board[king.getRow() + 1][king.getColumn() - 2] == 'N' ||
				this.board[king.getRow() - 1][king.getColumn() - 2] == 'N' ||
				this.board[king.getRow() + 1][king.getColumn() + 2] == 'N' ||
				this.board[king.getRow() - 1][king.getColumn() + 2] == 'N';
	}
	
}
