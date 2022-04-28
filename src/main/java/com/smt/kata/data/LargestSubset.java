package com.smt.kata.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: LargestSubset.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Largest Subset Kata
 * 
 * Given a set of distinct positive integers, find the largest subset such that 
 * every pair of elements in the subset (i, j) satisfies either i % j = 0 or j % i = 0.
 * 
 * For example, given the set [3, 5, 10, 20, 21], you should return [5, 10, 20]. 
 * Given [1, 3, 6, 24], return [1, 3, 6, 24].
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 27, 2022
 * @updates:
 ****************************************************************************/
public class LargestSubset {

	/**
	 * List of params to validate into matching modulus
	 * @param values Array of values
	 * @return Collection of values with all modulus 0
	 */
	public List<Integer> find(List<Integer> values) {
		if (values == null || values.size() < 2) 
			return new ArrayList<>();
		Collections.sort(values);
		var result = new ArrayList<Integer>();
		for (var item : values) {
			var temp = new HashSet<Integer>();
			temp.add(item);
			for (var item2 : values) {
				if (item != item2 && (item % item2 != 0 && item2 % item != 0))
					continue;
				temp.add(item2);
			}
			if (temp.size() > result.size())
				result = new ArrayList<>(temp);
		}
		System.out.println(result);
		return result;
	}

}
