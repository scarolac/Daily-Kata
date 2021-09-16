package com.smt.kata.word;

// JDK 11.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: CircularArray.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Circular Array Kata
 * 
 * Given a list of words, determine whether the words can be chained to form a circle. 
 * A word X can be placed in front of another word Y in a circle if the last 
 * character of X is same as the first character of Y.
 * 
 * For example, the words ['chair', 'height', 'racket', touch', 'tunic'] can 
 * form the following circle: chair --> racket --> touch --> height --> tunic --> chair.

 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 13, 2021
 * @updates:
 ****************************************************************************/
public class CircularArray {

	/**
	 * Creates the circular array from the array of words
	 * @param words Words to reorder in a circular pattern
	 * @return Collection of words reordered.  Empty list if not possible
	 */
	public List<String> create(String[] words) {
		return new ArrayList<>();
	}
}
