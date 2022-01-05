package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: SoundexConverter.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Soundex Converter Kata
 * Soundex is an algorithm used to categorize phonetically, such that two names 
 * that sound alike but are spelled differently have the same representation.
 * 
 * Soundex maps every name to a string consisting of one letter and three numbers, like M460.
 * 
 * One version of the algorithm is as follows:
 * 
 * Remove consecutive consonants with the same sound (for example, change ck -> c).
 * Keep the first letter. The remaining steps only apply to the rest of the string.
 * Remove all vowels, including y, w, and h.
 * Replace all consonants with the following digits:
 * 
 * b, f, p, v → 1
 * c, g, j, k, q, s, x, z → 2
 * d, t → 3
 * l → 4
 * m, n → 5
 * r → 6
 * 
 * If you don't have three numbers yet, append zeros until you do. Keep the first three numbers.
 * Using this scheme, Jackson and Jaxen both map to J250.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 3, 2022
 * @updates:
 ****************************************************************************/
public class SoundexConverter {
	
	/**
	 * Converts the word into a soundex word
	 * @param word Word to convert
	 * @return Soundex word.  Blank word if word is empty or contains numbers
	 */
	public String convert(String word) {
		return word;
	}
}
