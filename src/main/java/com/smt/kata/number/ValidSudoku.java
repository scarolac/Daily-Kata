package com.smt.kata.number;

import java.util.ArrayList;
import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: ValidSudoku.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Valid Sudoku
 * 
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be 
 * validated according to the following rules:
 * 
 * - Each row must contain the digits 1-9 without repetition.
 * - Each column must contain the digits 1-9 without repetition.
 * - Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * 
 * Note:
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * 
 * Example 1
 * https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png
 * Input: board = 
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * 
 * Example 2:
 * Input: board = 
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being 
 * modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * 
 * Constraints:
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 24, 2021
 * @updates:
 ****************************************************************************/
public class ValidSudoku {
	ArrayList<String> possible = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
	/**
	 * Determines if the values in the Sudoku board are valid
	 * @param board Sudoku board to evaluate
	 * @return True if the values are valid.  False otherwise
	 */
	public boolean isValid(String[][] board) {		
		return checkRows(board) && checkColumns(board) && checkSubBoxes(board);
	}

	private boolean checkSubBoxes(String[][] board) {
		var copy = new ArrayList<>(possible);
		for (var multiple = 0; multiple < 3; ++multiple) {
			for (var row = multiple; row < (multiple+1)*3; ++row)
				for (var col = multiple; col < (multiple+1)*3; ++col)
					if (!board[row][col].equals(".") && !copy.remove(board[row][col]))
						return false;
			copy = new ArrayList<>(possible);
		}
		return true;
	}

	private boolean checkRows(String[][] board) {
		var copy = new ArrayList<>(possible);
		for (var row = 0; row < board.length; ++row) {
			for (var col = 0; col < board[0].length; ++col)
				if (!board[row][col].equals(".") && !copy.remove(board[row][col]))
					return false;
			copy = new ArrayList<>(possible);
		}
		
		return true;		
	}

	private boolean checkColumns(String[][] board) {
		var copy = new ArrayList<>(possible);
		for (var col = 0; col < board[0].length; ++col) {
			for (var row = 0; row < board.length; ++row)
				if (!board[row][col].equals(".") && !copy.remove(board[row][col]))
					return false;
			copy = new ArrayList<>(possible);
		}
		
		return true;	
	}
}