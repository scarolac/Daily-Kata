package com.smt.kata.code;

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
		return new int[0][];
	}
}
