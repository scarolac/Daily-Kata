package com.smt.kata.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/****************************************************************************
 * <b>Title</b>: MatchstickToSquare.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Match Stick to Square Kata
 * 
 * You are given an integer array matchsticks where matchsticks[i] is the length 
 * of the ith matchstick. You want to use all the matchsticks to make one square. 
 * You should not break any stick, but you can link them up, and each matchstick 
 * must be used exactly one time.
 * 
 * Return true if you can make this square and false otherwise.
 * 
 * Example 1:
 * https://assets.leetcode.com/uploads/2021/04/09/matchsticks1-grid.jpg
 * Input: matchsticks = [1,1,2,2,2]
 * Output: true
 * Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
 * 
 * Example 2:
 * Input: matchsticks = [3,3,3,3,4]
 * Output: false
 * Explanation: You cannot find a way to form a square with all the matchsticks.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 26, 2021
 * @updates:
 ****************************************************************************/
public class MatchstickToSquare {

	/**
	 * Determines if the match sticks can form a square
	 * @param matchsticks Match sticks to evaluate
	 * @return True if they form a square, false otherwise
	 */
	public boolean canFormSquare(int[] matchsticks) {
		if (ArrayUtils.isEmpty(matchsticks))
			return false;
		Arrays.sort(matchsticks);

		List<Integer> sticks = new ArrayList<>();
		int count = 0;
		for (int i : matchsticks) {
			sticks.add(i);
			count += i;
		}

		int sideLength = (int) Math.sqrt(count);
		List<Integer> sides = new ArrayList<>();
		sides.add(0);
		sides.add(0);
		sides.add(0);
		sides.add(0);

		return trySides(sides, sticks, sideLength);
	}

	boolean trySides(List<Integer> sides, List<Integer> available, int target) {
		for (int x = 0; x < sides.size(); x++) {
			int side = sides.get(x);
			if (side == target) {
				continue;
			}

			// Side is not filled
			boolean anyPass = false;
			for (int y = 0; y < available.size(); y++) {
				List<Integer> cSides = new ArrayList<>(sides);
				List<Integer> cAvail = new ArrayList<>(available);
				int currentSideHeight = side + available.get(y);
				if (currentSideHeight > target)
					continue;

				cSides.set(x, currentSideHeight);
				cAvail.remove(y);

				boolean result = trySides(cSides, cAvail, target);
				if (result)
					anyPass = true;
			}
			return anyPass;
		}

		return available.isEmpty();
	}

}
