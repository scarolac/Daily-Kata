package com.smt.kata.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/****************************************************************************
 * <b>Title</b>: OpenTheLock.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Open The Lock Kata
 * 
 * You have a lock in front of you with 4 circular wheels. Each wheel has 
 * 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate 
 * freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. 
 * Each move consists of turning one wheel one slot.
 * 
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 * 
 * You are given a list of deadends dead ends, meaning if the lock displays any of 
 * these codes, the wheels of the lock will stop turning and you will be unable to open it.
 * 
 * Given a target representing the value of the wheels that will unlock the lock, 
 * return the minimum total number of turns required to open the lock, or -1 if it is impossible.
 * 
 * Example 1:
 * Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * Output: 6
 * Explanation:
 * A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
 * Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
 * because the wheels of the lock become stuck after the display becomes the dead end "0102".
 * 
 * Example 2:
 * Input: deadends = ["8888"], target = "0009"
 * Output: 1
 * Explanation:
 * We can turn the last wheel in reverse to move from "0000" -> "0009".
 * 
 * Example 3:
 * Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
 * Output: -1
 * Explanation:
 * We can't reach the target without getting stuck.
 * 
 ************************ Hint: Breadth First Search!!
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 26, 2021
 * @updates:
 ****************************************************************************/
public class OpenTheLock {

	/**
	 * Calculates the number of moves to unlock the lock
	 * @param deadends Numbers that are not allowed to be used
	 * @param target Combination to target
	 * @return Number of moves.  -1 if it can't be accomplished
	 */
	public int calculatePath(String[] deadends, String target) {
		
		String starting = "0000";
		
		Map<String, Integer> visited = new HashMap<>();
		Set<String> dead = new HashSet<>();
		for(String s: deadends) dead.add(s);
		
        return recurse(starting, 0, visited, dead, target);
    }

	public int recurse(String current, int count, Map<String, Integer> visited, Set<String> deadends, String target){
		if (visited.size() > 3750) 
			System.out.println("here tho");
		if (deadends.contains(current)) return -1;
		else if (visited.containsKey(current)){
			if(count >= visited.get(current)) return -1;
		}else if (current.equals(target)) return count;
		
		visited.put(current, count);

		int min = Integer.MAX_VALUE;
		for(int index = 0; index < current.length(); index++){
			String str = current.charAt(index) + "";
			int num = Integer.parseInt(str);
			int upNum = (num + 1);
			int downNum = (num - 1);
			if(downNum < 0) downNum += 10;
			if(upNum >= 10) upNum -= 10;

			char[] chars = current.toCharArray();
			chars[index] = Character.forDigit(upNum,10);
			int countA = recurse(String.valueOf(chars), ++count, visited, deadends, target);
			chars[index] = Character.forDigit(downNum,10);
			int countB = recurse(String.valueOf(chars), ++count, visited, deadends, target);
		
			if(countA != -1)
				min = Math.min(countA, min);
			
			if(countB != -1)
				min = Math.min(countA, min);
			
		}

		if(min == Integer.MAX_VALUE) return -1;
		else return min;
	}


}
