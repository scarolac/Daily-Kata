package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: DuplicateRemover.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Duplicate Remover
 * 
 * Remove All Adjacent Duplicates in String
 * 
 * You are given a string s and an integer k, a k duplicate removal consists of 
 * choosing k adjacent and equal letters from s and removing them, causing the 
 * left and the right side of the deleted substring to concatenate together.
 * 
 * We repeatedly make k duplicate removals on s until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made. 
 * It is guaranteed that the answer is unique.
 * 
 * Example 1:
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Explanation: There's nothing to delete.
 * 
 * Example 2:
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 * Explanation: 
 * First delete "eee" and "ccc", get "ddbbbdaa"
 * Then delete "bbb", get "dddaa"
 * Finally delete "ddd", get "aa"
 * 
 * Example 3:
 * Input: s = "pbbcggttciiippooaais", k = 2
 * Output: "ps"
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * 2 <= k <= 104
 * s only contains lower case English letters.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 7, 2021
 * @updates:
 ****************************************************************************/
public class DuplicateRemover {

	/**
	 * Removes all of the duplicates with a sequential set of characters matching 
	 * the number of dups
	 * @param source Source string to process
	 * @param numDups Number of sequential duplicate characters
	 * @return Processed String.
	 */
	public String process(String source, int numDups) {
		return source;
	}
}
