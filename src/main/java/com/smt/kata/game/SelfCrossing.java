package com.smt.kata.game;

/****************************************************************************
 * <b>Title</b>: SelfCrossing.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Self Crossing Kata
 * 
 * You are given an array of integers distance.
 * 
 * You start at point (0,0) on an X-Y plane and you move distance[0] meters to 
 * the north, then distance[1] meters to the west, distance[2] meters to the 
 * south, distance[3] meters to the east, and so on. In other words, after 
 * each move, your direction changes counter-clockwise.
 * 
 * Return true if your path crosses itself, and false if it does not.
 * 
 * Example 1:
 * Input: distance = [2,1,1,2]
 * https://assets.leetcode.com/uploads/2021/03/14/selfcross1-plane.jpg
 * Output: true
 * 
 * Example 2:
 * Input: distance = [1,2,3,4]
 * https://assets.leetcode.com/uploads/2021/03/14/selfcross2-plane.jpg
 * Output: false
 * 
 * Example 3:
 * Input: distance = [1,1,1,3]
 * https://assets.leetcode.com/uploads/2021/03/14/selfcross3-plane.jpg
 * Output: true
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 15, 2021
 * @updates:
 ****************************************************************************/
public class SelfCrossing {

	/**
	 * Determines if the lines overlap
	 * @param steps Each of the 4 steps in distance
	 * @return True if lines overlap.  False otherwise
	 */
	public boolean overlaps(int[] steps) {
		return steps == null;
	}

}
