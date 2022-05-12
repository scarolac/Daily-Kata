package com.smt.kata.sequence;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: ArrayPermutations.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Array Permutations Kata
 * 
 * Given a number in the form of a list of digits, return all possible permutations.
 *
 * For example, given [1,2,3], 
 * return [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * If the array is empty or null, return an empty collection
 *
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 12, 2022
 * @updates:
 ****************************************************************************/
public class ArrayPermutations {

	/**
	 * Finds all of the possible unique permutations
	 * @param num Array of ints to permutate
	 * @return Collection of permutations
	 */
	public List<List<Integer>> findPermutations(int[] num) {
		if (num == null || num.length == 0) 
			return new ArrayList<>();
		
		var list = Arrays.stream(num).boxed().collect(Collectors.toList());
		var set = new HashSet<List<Integer>>();
		var aLot = fact(num.length, 1);
		
		while(set.size() < aLot) {
			Collections.shuffle(list);
			var temp = new ArrayList<>(list);
			set.add(temp);
		}
		
		return new ArrayList<>(set);
	}
	
	private int fact(int num, int acc) {
		if (num == 0) return acc;
		return fact(num - 1, acc * num);
	}
	
}
