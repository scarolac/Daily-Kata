package com.smt.kata.distance;

import java.util.Arrays;

/****************************************************************************
 * <b>Title:</b> RailFenceCypher.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> Rail Fence Cypher
 * Implement encoding and decoding for the rail fence cipher.
 * 
 * The Rail Fence cipher is a form of transposition cipher that gets its name from 
 * the way in which it's encoded. It was already used by the ancient Greeks.
 * 
 * In the Rail Fence cipher, the message is written downwards on successive "rails" 
 * of an imaginary fence, then moving up when we get to the bottom (like a zig-zag). 
 * Finally the message is then read off in rows.
 * 
 * For example, using three "rails" and the message "WE ARE DISCOVERED FLEE AT ONCE", 
 * the cipherer writes out:
 * 
 * W . . . E . . . C . . . R . . . L . . . T . . . E
 * . E . R . D . S . O . E . E . F . E . A . O . C .
 * . . A . . . I . . . V . . . D . . . E . . . N . .
 * Then reads off:
 * 
 * WECRLTEERDSOEEFEAOCAIVDEN
 * To decrypt a message you take the zig-zag shape and fill the ciphertext along the rows.
 * 
 * ? . . . ? . . . ? . . . ? . . . ? . . . ? . . . ?
 * . ? . ? . ? . ? . ? . ? . ? . ? . ? . ? . ? . ? .
 * . . ? . . . ? . . . ? . . . ? . . . ? . . . ? . .
 * The first row has seven spots that can be filled with "WECRLTE".
 * 
 * W . . . E . . . C . . . R . . . L . . . T . . . E
 * . ? . ? . ? . ? . ? . ? . ? . ? . ? . ? . ? . ? .
 * . . ? . . . ? . . . ? . . . ? . . . ? . . . ? . .
 * Now the 2nd row takes "ERDSOEEFEAOC".
 * 
 * W . . . E . . . C . . . R . . . L . . . T . . . E
 * . E . R . D . S . O . E . E . F . E . A . O . C .
 * . . ? . . . ? . . . ? . . . ? . . . ? . . . ? . .
 * Leaving "AIVDEN" for the last row.
 * 
 * W . . . E . . . C . . . R . . . L . . . T . . . E
 * . E . R . D . S . O . E . E . F . E . A . O . C .
 * . . A . . . I . . . V . . . D . . . E . . . N . .
 * 
 * If you now read along the zig-zag shape you can read the original message.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 22, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class RailFenceCypher {
	
	/**
	 * 
	 */
	public RailFenceCypher() {
		super();
	}
	
	private String rowOne;
	private String rowTwo;
	private String rowThree;

	/**
	 * Loops the phrase and performs a Rail Fence Cypher
	 * @param phrase Phrase to be encoded 
	 * @return Rail Fence Cypher encoded phrase
	 */
	public String encodePhrase(String phrase) {
		if (phrase == null || phrase.isEmpty()) return "";
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = new StringBuilder();
	
		phrase = phrase.toUpperCase().replace(" ", "");
		int count = 0;
		one.append(phrase.charAt(count++));
		while (count < phrase.length()) {			
			two.append(phrase.charAt(count++));
			three.append(phrase.charAt(count++));
			two.append(phrase.charAt(count++));
			one.append(phrase.charAt(count++));
		}
		rowOne = one.toString();
		rowTwo = two.toString();
		rowThree = three.toString();
		
		return one.append(two).append(three).toString();
	}
	
	/**
	 * Returns the matrix of the phrase
	 * @param phrase Phrase ot encode into the matrix
	 * @return Matrix of the cypher
	 */
	public char[][] getMatrixFromPhrase(String phrase) {
		if (phrase == null || phrase.isEmpty()) return new char[0][];
		encodePhrase(phrase);
		
		System.out.println(rowOne);
		
		System.out.println(Arrays.toString(rowOneDots(rowOne)));
		
		
		return new char[0][];
	}
	
	private String[] rowOneDots(String phrase) {
		String[] dots = new String[phrase.length() * 3];
		
		for (int i = 0; i < dots.length; ++i) {
			dots[i] = phrase.charAt(i) + "";
			dots[i++] = ".";
			dots[i++] = ".";
			dots[i++] = ".";
		}
		return dots;
	}

}
