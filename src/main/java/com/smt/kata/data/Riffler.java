package com.smt.kata.data;

// Spacelibs 1.x
import com.siliconmtn.data.bean.GenericVO;

/****************************************************************************
 * <b>Title:</b> Riffler.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Riffler
 * 
 * Riffle takes two lists and alternately puts their elements into one list: 
 * 
 * Riffle[{a,b,c},{1,2,3}] 
 * {a,1,b,2,c,3} 
 * 
 * Write a function Deriffle that takes a list of any length and separates it into 
 * two lists. The first list should contain all of the entries with odd indices in 
 * the original list, and the second should contain all of the entries with even indices. 
 * 
 * Deriffle[{1,2,3,4,5}] 
 * {{1,3,5},{2,4}}
 * 
 * You **MUST** use arrays for this Kata. Collections are NOT to be used
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 29, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class Riffler {

	/**
	 * Combines the two arrays by alternating the elements from each array
	 * @param source Source array.  Length must be greater than or equal to dest
	 * @param dest Destination array to combine.  Must be within 1 character of
	 * the length
	 * @return Combined array.  Empty array if invalid data
	 */
	public char[] riffle(char[] source, char[] dest) {
		return source;
	}
	
	/**
	 * Splits the passed array into 2 elements.  
	 * @param combined Array to deriffle
	 * @return Source array as key and the dest array as value
	 */
	public GenericVO deriffle(char[] combined) {
		return new GenericVO(combined, null);
	}
}
