package com.smt.kata.math;

import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: SortSaySequence.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description: </b> Sort Say Sequence
 * 
 * Sort these integers for me ...
 * 
 * By name ...
 * 
 * Input Range is 0-9
 * 
 * There may be duplicates
 * 
 * The array may be empty
 * 
 * Example Input: 1, 2, 3, 4 Equivalent names: "one", "two", "three", "four"
 * Sorted by name: "four", "one", "three", "two" 
 * Output: 4, 1, 3, 2
 * 
 * Note: Your reorder method must solve this in one line using lambdas and streams
 * You may need a lookup element for the names.  This is not included in the one liner
 * 
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 30, 2021
 * @updates:
 ****************************************************************************/
public class SortSaySequence {
	
	/**
	 * Mapping for the units from "1" to "ONE", etc ....
	 */
	public enum units {
            ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE;
    }

	/**
	 * Converts the numbers in the array to the english word, orders by the word and
	 * returns the numbers in the new order
	 * @param input Array of digits from 0-9
	 * @return Reordered array of elements
	 */
    public int[] reorder(int[] input) {
        return input == null ? 
        	new int[0] : 
        	Arrays.stream(input)
            	.mapToObj(i -> units.values()[Math.abs(i)].name())
            	.sorted()
            	.map(i -> units.valueOf(i).ordinal())
            	.mapToInt(Integer::intValue)
            	.toArray();
    }
}
