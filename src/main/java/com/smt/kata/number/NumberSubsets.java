package com.smt.kata.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> NumberSubsets.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Number Subsets
 * Given a multiset of integers, return whether it can be partitioned into two 
 * subsets whose sums are the same.
 * 
 * For example, given the multiset {15, 5, 20, 10, 35, 15, 10}, 
 * it would return true, since we can split it up into {15, 5, 10, 15, 10} and 
 * {20, 35}, which both add up to 55.
 * 
 * Given the multiset {15, 5, 20, 10, 35}, it would return false, since we 
 * can't split it up into two subsets that add up to the same sum.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 23, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class NumberSubsets {
	
	/**
	 * Method gets every possible combo and then adds the elements in the combos 
	 * to see if we have a match
	 * @param elements Elements to use to add the options
	 * @return True if there is a matching pattern.  False otherwise
	 */
	public boolean findMataches(int[] elements) {
		if (elements == null || elements.length == 0 || getSum(elements) % 2 != 0) return false;
		
		p(printCombination(elements, elements.length, 1).size());
		pA(elements);
		p("Sum: " + getSum(elements));
		
		
		return false;
	}
	
	private int[] getPartner(int[] elements, int[] combination) {
		List<Integer> elementList = new ArrayList<Integer>(elements.length);
		for (int i : elements) {
			elementList.add(i);
		}
		List<Integer> combinationList = new ArrayList<Integer>();
		for (int j : combination) {
			combinationList.add(j);
		}
		elementList.removeAll(combinationList);
		int[] result = new int[elementList.size()];
		for (int k = 0; k<elementList.size(); k++) {
			result[k] = elementList.get(k);
		}
		return result;
	}
	
	private int getSum(int[] array) {
		int sum = 0;
		for (var item : array) {
			sum += item;
		}
		return sum;
	}
	
	private static <T> void p(T msg) { System.out.println(msg); }    
    private static void pA(int[] array) { System.out.println(Arrays.toString(array));}
    
	static int[] combinationUtil(int arr[], int[] data, int start, int end, int index, int r) {
		if (index == r)
			return data;
		else {
			for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
				data[index] = arr[i];
				combinationUtil(arr, data, i + 1, end, index + 1, r);
			}
			return new int[0];
		}
	}

	static List<int[]> printCombination(int arr[], int n, int r) {
		List<int[]> result = new ArrayList<>();
		int data[] = new int[r];
		result.add(combinationUtil(arr, data, 0, n - 1, 0, r));
		return result;
	}


}
