package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: MatrixWordSearch.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Word Search
 * 
 * Given an m x n grid of characters board and a string word, return true if word 
 * exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cells, 
 * where adjacent cells are horizontally or vertically neighboring. The same letter 
 * cell may not be used more than once.
 * 
 * Example 1:
 * https://assets.leetcode.com/uploads/2020/11/04/word2.jpg
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 * 
 * Example 2:
 * https://assets.leetcode.com/uploads/2020/11/04/word-1.jpg
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 * 
 * Example 3:
 * https://assets.leetcode.com/uploads/2020/10/15/word3.jpg
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 * 
 * Constraints:
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consists of only lowercase and uppercase English letters.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 28, 2021
 * @updates:
 ****************************************************************************/
public class MatrixWordSearch {
	
	/**
	 * Finds the word on the board with sequential boxes on the board
	 * @param board Word board to search
	 * @param word Word to find on the board
	 * @return True if found.  False otherwise
	 */
	public boolean find(String[][] board, String word) {
		return board.length == 0;
	}
}
