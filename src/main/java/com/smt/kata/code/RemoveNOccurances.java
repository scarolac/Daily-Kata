package com.smt.kata.code;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given a list and a number, create a new list that contains each number of list
 * at most N times, without reordering.  For example if the input number is 2, 
 * and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next 
 * [1,2] since this would lead to 1 and 2 being in the result 3 times, and then
 * take 3, which leads to [1,2,3,1,2,3].  With list [20,37,20,21] and number 1, 
 * the result would be [20,37,21].
 * 
 * Results:
 * removeOccurances should always return an array, empty if validation fails.
 * 
 * validation:
 * data should not be null
 * maxOccurances should not be negative.
 * 
 * @author raptor
 *
 */
public class RemoveNOccurances {

	public int [] removeOccurances(int [] data, int maxOccurances) {
		if (data == null || data.length == 0 || maxOccurances < 1) return new int[0];
		
		var counts = new HashMap<Integer, Integer>();
		var list = new ArrayList<Integer>();
		for (var num : data) {
			counts.merge(num, 1, Integer::sum);
			if (counts.get(num) <= maxOccurances)
				list.add(num);
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
