package com.smt.kata.math;

// JDK 11.x
import java.util.Collection;
import java.util.HashSet;

/****************************************************************************
 * <b>Title</b>: ModulusSets.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Modulus Sets
 * 
 * Given a set of distinct positive integers, find the largest subset such that 
 * every pair of elements in the subset (i, j) satisfies either i % j = 0 or j % i = 0.  
 * 
 * For example, given the set [3, 5, 10, 20, 21], you should return [5, 10, 20]. 
 * 
 * Given [1, 3, 6, 24], return [1, 3, 6, 24]
 * 
 * The items in the array will NOT always be in order.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 12, 2021
 * @updates:
 ****************************************************************************/
public class ModulusSets {

	/**
	 * Calculates the number of modulus sets
	 * @param sequence Numbers to calculate against
	 * @return Largest colleciton of matchin modulus values
	 */
	public Collection<Integer> calculate(int[] input) {
		var result = new HashSet<Integer>();
		if (input == null || input.length == 0) return result;
		
		for (var i = 0; i < input.length; ++i) {
			var temp = new HashSet<Integer>();
			for (var j = 0; j < input.length; ++j) {
				if (i != j && (input[i] % input[j] == 0 || input[j] % input[i] == 0)) {
					temp.add(input[i]);
					temp.add(input[j]);
				}				
			}
			if (temp.size() > result.size())
				result = temp;
		}
		
		return result;
	}

}
