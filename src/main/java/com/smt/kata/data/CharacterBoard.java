package com.smt.kata.data;

/****************************************************************************
 * <b>Title:</b> CharacterBoard.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Character Board
 * 
 * Given a 2D board of characters and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell, 
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may be used more than once.
 * For example, given the following board:
 * 
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 * 
 * exists(board, "ABCCED") returns true, 
 * exists(board, "SEE") returns true, 
 * exists(board, "ABCB") returns true.
 * exists(board, "ACE") returns false.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 15, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class CharacterBoard {

	protected char[][] board;
	protected int width;
	protected int height;

	/**
	 * Initializes the class with a 2d matrix
	 * 
	 * @param board matrix of characters
	 */
	public CharacterBoard(char[][] board) {
		this.board = board;
		this.width = board[0].length;
		this.height = board.length;
	}

	/**
	 * Runs through the character board and finds the provided word
	 * 
	 * @param word Word to search the board
	 * @return True if word is in the board, false otherwise
	 */
	public boolean exists(String word) {
		if (word == null || word.isEmpty())
			return false;
		word = word.toUpperCase();
		for (int y = 0; y < this.height; ++y) {
			for (int x = 0; x < this.width; ++x) {
				if (checkLoc(x, y, word, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkLoc(int x, int y, String word, int position) {
		if (position == word.length())
			return true;

		if (this.width > x + 1 && this.board[y][x + 1] == word.charAt(position)) {
			return checkLoc(x + 1, y, word, position + 1);
		}
		if (x - 1 >= 0 && this.board[y][x - 1] == word.charAt(position)) {
			return checkLoc(x - 1, y, word, position + 1);
		}
		if (this.height > y + 1 && this.board[y + 1][x] == word.charAt(position)) {
			return checkLoc(x, y + 1, word, position + 1);
		}
		if (y - 1 >= 0 && this.board[y - 1][x] == word.charAt(position)) {
			return checkLoc(x, y - 1, word, position + 1);
		}
		if (y - 1 >= 0 && x - 1 >= 0 && this.board[y - 1][x - 1] == word.charAt(position)) {
			return checkLoc(x - 1, y - 1, word, position + 1);
		}
		if (y - 1 >= 0 && this.width > x + 1 && this.board[y - 1][x + 1] == word.charAt(position)) {
			return checkLoc(x - 1, y - 1, word, position + 1);
		}
		if (this.height > y + 1 && x - 1 >= 0 && this.board[y + 1][x - 1] == word.charAt(position)) {
			return checkLoc(x, y + 1, word, position + 1);
		}
		if (this.height > y + 1 && this.width > x + 1 && this.board[y + 1][x + 1] == word.charAt(position)) {
			return checkLoc(x, y + 1, word, position + 1);
		}

		return false;
	}
}
