package com.smt.kata.tree;

/****************************************************************************
 * <b>Title</b>: TrianglePath.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Triangle Path Kata
 * 
 * Triangle
 * https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/595/week-3-april-15th-april-21st/3715/
 * Given a triangle array, return the minimum path sum from top to bottom.
 * 
 * For each step, you may move to an adjacent number of the row below. More formally, 
 * if you are on index i on the current row, you may move to either index i or 
 * index i + 1 on the next row.
 * 
 * Example 1:
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11.
 * 
 * Example 2:
 * Input: triangle = [[-10]]
 * Output: -10
 * 
 * Constraints:
 * 1 <= triangle.length <= 200
 * triangle[0].length == 1
 * triangle[i].length == triangle[i - 1].length + 1
 * -104 <= triangle[i][j] <= 104
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 14, 2021
 * @updates:
 ****************************************************************************/
public class TrianglePath {
	
	/**
	 * Sums the entries through the triangle and finds the shortest path
	 * @param triangle Multi-dimensional array to sum against
	 * @return Sum of the shortest path
	 */
	public int sum(int[][] triangle) {
		return triangle.length;
	}
}
