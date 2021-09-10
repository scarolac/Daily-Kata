package com.smt.kata.word;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: WordSubsets.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Word Subsets
 * 
 * You are given two string arrays words1 and words2.
 * 
 * A string b is a subset of string a if every letter in b occurs in a including multiplicity.
 * 
 * For example, "wrr" is a subset of "warrior" but is not a subset of "world".
 * A string a from words1 is universal if for every string b in words2, b is a subset of a.
 * 
 * Return an array of all the universal strings in words1. You may return the answer in any order.
 * 
 * Example 1:
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
 * Output: ["facebook","google","leetcode"]
 * 
 * Example 2:
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
 * Output: ["apple","google","leetcode"]
 * 
 * Example 3:
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","oo"]
 * Output: ["facebook","google"]
 * 
 * Example 4:
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["lo","eo"]
 * Output: ["google","leetcode"]
 * 
 * Example 5:
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["ec","oc","ceo"]
 * Output: ["facebook","leetcode"]
 * 
 * Constraints:
 * 
 * 1 <= words1.length, words2.length <= 104
 * 1 <= words1[i].length, words2[i].length <= 10
 * words1[i] and words2[i] 
 * All the strings of words1 are unique.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 9, 2021
 * @updates:
 ****************************************************************************/
public class WordSubsets {
	
	/**
	 * Finds the matching patterns in the collection of words.  The includes can 
	 * be in any order for the match
	 * @param words Words to search
	 * @param searchVal Patterns to search fo
	 * @return Collection of words that match the patterns
	 */
	public List<String> find(String[] words, String[] searchVal) {
		return new ArrayList<>();
	}
}
