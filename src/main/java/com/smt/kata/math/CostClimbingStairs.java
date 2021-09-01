package com.smt.kata.math;

import org.apache.commons.lang3.ArrayUtils;

/****************************************************************************
 * <b>Title</b>: CostClimbingStairs.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Minimum Cost Climbing Stairs Kata
 * 
 * You are given an integer array cost where cost[i] is the cost of ith step on 
 * a staircase. Once you pay the cost, you can either climb one or two steps.
 * 
 * You can either start from the step with index 0, or the step with index 1.
 * 
 * Return the minimum cost to reach the top of the floor.
 * 
 * Example 1:
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
 * 
 * Example 2:
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 26, 2021
 * @updates:
 ****************************************************************************/
public class CostClimbingStairs {

	/**
	 * Calculates the smallest cost to climb the stairs
	 * @param costs Array of costs for each step on the stairs
	 * @return Smallest cost to climb
	 */
	public int calculate(int[] costs) {
		if (ArrayUtils.isEmpty(costs)) return 0;
		if (costs.length == 1) return costs[0];
		
		int startAtOne = step(costs, 0, 0);
		int startAtTwo = step(costs, 1, 0);

		return Math.min(startAtOne,startAtTwo);
	}

	public int step(int[] costs, int index, int previous){
		if(index >= costs.length)
			return previous;
		
		int one = step(costs, index + 1, previous + costs[index]);
		int two = step(costs, index + 2, previous + costs[index]);

		return Math.min(one, two);
	}
}
