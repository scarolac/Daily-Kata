package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: BinaryAsciiConverter.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Binary To ASCII Conversion
 * Create a function that takes a string of 1's and 0's (binary) as an argument 
 * and return the equivalent decoded ASCII text. Characters can be in the range of 
 * "00000000" to "11111111", which means every eight digits of binary input 
 * represents a single character.
 * 
 * a = 01100001
 * b = 01100010
 * c = 01100011
 * 
 * If you were to combine these characters into the string "abc", the corresponding 
 * binary would be 011000010110001001100011. Use the resources tab for more 
 * info on how to approach this.
 * 
 * Notes
 * If you are given an empty string as input, you must also return an empty string. 
 * Otherwise, the input will always be a valid binary string.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 1, 2021
 * @updates:
 ****************************************************************************/
public class BinaryAsciiConverter {

	/**
	 * 
	 */
	public BinaryAsciiConverter() {
		super();
	}

	/**
	 * Converts a long binary string into ascii characters
	 * @param binary
	 * @return
	 */
	public String convert(String binary) {
		if (binary == null || binary.length() % 8 != 0) return "";		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < binary.length(); i += 8) 
			result.append(stringToLetter(flipBits(binary.substring(i, i + 8))));
		
		return result.toString();
	}
	
	private String flipBits(String binary) {
		return new StringBuilder(binary).reverse().toString();
	}
	
	private Character stringToLetter(String letter) {
		int sum = 0;
		for (int j = 0; j < letter.length(); ++j) {				
			sum += Integer.parseInt(letter.charAt(j) +"") * Math.pow(2, j);			
		}
		
		return (char)sum;
	}
}
