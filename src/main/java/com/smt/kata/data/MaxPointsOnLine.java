package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: MaxPointsOnLine.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Max Points on a Line Kata
 * 
 * Given an array of points where points[i] = [xi, yi] represents a point on the 
 * X-Y plane, return the maximum number of points that lie on the same straight line.
 * this check assumes vertical/horizontal and diagonal (45 degrees) as the lines
 * to evaluate
 * 
 * Example 1:
 * Input: points = [[1,1],[2,2],[3,3]]
 * https://assets.leetcode.com/uploads/2021/02/25/plane1.jpg
 * Output: 3
 * 
 * Example 2:
 * Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * https://assets.leetcode.com/uploads/2021/02/25/plane2.jpg
 * Output: 4
 * 
 * Constraints:
 * 1 <= points.length <= 300
 * points[i].length == 2
 * -104 <= xi, yi <= 104
 * Each point is processed only once, even if it is duplicated
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 12, 2021
 * @updates:
 ****************************************************************************/
public class MaxPointsOnLine {
	
	/**
	 * Calculates the number of points on a straight line
	 * @param points Points on the graph
	 * @return Max points in any straight line (vertical, horizontal and diagonal)
	 */
	public int findMax(int[][] points) {
		return points.length;
	}
}
