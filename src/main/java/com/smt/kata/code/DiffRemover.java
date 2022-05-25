package com.smt.kata.code;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Given a master int array and removes diff array.  Remove all instances of
 * elements in remove from master.
 * 
 * Example
 * 
 * master: {1,2,3,3,4,5,6}, remove: {1,3,5} => {2,4,6}
 * master: {1,2,3,3,4,5,6}, remove: {} => {1,2,3,3,4,5,6}
 * master: {1,2,3,3,4,5,6}, remove: {1,2,3,3,4,5,6} => {}
 * master: {}, remove: {1,3,5} => {}
 * 
 * Notes:
 * 
 * Order is not guaranteed on incoming lists but return should be ordered low->high
 * Method always returns an array, even if it is empty or inputs are null.
 * 
 * @author raptor
 *
 */
public class DiffRemover {

	public int[] deDiff(int[] master, int[] remove) {
		if (master == null) return new int[0];
		if (remove == null) return master;
		
		var masterList = Arrays.stream(master).boxed().collect(Collectors.toList());		
		for (var num : remove) 
			masterList.removeIf(i -> i.equals(num));	
		
		return masterList.stream().sorted().mapToInt(i -> i).toArray();
	}
}
