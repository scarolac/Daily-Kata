package com.smt.kata.code;

import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: ContiguousPartitions.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Contiguous Partitions Kata
 * 
 * Given a list of strictly positive integers, partition the list into 3 contiguous 
 * partitions which each sum up to the same value. If not possible, return empty int[][].
 * 
 * For example, given the following list:
 * 
 * [3, 5, 8, 1, 7]
 * Return the following 3 partitions:
 * 
 * [[3, 5],
 *  [8],
 *  [1, 7]]
 *  
 * Which each add up to 8.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 23, 2022
 * @updates:
 ****************************************************************************/
public class ContiguousPartitions {

	/**
	 * partitions the array into 3 sub arrays where the sun of each array is equal
	 * @param values Array to partition
	 * @return 3 partitions of equal values.  Emoty array if none found
	 */
	public int[][] find(int[] values) {
		if (values == null || values.length == 0)
			return new int[0][];

		var total = sum(values);
		if (total % 3 != 0)
			return new int[0][];

		var part1 = 0;
		var part3 = 2;
		var size = values.length;

		for (var part2 = 1; part2 < part3; ++part2)
			for (var j = part2 + 1; j < size; ++j) {
				part3 = j;
				var array1 = Arrays.copyOfRange(values, part1, part2);
				var array2 = Arrays.copyOfRange(values, part2, part3);
				var array3 = Arrays.copyOfRange(values, part3, size);
				if (sum(array1) == sum(array2) && sum(array2) == sum(array3))
					return new int[][] { array1, array2, array3 };
			}

		return new int[0][];
	}
	
	private int sum(int[] array) {
		return Arrays.stream(array).sum();
	}
}
